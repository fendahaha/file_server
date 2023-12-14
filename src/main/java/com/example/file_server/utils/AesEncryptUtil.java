package com.example.file_server.utils;


import org.apache.commons.codec.binary.Base64;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class AesEncryptUtil {
    private static final String SECRET_KEY = "EB4QHUgFuiU5huMyAWjQVQ==";
    private static final SecretKeySpec KEY = new SecretKeySpec(Base64.decodeBase64(SECRET_KEY), "AES");
    //参数分别代表 算法名称/加密模式/数据填充方式
    private static final String ALGORITHMSTR = "AES/ECB/PKCS5Padding";

    public static SecretKey generateKey(int keySize) throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(keySize); // 128, 192, or 256
        return keyGenerator.generateKey();
    }

    public static String generateKeyBase64(int keySize) throws NoSuchAlgorithmException {
        SecretKey secretKey = generateKey(keySize);
        return Base64.encodeBase64String(secretKey.getEncoded());
    }

    public static String encrypt(String content) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
        cipher.init(Cipher.ENCRYPT_MODE, KEY);
        byte[] b = cipher.doFinal(content.getBytes("utf-8"));
        // 采用base64算法进行转码,避免出现中文乱码
        return Base64.encodeBase64String(b);
    }

    public static String decrypt(String encryptStr) throws NoSuchAlgorithmException, NoSuchPaddingException,
            InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
        cipher.init(Cipher.DECRYPT_MODE, KEY);
        // 采用base64算法进行转码,避免出现中文乱码
        byte[] decryptBytes = cipher.doFinal(Base64.decodeBase64(encryptStr));
        return new String(decryptBytes);
    }
}
