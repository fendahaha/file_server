package com.example.file_server.utils;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UrlUtil {
    public static HashMap<String, String> extractFromQueryString(String s) {
        HashMap<String, String> map = new HashMap<>();
        String[] split = s.split("&");
        Arrays.stream(split).forEach((e) -> {
            String[] split1 = e.split("=");
            String k = URLDecoder.decode(split1[0], StandardCharsets.UTF_8);
            String v = URLDecoder.decode(split1[1], StandardCharsets.UTF_8);
            map.put(k, v);
        });
        return map;
    }

    public static String convertToQueryString(HashMap<String, String> params) {
        StringBuilder queryString = new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (!queryString.isEmpty()) {
                queryString.append("&");
            }
            queryString.append(URLEncoder.encode(entry.getKey(), StandardCharsets.UTF_8))
                    .append("=")
                    .append(URLEncoder.encode(entry.getValue(), StandardCharsets.UTF_8));
        }
        return queryString.toString();
    }
}
