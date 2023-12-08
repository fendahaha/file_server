package com.example.file_server.service.impl;

import com.example.file_server.config.FileUploadConfiguration;
import com.example.file_server.entity.UploadFile;
import com.example.file_server.entity.UploadFileExample;
import com.example.file_server.form.FileDeleteForm;
import com.example.file_server.form.FileSearchForm;
import com.example.file_server.form.FileUploadForm;
import com.example.file_server.mapper.UploadFileMapper;
import com.example.file_server.service.UploadFileService;
import com.example.file_server.utils.FileUploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

@Service
public class UploadFileServiceImpl implements UploadFileService {

    @Autowired
    private UploadFileMapper uploadFileMapper;

    @Autowired
    private FileUploadConfiguration fileUploadConfiguration;

    public List<UploadFile> list() {
        UploadFileExample example = new UploadFileExample();
        example.setOrderByClause("file_upload_date desc");
        UploadFileExample.Criteria criteria = example.createCriteria();
        List<UploadFile> uploadFiles = uploadFileMapper.selectByExample(example);
        return uploadFiles;
    }

    public Path getFileRelativePath(String filename, String category) {
        if (Objects.isNull(category)) {
            return Paths.get(filename);
        }
        return Paths.get(category, filename);
    }

    public HashMap<String, Object> upload(FileUploadForm fileUploadForm) {
        Path file_root_path = fileUploadConfiguration.getFileRootPath();

        Date date = new Date();
        String tags = fileUploadForm.getTags();
        String category = fileUploadForm.getCategory();
        MultipartFile[] files = fileUploadForm.getFile();

        HashMap<String, Object> resultMap = new HashMap<>();
        for (MultipartFile file : files) {
            resultMap.put(file.getOriginalFilename(), false);
            try {
                String originalFilename = file.getOriginalFilename();
                String unique_name = FileUploadUtil.generate_unique_name(originalFilename, date);
                long fileSize = file.getSize();
                String contentType = file.getContentType();
                Path fileRelativePath = getFileRelativePath(unique_name, category);
                Path fileAbsolutePath = file_root_path.resolve(fileRelativePath);
                FileUploadUtil.createPathIfNotExist(fileAbsolutePath.toString());

                UploadFile uploadFile = new UploadFile();
                uploadFile.setFileOriginalName(originalFilename);
                uploadFile.setFileUniqueName(unique_name);
                uploadFile.setFileType(contentType);
                uploadFile.setFileSize(fileSize);
                uploadFile.setFilePath(fileRelativePath.toString());
                uploadFile.setFileUploadDate(date);
                uploadFile.setFileTags(tags);
                uploadFile.setFileCategory(category);

                file.transferTo(fileAbsolutePath.toFile());
                int i = uploadFileMapper.insertSelective(uploadFile);
                if (i > 0) {
                    resultMap.put(file.getOriginalFilename(), uploadFile);
                } else {
                    FileUploadUtil.deleteFile(fileAbsolutePath.toString());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return resultMap;
    }

    public UploadFileExample uniqueNamesQuery(List<String> file_unique_names) {
        UploadFileExample example = new UploadFileExample();
        UploadFileExample.Criteria criteria = example.createCriteria();
        criteria.andFileUniqueNameIn(file_unique_names);
        return example;
    }

    public UploadFileExample tagsQuery(List<String> tags) {
        UploadFileExample example = new UploadFileExample();
        UploadFileExample.Criteria criteria = example.createCriteria();
        criteria.andFileTagsIn(tags);
        return example;
    }

    public UploadFileExample categorysQuery(List<String> categorys) {
        UploadFileExample example = new UploadFileExample();
        UploadFileExample.Criteria criteria = example.createCriteria();
        criteria.andFileCategoryIn(categorys);
        return example;
    }

    public int delete(UploadFileExample example) {
        List<UploadFile> uploadFiles = uploadFileMapper.selectByExample(example);
        int i = uploadFileMapper.deleteByExample(example);

        Path fileRootPath = fileUploadConfiguration.getFileRootPath();
        uploadFiles.forEach(f -> {
            System.out.println("filePath: " + f.getFilePath());
            Path resolve = fileRootPath.resolve(f.getFilePath());
            System.out.println(resolve.toString());
            FileUploadUtil.deleteFile(resolve.toString());
        });
        return i;
    }

    public int deleteByUniqueNames(List<String> file_unique_names) {
        UploadFileExample example = uniqueNamesQuery(file_unique_names);
        return delete(example);
    }

    public int deleteByTags(List<String> fileTags) {
        UploadFileExample example = tagsQuery(fileTags);
        return delete(example);
    }

    public int deleteByCategorys(List<String> fileCategorys) {
        UploadFileExample example = categorysQuery(fileCategorys);
        return delete(example);
    }

    public int delete_auto(FileDeleteForm fileDeleteForm) {
        List<String> fileUniqueNames = fileDeleteForm.getFileUniqueNames();
        if (!Objects.isNull(fileUniqueNames)) {
            return deleteByUniqueNames(fileUniqueNames);
        }

        List<String> fileCategorys = fileDeleteForm.getFileCategorys();
        if (!Objects.isNull(fileCategorys)) {
            return deleteByCategorys(fileCategorys);
        }

        List<String> fileTags = fileDeleteForm.getFileTags();
        if (!Objects.isNull(fileTags)) {
            return deleteByTags(fileTags);
        }
        return 0;
    }

    public List<UploadFile> query(FileSearchForm form) {
        UploadFileExample example = new UploadFileExample();
        example.createCriteria()
                .andFileUniqueNameEqualTo(form.getFileUniqueName())
                .andFileTypeEqualTo(form.getFileType())
                .andFilePathEqualTo(form.getFilePath())
                .andFileTagsEqualTo(form.getFileTags())
                .andFileCategoryEqualTo(form.getFileCategory());
        List<UploadFile> uploadFiles = uploadFileMapper.selectByExample(example);
        return uploadFiles;
    }
}
