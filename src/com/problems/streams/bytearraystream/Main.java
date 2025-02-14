package com.streams.bytearraystream;

import java.io.IOException;

public class Main {
    // method calling
    public static void main(String[] args) {
        String inputImagePath = "screenshot.png";
        String outputImagePath = "blank.jpg";

        try {
            byte[] imageData = ImageConverter.convertImageToByteArray(inputImagePath);
            ImageConverter.writeByteArrayToImage(imageData, outputImagePath);
            System.out.println("Image has been successfully written to: " + outputImagePath);
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
