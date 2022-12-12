package model;

import database.JDBCUtil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MotorbikeManager {

    //Variables
    private List<Motorbike> listOfMotorbikes;
    private String fileName;

    //Constructor
    public MotorbikeManager() {
        this.listOfMotorbikes = getMotorbikesFromDatabase();
        this.fileName = "";
    }

    //Getter and Setter
    public List<Motorbike> getListOfMotorbikes() {
        return listOfMotorbikes;
    }

    public void setListOfMotorbikes(List<Motorbike> listOfMotorbikes) {
        this.listOfMotorbikes = listOfMotorbikes;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    //Add a motorbike
    public boolean addMotorbike(Motorbike motorbike) {
        if (!this.listOfMotorbikes.contains(motorbike)) {
            
            this.listOfMotorbikes.add(motorbike);
            this.listOfMotorbikes.sort((s1, s2) -> s1.getMotorbikeID() - s2.getMotorbikeID());
            
            try {
                Connection con = JDBCUtil.getConnection();

                Statement st = con.createStatement();

                String sql = "INSERT INTO motorbikes (ID, name, country, cc, yearOfProduction, price, imagePath) "
                        + " VALUES ('"
                        + motorbike.getMotorbikeID() + "', '"
                        + motorbike.getName() + "','"
                        + motorbike.getCountry() + "','"
                        + motorbike.getCc() + "','"
                        + motorbike.getYearOfProduction() + "','"
                        + motorbike.getPrice() + "','"
                        + motorbike.getImagePath() + "')";
                st.executeUpdate(sql);

                JDBCUtil.closeConnection(con);
            } catch (SQLException e) {
            }
            return true;
        }
        return false;
    }

    //Delete a motorbike
    public boolean deleteMotorbike(int id) {
        for (Motorbike motorbike : listOfMotorbikes) {
            if (motorbike.getMotorbikeID() - id == 0) {
                
                this.listOfMotorbikes.remove(motorbike);
                try {
                    Connection con = JDBCUtil.getConnection();

                    Statement st = con.createStatement();

                    String sql = "DELETE from motorbikes WHERE ID ='" + id + "'";
                    st.executeUpdate(sql);

                    JDBCUtil.closeConnection(con);
                } catch (SQLException e) {
                }
                return true;
            }
        }
        return false;
    }

    //Update a motorbike
    public boolean updateMotorbike(int id, String name, String country, int cc, int yearOfProduction, double price, String imagePath) {
        for (Motorbike motorbike : listOfMotorbikes) {
            if (motorbike.getMotorbikeID() == id) {
                
                motorbike.setName(name);
                motorbike.setCountry(country);
                motorbike.setCc(cc);
                motorbike.setYearOfProduction(yearOfProduction);
                motorbike.setPrice(price);
                motorbike.setImagePath(imagePath);
                
                try {
                    Connection con = JDBCUtil.getConnection();

                    Statement st = con.createStatement();

                    imagePath = imagePath.replace("\\", "\\\\");
                    String sql = "UPDATE motorbikes "
                            + " SET "
                            + " ID='" + id + "'"
                            + ", name='" + name + "'"
                            + ", country='" + country + "'"
                            + ", cc='" + cc + "'"
                            + ", yearOfProduction='" + yearOfProduction + "'"
                            + ", price='" + price + "'"
                            + ", imagePath='" + imagePath + "'"
                            + " WHERE ID='" + id + "\'";
                    st.executeUpdate(sql);

                    JDBCUtil.closeConnection(con);
                } catch (SQLException e) {
                }
                return true;
            }
        }
        return false;
    }

    //Get all motorbikes from database
    public List<Motorbike> getMotorbikesFromDatabase() {
        List<Motorbike> motorbikes = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();

            Statement st = con.createStatement();

            String sql = "SELECT * FROM motorbikes";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("name");
                String country = rs.getString("country");
                int cc = rs.getInt("cc");
                int yearOfProduction = rs.getInt("yearOfProduction");
                double price = rs.getDouble("price");
                String imagePath = rs.getString("imagePath");

                Motorbike motorbike = new Motorbike(id, name, country, cc, yearOfProduction, price, imagePath);
                motorbikes.add(motorbike);
            }

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
        }
        return motorbikes;
    }
}
