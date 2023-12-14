package com.example.file_server.utils;

import com.fasterxml.jackson.core.JsonProcessingException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;

public class StreamUtil {

//    public static void main(String[] args) throws Exception {
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("uuid", UUIDUtil.generateUUID());
//
//        String params = generateStreamParams(map);
//
//        HashMap<String, Object> verify = verifyStreamParams(params);
//        if (verify != null) {
//            System.out.println(verify.get("uuid"));
//        }
//    }

    public static String generateStreamParams2(HashMap<String, Object> hashmap) throws Exception {
        long time = new Date().getTime();
        HashMap<String, Object> data = new HashMap<>();
        data.put("time", time);
        data.putAll(hashmap);

        HashMap<String, String> params = new HashMap<>();
        params.put("time", String.valueOf(time));
        params.put("token", AesEncryptUtil.encrypt(JsonUtil.map2Json(data)));

        return UrlUtil.convertToQueryString(params);
    }

    public static HashMap<String, Object> verifyStreamParams2(String s) {
        HashMap<String, String> params = UrlUtil.extractFromQueryString(s);
        Long time = Long.valueOf(params.get("time"));
        HashMap<String, Object> data;
        try {
            String decrypt = AesEncryptUtil.decrypt(params.get("token"));
            data = JsonUtil.json2Map(decrypt);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException ex) {
            ex.printStackTrace();
            throw new RuntimeException("解密程序异常");
        } catch (IllegalBlockSizeException | BadPaddingException | JsonProcessingException ex) {
            ex.printStackTrace();
            throw new RuntimeException("stream参数不合法");
        }
        Long time1 = (Long) data.get("time");
        if (!time.equals(time1)) {
            throw new RuntimeException("stream参数不合法");
        }
        return data;
    }

    public static String generateStreamParams(HashMap<String, String> d) throws Exception {
        long time = new Date().getTime();
        HashMap<String, String> data = new HashMap<>();
        data.put("time", String.valueOf(time));
        data.putAll(d);

        return UrlUtil.convertToQueryString(data);
    }

    public static HashMap<String, Object> verifyStreamParams(String s) {
        HashMap<String, String> params = UrlUtil.extractFromQueryString(s);
        String token = params.get("token");
        if (token == null) {
            throw new RuntimeException("stream参数不合法");
        }
        HashMap<String, Object> data;
        try {
            data = JsonUtil.json2Map(token);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
            throw new RuntimeException("stream参数不合法");
        }
        return data;
    }
}
