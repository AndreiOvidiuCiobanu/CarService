package com.fmi.project.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class ServiceDieselDB extends ConnectionDB {
    private static ServiceDieselDB ourInstance = new ServiceDieselDB();

    public static ServiceDieselDB getInstance() {
        return ourInstance;
    }


    private ServiceDieselDB() {
    }

    public void insertDieselCarDB() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("INSERT may have problems : ");
        String prob = br.readLine();
        System.out.println("INSERT may be forbidden : ");
        String forb = br.readLine();
        System.out.println("INSERT number of turbines : ");
        String turb = br.readLine();
        Boolean first, sec;
        Integer third;

        first = Boolean.parseBoolean(prob);
        sec = Boolean.parseBoolean(forb);
        third = Integer.parseInt(turb);

        try {
            Statement statement = ServiceDieselDB.getInstance().getConnection().createStatement();
            statement.execute("insert into diesels(mayHaveProblems, mayBeForbiddent, numberOfTurbines) " +
                    "values ("+prob+", '"+forb+"', '"+turb+"')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertDieselCarDB(Integer prob, Integer forb, Integer turb) throws IOException {

        try {
            Statement statement = ServiceDieselDB.getInstance().getConnection().createStatement();
            statement.execute("insert into diesels(mayHaveProblems, mayBeForbiddent, numberOfTurbines)" +
                    "values ("+prob+", '"+forb+"', '"+turb+"')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void readDieselsBD() throws SQLException {
        ResultSet resultSet = ServiceDieselDB.getInstance().getStatement().executeQuery
                (" select * from diesels");


        ResultSetMetaData resultSetMetaData = (ResultSetMetaData) resultSet.getMetaData();

        while (resultSet.next()) {
            System.out.println("id=" + resultSet.getInt(1)
                    + ", have problems=" + resultSet.getString(2)
                    + ", is forbidden=" + resultSet.getString(3)
                    + ", turbines=" + resultSet.getString(4));
        }
    }

    public void updateDieselsBDById() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Id = ?");
        String id = br.readLine();
        System.out.println("INSERT may have problems : ");
        String prob = br.readLine();
        System.out.println("INSERT may be forbidden : ");
        String forb = br.readLine();
        System.out.println("INSERT number of turbines : ");
        String turb = br.readLine();
        Boolean first, sec;
        Integer id1, third;

        id1 = Integer.parseInt(id);
        first = Boolean.parseBoolean(prob);
        sec = Boolean.parseBoolean(forb);
        third = Integer.parseInt(turb);

        String sql = "update diesels set mayHaveProblems = ?, mayBeForbiddent = ?, numberOfTurbines = ?" +
                " where id="+id;
        try {
            PreparedStatement pst = ServiceDieselDB.getInstance().getConnection().prepareStatement(sql);
            // parameter index marcheaza datele aflate dupa set
            //, nu coloanele din tabel
            pst.setBoolean(1, first);
            pst.setBoolean(2, sec);
            pst.setInt(3, third);
            pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateDieselsBDById(int id) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Id = ?");
        //String id = br.readLine();
        System.out.println("INSERT may have problems : ");
        String prob = br.readLine();
        System.out.println("INSERT may be forbidden : ");
        String forb = br.readLine();
        System.out.println("INSERT number of turbines : ");
        String turb = br.readLine();
        Boolean first, sec;
        Integer id1, third;

        //id1 = Integer.parseInt(id);
        first = Boolean.parseBoolean(prob);
        sec = Boolean.parseBoolean(forb);
        third = Integer.parseInt(turb);

        String sql = "update diesels set mayHaveProblems = ?, mayBeForbiddent = ?, numberOfTurbines = ?" +
                " where id="+id;
        try {
            PreparedStatement pst = ServiceDieselDB.getInstance().getConnection().prepareStatement(sql);
            // parameter index marcheaza datele aflate dupa set
            //, nu coloanele din tabel
            pst.setBoolean(1, first);
            pst.setBoolean(2, sec);
            pst.setInt(3, third);
            pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteDieselsBDByid() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("DELETE  Diesel car with id = ");
        String id = br.readLine();
        Integer id2 = Integer.parseInt(id);

        String sql = "delete from diesels where id=?";
        try {
            PreparedStatement pst = ServiceDieselDB.getInstance().getConnection().prepareStatement(sql);

            pst.setInt(1, id2);
            pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteDieselsBDByid(int id) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("DELETE  Diesel car with id = ");
        //String id = br.readLine();
        //Integer id2 = Integer.parseInt(id);

        String sql = "delete from diesels where id=?";
        try {
            PreparedStatement pst = ServiceDieselDB.getInstance().getConnection().prepareStatement(sql);

            pst.setInt(1, id);
            pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
