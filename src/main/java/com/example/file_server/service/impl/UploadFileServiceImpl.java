package com.example.file_server.service.impl;

import com.example.file_server.entity.UploadFile;
import com.example.file_server.entity.UploadFileExample;
import com.example.file_server.mapper.UploadFileMapper;
import com.example.file_server.service.UploadFileService;
import com.example.file_server.utils.FileUploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class UploadFileServiceImpl implements UploadFileService {

    @Autowired
    private UploadFileMapper uploadFileMapper;

    @Autowired
    private FileUploadUtil fileUploadUtil;

    public List<UploadFile> list() {
        UploadFileExample example = new UploadFileExample();
        example.setOrderByClause("file_upload_date desc");
        UploadFileExample.Criteria criteria = example.createCriteria();
        List<UploadFile> uploadFiles = uploadFileMapper.selectByExample(example);
        return uploadFiles;
    }

    public HashMap<String, Object> upload(MultipartFile[] files) throws IOException {
        Date date = new Date();
        Path path = fileUploadUtil.createPathIfNotExist(fileUploadUtil.getUploadpath());

        HashMap<String, Object> resultMap = new HashMap<>();
        for (MultipartFile file : files) {
            resultMap.put(file.getOriginalFilename(), false);
            try {
                String originalFilename = file.getOriginalFilename();
                String unique_name = fileUploadUtil.generate_unique_name(originalFilename, date);
                long fileSize = file.getSize();
                String contentType = file.getContentType();
                Path filepath = Paths.get(unique_name);
                Path save_path = path.resolve(filepath);

                UploadFile uploadFile = new UploadFile();
                uploadFile.setFileOriginalName(originalFilename);
                uploadFile.setFileUniqueName(unique_name);
                uploadFile.setFileType(contentType);
                uploadFile.setFileSize(fileSize);
                uploadFile.setFilePath(filepath.toString());
                uploadFile.setFileUploadDate(date);

                file.transferTo(save_path.toFile());
                int i = uploadFileMapper.insertSelective(uploadFile);
                if (i > 0) {
                    resultMap.put(file.getOriginalFilename(), uploadFile);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return resultMap;
    }


    public int deleteByUniqueNames(String[] file_unique_names) {
        UploadFileExample example = new UploadFileExample();
        UploadFileExample.Criteria criteria = example.createCriteria();
        criteria.andFileUniqueNameIn(Arrays.stream(file_unique_names).toList());
        return uploadFileMapper.deleteByExample(example);
    }
}
