package com.problems.Exception.AutoClose;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class autoClose {
    public static void main(String[] args) {
        readFile("info.txt");
    }

    private static void readFile(String path) {
        try(BufferedReader br=new BufferedReader(new FileReader(path))){
            System.out.println(br.readLine());
        }
        catch (IOException e){
            System.out.println("Error Reading file");
        }
    }
}
