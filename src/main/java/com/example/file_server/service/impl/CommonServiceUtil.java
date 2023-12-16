package com.example.file_server.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class CommonServiceUtil {
    public static <T, S> HashMap<String, Object> listPage(S mapper, T example, int pageNum, int pageSize) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("example", example);
        int start = (pageNum - 1) * pageSize;
        hashMap.put("pageStart", start);
        hashMap.put("pageLimit", pageSize);
        try {
            Class<?> mapperClass = mapper.getClass();
            Method selectByExample2 = mapperClass.getMethod("selectByExample2", hashMap.getClass());
            Object list = selectByExample2.invoke(mapper, hashMap);
            Method countByExample = mapperClass.getMethod("countByExample", example.getClass());
            Object total = countByExample.invoke(mapper, example);

            HashMap<String, Object> map = new HashMap<>();
            map.put("list", list);
            map.put("total", total);
            return map;
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
