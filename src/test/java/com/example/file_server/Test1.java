package com.example.file_server;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test1 {
    public static void main(String[] args) throws IOException {
        String s = ".-阿达asd.png";
        String s1 = s.replaceAll("[~`!@#$%^&*()]", "_");
        System.out.println(s1);
    }
}
