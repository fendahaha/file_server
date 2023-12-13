package com.example.file_server;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.type.MapType;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) throws JsonProcessingException {
        test3();
    }

    static void test1() throws JsonProcessingException {
        People people = new People();
        people.setName("fenda");
        people.setAge(12);
        people.setAge_a(23);
        people.setDate(new Date());
        people.setOld(true);
        people.setOld2(true);

        ObjectMapper mapper = new ObjectMapper();
        //在反序列化时忽略在 json 中存在但 Java 对象不存在的属性
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        //在序列化时日期格式默认为 yyyy-MM-dd'T'HH:mm:ss.SSSZ
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        //在序列化时自定义时间日期格式
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        //在序列化时忽略值为 null 的属性
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        //在序列化时忽略值为默认值的属性
        mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
        String s = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(people);
        System.out.println(s);

        String s3 = "{\n" +
                "\"name\" : \"fenda\"," +
                "\"age\" : 12," +
                "\"age_a\" : 23," +
                "\"date\" : \"2023-12-13 20:54:30\"," +
                "\"old\" : true," +
                "\"old2\" : true" +
                "}";
//        People people1 = mapper.readValue(s3, People.class);
//        System.out.println(people1);
    }

    static void test2() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        //第二参数是 map 的 key 的类型，第三参数是 map 的 value 的类型
        MapType javaType = mapper.getTypeFactory().constructMapType(HashMap.class, String.class, People.class);
        // 造数据
        Map<String, People> map = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            People person = new People();
            person.setName("fd" + i);
            person.setAge(i);
            person.setAge_a(i);
            person.setDate(new Date());
            person.setOld(true);
            map.put("key" + i, person);
        }
        System.out.println("序列化");
        String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
        System.out.println(jsonInString);
        System.out.println("反序列化: 使用 javaType");
        Map<String, People> personMap = mapper.readValue(jsonInString, javaType);
        System.out.println(personMap);
        System.out.println("反序列化: 使用 TypeReference");
        Map<String, People> personMap2 = mapper.readValue(jsonInString, new TypeReference<Map<String, People>>() {
        });
        System.out.println(personMap2);
    }

    static void test3() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//        mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);

        //第二参数是 map 的 key 的类型，第三参数是 map 的 value 的类型
        MapType javaType = mapper.getTypeFactory().constructMapType(HashMap.class, String.class, Object.class);
        // 造数据
        Map<String, Object> map = new HashMap<>();
        map.put("key", null);
        map.put("index", 0);
        map.put("haha", false);
        People person = new People();
        person.setName("fd1");
//        person.setAge(1);
        person.setAge_a(1);
        person.setDate(new Date());
//        person.setOld(true);
        map.put("key1", person);

        System.out.println("序列化");
        String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
        System.out.println(jsonInString);
        System.out.println("反序列化: 使用 javaType");
        Map<String, People> personMap = mapper.readValue(jsonInString, javaType);
        System.out.println(personMap);
        System.out.println("反序列化: 使用 TypeReference");
        Map<String, Object> personMap2 = mapper.readValue(jsonInString, new TypeReference<Map<String, Object>>() {
        });
        System.out.println(personMap2);
    }

    static class People {
        String name;
        int age;
        Integer age_a;
        Date date;
        boolean old;
        Boolean old2;

        @Override
        public String toString() {
            return "People{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", age_a=" + age_a +
                    ", date=" + date +
                    ", old=" + old +
                    ", old2=" + old2 +
                    '}';
        }

        public People() {
        }

        public boolean isOld() {
            return old;
        }

        public void setOld(boolean old) {
            this.old = old;
        }

        public Boolean getOld2() {
            return old2;
        }

        public void setOld2(Boolean old2) {
            this.old2 = old2;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Integer getAge_a() {
            return age_a;
        }

        public void setAge_a(Integer age_a) {
            this.age_a = age_a;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }
    }
}
