package com.streams.bufferedstream;

public class Main {
    // method calling
    public static void main(String[] args) {
        String sourceFile = "input.txt";
        String destinationFileBuffered = "destinationBuffered.txt";
        String destinationFileunbuffered = "destinationUnBuffered.txt";

        FileCopyByUnbuffered fcu = new FileCopyByUnbuffered();
        long startTime = System.nanoTime();
        fcu.copyFile(sourceFile, destinationFileunbuffered);
        long endTime = System.nanoTime();
        System.out.println("Time by unbuffered stream reader: " + (endTime - startTime) / 1e6 + "ms");

        FileCopyByBuffered fcb = new FileCopyByBuffered();
        startTime = System.nanoTime();
        fcb.copyFile(sourceFile, destinationFileBuffered);
        endTime = System.nanoTime();
        System.out.println("Time by buffered stream reader: " + (endTime - startTime) / 1e6 + "ms");
    }
}
