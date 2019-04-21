package com.fmi.project.services;

import com.fmi.project.fuel.Hybrid;

import java.io.*;

public class FileTextServiceHybrid {
    private static FileTextServiceHybrid ourInstance = new FileTextServiceHybrid();

    private FileTextServiceHybrid() {
    }

    public static FileTextServiceHybrid getInstance() {
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
    public Hybrid readHybridFromFile(String fileNamePath) {
        Hybrid hybrid = null;
        try {

            LineNumberReader lineNumberReader = new LineNumberReader(
                    new FileReader(fileNamePath));

            String line = lineNumberReader.readLine();
            String[] values = line.split(",");
            int nr = 0;
            try {
                nr = Integer.parseInt(values[2].trim());
            } catch (NumberFormatException exc) {
                exc.printStackTrace();
            }
            hybrid = new Hybrid(Boolean.parseBoolean(values[0]), Boolean.parseBoolean(values[1]), nr);
            lineNumberReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hybrid;
    }
}
