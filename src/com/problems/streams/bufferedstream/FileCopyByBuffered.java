package com.streams.bufferedstream;

import java.io.*;

public class FileCopyByBuffered {
    // method to copy file via buffered
    public void copyFile(String sourceFile, String destinationFile) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile))) {

            byte[] buffer = new byte[4096];
            int byteRead;
            while ((byteRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, byteRead);
            }
        } catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}
