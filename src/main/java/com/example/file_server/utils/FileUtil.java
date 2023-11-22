package com.example.file_server.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FileUtil {
    /**
     * 根据文件内容生成唯一哈希值
     */
    public static String generateSHA256(MultipartFile file) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        try (InputStream fis = file.getInputStream()) {
            byte[] bytesBuffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(bytesBuffer)) != -1) {
                digest.update(bytesBuffer, 0, bytesRead);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        byte[] hashedBytes = digest.digest();
        return bytesToHex(hashedBytes);
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    /**
     * 根据文件名和当前时间生成唯一哈希值
     */
    public static String generateUniqueId(String fileName) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodedhash = digest.digest(fileName.getBytes());
        return bytesToHex2(encodedhash);
    }

    private static String bytesToHex2(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    /**
     * 获取文件后缀
     */
    public static String getFileExtension(String filename) {
        return filename.substring(filename.lastIndexOf("."));
    }

    /**
     * 获取文件后缀和前缀，example: asd.png  result: "asd" ".png"
     */
    public static List<String> exactFilename(String filename) {
        int lastindex = filename.lastIndexOf(".");
        String prefix = "";
        String suffix = "";
        if (lastindex == -1) {
            prefix = filename;
        } else {
            prefix = filename.substring(0, lastindex);
            suffix = filename.substring(lastindex);
        }
        return Arrays.asList(prefix, suffix);
    }


    /**
     * 将文件名中的特殊字符转换为下划线"_"
     */
    public static String escapeSpecialChar() {
        return "";
    }
}
