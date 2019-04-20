package com.fmi.project.services;

import com.fmi.project.fuel.Electric;

import java.io.*;

public class FileTextServiceElectric {
    private static FileTextServiceElectric ourInstance = new FileTextServiceElectric();

    private FileTextServiceElectric() {
    }

    public static FileTextServiceElectric getInstance() {
        return ourInstance;
    }

    public void writeTextToFile(String textToWrite, String fileNamePath) {

        try {
            PrintWriter printWriter = new PrintWriter(
                    new FileOutputStream(fileNamePath));

            printWriter.println(textToWrite);

            printWriter.flush();
            printWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param fileNamePath
     * @return
     */
    public Electric readElectricFromFile(String fileNamePath) {
        Electric electric = null;
        try {

            LineNumberReader lineNumberReader = new LineNumberReader(
                    new FileReader(fileNamePath));

            String line = lineNumberReader.readLine();
            String[] values = line.split(",");
            electric = new Electric(Boolean.parseBoolean(values[0]), Boolean.parseBoolean(values[1]),
                    Integer.parseInt(values[2]), Integer.parseInt(values[3]));
            lineNumberReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return electric;
    }
}
