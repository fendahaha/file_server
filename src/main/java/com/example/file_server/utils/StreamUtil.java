package com.example.file_server.utils;

import javax.swing.*;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class StreamUtil {

    public static void main(String[] args) throws Exception {
        generateStreamInfo();
    }

    public static String generateStreamInfo() throws Exception {
        long time = new Date().getTime();
        String streamId = UUIDUtil.generateUUID();
        HashMap<String, Object> map = new HashMap<>();
        map.put("time", time);
        map.put("room_uuid", "adada撒大大");
        String params = JsonUtil.map2Json(map);
        System.out.println(params);

        String encrypt = AesEncryptUtil.encrypt(params);
//        System.out.println(encrypt.length());
//        String decrypt = AesEncryptUtil.decrypt(encrypt);
//        System.out.println(decrypt);

        HashMap<String, String> params1 = new HashMap<>();
        params1.put("time", String.valueOf(time));
        params1.put("token", encrypt);

        String s = convertToQueryString(params1);
        System.out.println(s);

        verify(s);


        return "";
    }

    public static void verify(String s) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        String[] split = s.split("&");
        Arrays.stream(split).forEach((e) -> {
            String[] split1 = e.split("=");
            map.put(split1[0], split1[1]);
        });
        System.out.println(map.get("time"));
        String token = map.get("token");
        String decode = URLDecoder.decode(token, StandardCharsets.UTF_8);
        String decrypt = AesEncryptUtil.decrypt(decode);
        HashMap<String, Object> hashMap = JsonUtil.json2Map(decrypt);
        System.out.println(hashMap.get("time"));
        System.out.println(hashMap.get("room_uuid"));
    }

    public static String convertToQueryString(HashMap<String, String> params) {
        StringBuilder queryString = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                if (queryString.length() > 0) {
                    queryString.append("&");
                }
                queryString.append(URLEncoder.encode(entry.getKey(), StandardCharsets.UTF_8))
                        .append("=")
                        .append(URLEncoder.encode(entry.getValue(), StandardCharsets.UTF_8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return queryString.toString();
    }
}
