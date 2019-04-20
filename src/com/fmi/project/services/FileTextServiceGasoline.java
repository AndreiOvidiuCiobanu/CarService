package com.fmi.project.services;

import com.fmi.project.fuel.Gasoline;

import java.io.*;

public class FileTextServiceGasoline {
    private static FileTextServiceGasoline ourInstance = new FileTextServiceGasoline();

    private FileTextServiceGasoline() {
    }

    public static FileTextServiceGasoline getInstance() {
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
    public Gasoline readGasolineFromFile(String fileNamePath) {
        Gasoline gasoline = null;
        try {

            LineNumberReader lineNumberReader = new LineNumberReader(
                    new FileReader(fileNamePath));

            String line = lineNumberReader.readLine();
            String[] values = line.split(",");
            gasoline = new Gasoline(Boolean.parseBoolean(values[0]), Boolean.parseBoolean(values[1]),
                    values[2]);
            lineNumberReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gasoline;
    }
}
