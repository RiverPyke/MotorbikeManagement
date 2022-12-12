package model;

import database.JDBCUtil;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class UserManager {

    //Variables
    private List<User> listOfUsers;

    //Constructor
    public UserManager() {
        this.listOfUsers = getUsersFromDatabase();
    }

    //Getter and Setter
    public List<User> getListOfUsers() {
        return listOfUsers;
    }

    public void setListOfUsers(List<User> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }
    
    //Regiser a new user
    public boolean register(User user) {
        if (!this.listOfUsers.contains(user)) {
            
            this.listOfUsers.add(user);
            
            try {
                Connection con = JDBCUtil.getConnection();

                Statement st = con.createStatement();

                String sql = "INSERT INTO users (username, password, fullName, email, faceIDPath) "
                        + " VALUES ('" + user.getUsername() + "', '" + user.getPassword() + "','" + user.getFullName() + "','" + user.getEmail() + "','" + user.getFaceIDPath() + "')";
                st.executeUpdate(sql);

                JDBCUtil.closeConnection(con);
            } catch (SQLException e) {
            }
            return true;
        }
        return false;
    }

    //Get all users from database
    public List<User> getUsersFromDatabase() {
        List<User> users = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();

            Statement st = con.createStatement();

            String sql = "SELECT * FROM users";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String fullName = rs.getString("fullName");
                String email = rs.getString("email");
                String faceIDPath = rs.getString("faceIDPath");

                User user = new User(username, password, fullName, email, faceIDPath);
                users.add(user);
            }
            
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
        }
        return users;
    }
}
