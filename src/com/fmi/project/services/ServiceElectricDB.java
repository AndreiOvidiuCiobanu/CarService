package com.fmi.project.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class ServiceElectricDB extends  ConnectionDB{
    private static ServiceElectricDB ourInstance = new ServiceElectricDB();

    public static ServiceElectricDB getInstance() {
        return ourInstance;
    }

    private ServiceElectricDB() {
    }

    public void insertElectricCarDB() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("INSERT may have problems : ");
        String prob = br.readLine();
        System.out.println("INSERT may be forbidden : ");
        String forb = br.readLine();
        System.out.println("INSERT number of kilometes autonomy : ");
        String km = br.readLine();
        System.out.println("INSERT number of duration for fully charged : ");
        String dur = br.readLine();
        Boolean first, sec;
        Integer third, fourth;

        first = Boolean.parseBoolean(prob);
        sec = Boolean.parseBoolean(forb);
        third = Integer.parseInt(km);
        fourth = Integer.parseInt(dur);

        try {
            Statement statement = ServiceElectricDB.getInstance().getConnection().createStatement();
            statement.execute
                    ("insert into electrics(mayHaveProblems, mayBeForbidden, numberOfKilometesAutonomy, " +
                    " durationForFullyCharged) " +
                    "values ("+prob+", '"+forb+"', '"+km+"','"+dur+"')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void readElectricsBD() throws SQLException {
        ResultSet resultSet = ServiceElectricDB.getInstance().getStatement()
                .executeQuery(" select * from electrics");


        ResultSetMetaData resultSetMetaData = (ResultSetMetaData) resultSet.getMetaData();

        while (resultSet.next()) {
            System.out.println("id=" + resultSet.getInt(1)
                    + ", have problems=" + resultSet.getString(2)
                    + ", is forbidden=" + resultSet.getString(3)
                    + ", km" + resultSet.getString(4)
                    + ", duration" + resultSet.getString(5));
        }
    }

    public void updateElectricsBDById() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Id = ?");
        String id = br.readLine();
        System.out.println("INSERT may have problems : ");
        String prob = br.readLine();
        System.out.println("INSERT may be forbidden : ");
        String forb = br.readLine();
        System.out.println("INSERT number of km : ");
        String km = br.readLine();
        System.out.println("INSERT duration : ");
        String dur = br.readLine();
        Boolean first, sec;
        Integer id1, third, fourth;

        id1 = Integer.parseInt(id);
        first = Boolean.parseBoolean(prob);
        sec = Boolean.parseBoolean(forb);
        third = Integer.parseInt(km);
        fourth = Integer.parseInt(dur);

        String sql = "update electrics set mayHaveProblems = ?, mayBeForbidden = ?, numberOfKilometesAutonomy = ?," +
                "durationForFullyCharged = ?" +
                " where id="+id1;
        try {
            PreparedStatement pst = ServiceElectricDB.getInstance().getConnection().prepareStatement(sql);
            // parameter index marcheaza datele aflate dupa set
            //, nu coloanele din tabel
            pst.setBoolean(1, first);
            pst.setBoolean(2, sec);
            pst.setInt(3, third);
            pst.setInt(4,fourth);
            pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteElectricsBDByid() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("DELETE  Electric car with id = ");
        String id = br.readLine();
        Integer id2 = Integer.parseInt(id);

        String sql = "delete from electrics where id=?";
        try {
            PreparedStatement pst = ServiceElectricDB.getInstance().getConnection().prepareStatement(sql);

            pst.setInt(1, id2);
            pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
