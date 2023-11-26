package com.example.file_server.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
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

    public static Path getAbsolutePath(String filepath) {
        Path path = Paths.get(filepath);
        if (!path.isAbsolute()) {
            path = Paths.get(System.getProperty("user.dir"), filepath);
        }
        return path;
    }

    public static Path createPathIfNotExist(String uploadpath) throws IOException {
        // 检查并创建保存目录
        Path absolutePath = getAbsolutePath(uploadpath);
        if (!Files.exists(absolutePath)) {
            Files.createDirectories(absolutePath);
        }
        return absolutePath;
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

    public static void deleteFile(String filepath) {
        getAbsolutePath(filepath).toFile().deleteOnExit();
    }
}
