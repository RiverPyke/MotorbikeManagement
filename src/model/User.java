package model;

import java.util.Objects;

public class User {

    //Variables
    private String username;
    private String password;
    private String fullName;
    private String email;
    private String faceIDPath;

    //Constructor
    public User(String username, String password, String fullName, String email, String faceIDPath) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
        this.faceIDPath = faceIDPath;
    }

    //Getter and Setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaceIDPath() {
        return faceIDPath;
    }

    public void setFaceIDPath(String faceIDPath) {
        this.faceIDPath = faceIDPath;
    }

    //Equals and HashCode
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        return Objects.equals(this.username, other.username);
    }
}
