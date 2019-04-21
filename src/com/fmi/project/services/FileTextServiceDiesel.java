package com.fmi.project.services;

import com.fmi.project.fuel.Diesel;

import java.io.*;

public class FileTextServiceDiesel {
    private static FileTextServiceDiesel ourInstance = new FileTextServiceDiesel();

    private FileTextServiceDiesel() {
    }

    public static FileTextServiceDiesel getInstance() {
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
    public Diesel readDieselFromFile(String fileNamePath) {
        Diesel diesel = null;
        try {

            LineNumberReader lineNumberReader = new LineNumberReader(
                    new FileReader(fileNamePath));

            String line = lineNumberReader.readLine();
            String[] values = line.split(",");
            //int numberOfTurbines = Integer.parseUnsignedInt(values[2]);

            int nr = 0;
            try {
                nr = Integer.parseInt(values[2].trim());
            } catch (NumberFormatException exc) {
                exc.printStackTrace();
            }

            diesel = new Diesel(Boolean.parseBoolean(values[0]), Boolean.parseBoolean(values[1]), nr);
            lineNumberReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return diesel;
    }
}
