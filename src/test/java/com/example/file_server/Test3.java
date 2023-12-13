package com.example.file_server;

import com.example.file_server.utils.AesEncryptUtil;
import com.example.file_server.utils.JsonUtil;
import com.example.file_server.utils.JwtUtil;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.HashMap;

public class Test3 {
    public static void main(String[] args) throws Exception {
//        m1();
        m2();
    }

    public static void m1() throws JsonProcessingException {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "adasd");
        map.put("uuid", "aksdhakjdhjkadskadsabdabdababjbdabsdasbdaasdad");
        map.put("age", 1231832);
        map.put("id", "asdaasdasdasdasdadasdadsasdaasadad");
        String s1 = JsonUtil.map2Json(map);

        String s = JwtUtil.generateToken(s1);
        System.out.println(s);

        HashMap<String, Object> hashMap = JwtUtil.validateTokenAndGetUsername(s);
        if (hashMap.get("code") == JwtUtil.JwtVerifyResultType.OK) {
            System.out.println(hashMap.get("data"));
        }
    }

    public static void m2() throws Exception {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "adasdaas大多数埃索达萨达");
        map.put("uuid", "aksdhakjdhjkadskadsabdabdababjbdabsdasbdaasdad");
//        map.put("age", 1231832);
//        map.put("id", "asdaasdasdasdasdadasdadsasdaasadad");
        String s1 = JsonUtil.map2Json(map);

//        String encrypt = EncryptionUtil.encrypt(s1);
//        System.out.println(encrypt);

//        SecretKey secretKey = AesEncryptUtils.generateKey(128);
//        byte[] encoded = secretKey.getEncoded();
//        String s = Base64.getEncoder().encodeToString(encoded);

//        String encrypt = AesEncryptUtils.encrypt(s1, secretKey);
//        System.out.println(encrypt);
//        String decrypt = AesEncryptUtils.decrypt(encrypt, secretKey);
//        System.out.println(decrypt);

//        String encrypt = AesEncryptUtils.encrypt2(s1, s);
//        System.out.println(encrypt);
//        String decrypt = AesEncryptUtils.decrypt2(encrypt, s);
//        System.out.println(decrypt);

        String encrypt2 = AesEncryptUtil.encrypt(s1);
        System.out.println(encrypt2);
        String decrypt2 = AesEncryptUtil.decrypt(encrypt2);
        System.out.println(decrypt2);
    }
}
