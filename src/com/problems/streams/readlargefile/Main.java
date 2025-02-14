package com.streams.readlargefile;

public class Main {
    // method calling
    public static void main(String[] args) {
        String fileName = "errordoc.txt";
        LargeFileReader object=new LargeFileReader();
        object.readLargeFiles(fileName);
    }
}