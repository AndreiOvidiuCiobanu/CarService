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
            int km = 0;
            try {
                km = Integer.parseInt(values[2].trim());
            } catch (NumberFormatException exc) {
                exc.printStackTrace();
            }

            int duration = 0;
            try {
                duration = Integer.parseInt(values[3].trim());
            } catch (NumberFormatException exc) {
                exc.printStackTrace();
            }

            electric = new Electric(Boolean.parseBoolean(values[0]), Boolean.parseBoolean(values[1]),
                    km, duration);
            lineNumberReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return electric;
    }
}
