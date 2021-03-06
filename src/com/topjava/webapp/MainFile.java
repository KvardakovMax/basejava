package com.topjava.webapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MainFile {
    public static void main(String[] args) {
        String filePath = ".\\.gitignore";

        File file = new File(".\\.gitignore");
        try {
            System.out.println(file.getCanonicalFile());
        } catch (IOException e) {
            throw new RuntimeException("Error", e);
        }
        File dir = new File("./src/com/topjava/webapp");
        System.out.println(dir.isDirectory());
        String[] list = dir.list();
        if (list != null) {
            for (String name : list) {
                System.out.println(name);
            }
        }

        try {
            FileInputStream fis = new FileInputStream(filePath);
            System.out.println(fis.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        printAllFilesAndDirectory(dir);
    }

    public static void printAllFilesAndDirectory(File directory) {
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println("  File: " + file.getName());
                } else if (file.isDirectory()) {
                    System.out.println("Directory " + file.getName());
                    printAllFilesAndDirectory(file);
                }
            }
        }
    }
}
