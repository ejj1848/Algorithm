package com.company;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class CopyFiles {

    public static void main(String[] args) throws Exception {
        Path src = Paths.get("C:\\Users\\eric.johnson\\Desktop\\AWS Cert Stuff");
        Path dest = Paths.get("C:\\Users\\eric.johnson\\Desktop\\part0");

        copyFolder(src, dest);

    }

    public static void copyFolder(Path src, Path dest) throws IOException {

       Files.walk(src)
                .forEach(fle -> copy(fle, dest.resolve(src.relativize(fle))));

    }

    private static void copy(Path source, Path dest) {
        try {
            Files.copy(source, dest, REPLACE_EXISTING);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
