package com.limao.jvm.demo.tookit;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Optional;

public class RenameFile {
    public static void main(String[] args) {
        String path = "D:\\jerry\\onedrive\\notes\\Java_officer_books";
        File f = new File(path);
        Optional<File[]> files = Optional.ofNullable(f.listFiles());
        files.ifPresent(file -> Arrays.stream(file).forEach(a -> {
            System.out.println(a.getName());
            String fileName = a.getName().split("\\.")[0];
            LocalDateTime localDateTime = LocalDateTime.now();
            System.out.println(a.renameTo(new File(a.getParentFile(),
                    fileName + "_" + localDateTime.getYear() + "-"
                            + localDateTime.getMonthValue() + "-" + localDateTime.getDayOfMonth() + ".pdf")));
        }));

    }
}
