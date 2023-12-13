package com.example.file_server.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    static {
        //在反序列化时忽略在 json 中存在但 Java 对象不存在的属性
        OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        //在序列化时日期格式默认为 yyyy-MM-dd'T'HH:mm:ss.SSSZ
//        OBJECT_MAPPER.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        //在序列化时自定义时间日期格式
//        OBJECT_MAPPER.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        //在序列化时忽略值为 null 的属性
//        OBJECT_MAPPER.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        //在序列化时忽略值为默认值的属性
        OBJECT_MAPPER.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
    }

}
