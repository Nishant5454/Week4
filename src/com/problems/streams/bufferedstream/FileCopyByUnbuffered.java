package com.streams.bufferedstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyByUnbuffered {
    // method to copy file by unbuffered
    public void copyFile(String sourceFile, String destinationFile) {
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {
            byte[] bytes = new byte[4096];
            int byteRead;
            while ((byteRead = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, byteRead);
            }

        } catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}
