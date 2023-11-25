package com.example.file_server.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class FileUploadUtil {
    private static final Set<String> ALLOWED_FILE_TYPES = new HashSet<>();

    static {
        ALLOWED_FILE_TYPES.add("image/jpeg");
        ALLOWED_FILE_TYPES.add("image/png");
        // 添加其他允许的文件类型
    }

    public static Path createPathIfNotExist(String uploadpath) throws IOException {
        // 检查并创建保存目录
        Path path = Paths.get(uploadpath);
        if (!path.isAbsolute()) {
            path = Paths.get(System.getProperty("user.dir"), uploadpath);
        }
        if (!Files.exists(path)) {
            Files.createDirectories(path);
        }
        return path;
    }


    public static String generate_unique_name(String originalFilename, Date date) {
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(date);
        String file_extension = FileUtil.exactFilename(originalFilename).get(1);
        String unique_filename = timestamp + "_" + originalFilename;
        try {
            String unique_filename_hash = FileUtil.generateUniqueId(unique_filename);
            return unique_filename_hash + file_extension;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return unique_filename;
    }

    public static boolean upload_file(MultipartFile file, Path path) {
        // 检查文件类型
        /*if (!ALLOWED_FILE_TYPES.contains(file.getContentType())) {
            return "Invalid file type!";
        }*/
        try {
            // 生成哈希文件名
            String originalFilename = file.getOriginalFilename();
            String unique_name = generate_unique_name(originalFilename, new Date());
            Path filePath = path.resolve(unique_name);
            // 保存文件
            file.transferTo(filePath.toFile());
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
