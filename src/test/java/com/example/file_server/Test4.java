package com.example.file_server;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Test4 {
    public static void main(String[] args) {
//        test1();
        HashMap<String, Object> map = new HashMap<>();
        map.put("a", "a");
        String a1 = (String) map.get("a1");
        System.out.println(a1);
    }

    public static void test1() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, -1);
        Date time = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(simpleDateFormat.format(time));
        System.out.println(simpleDateFormat.format(date));
    }
}
