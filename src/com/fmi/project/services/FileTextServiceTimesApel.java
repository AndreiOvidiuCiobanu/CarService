package com.fmi.project.services;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FileTextServiceTimesApel {
    private static FileTextServiceTimesApel ourInstance = new FileTextServiceTimesApel();

    private FileTextServiceTimesApel() {
    }

    public static FileTextServiceTimesApel getInstance() {
        return ourInstance;
    }

    public void writeTextToFile(String textToWrite, String fileNamePath) {

        try {
            PrintWriter printWriter = new PrintWriter(
                    new FileOutputStream(fileNamePath, true));

            printWriter.println(textToWrite);

            printWriter.flush();
            printWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
