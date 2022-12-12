package model;

import java.io.Serializable;

public class Motorbike implements Serializable {

    //Variables
    private int motorbikeID;
    private String name;
    private String country;
    private int cc;
    private int yearOfProduction;
    private double price;
    private String imagePath;

    //Constructor
    public Motorbike(int motorbikeID, String name, String country, int cc, int yearOfProduction, double price, String imagePath) {
        this.motorbikeID = motorbikeID;
        this.name = name;
        this.country = country;
        this.cc = cc;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.imagePath = imagePath;
    }

    //Getter and Setter
    public int getMotorbikeID() {
        return motorbikeID;
    }

    public void setMotorbikeID(int motorbikeID) {
        this.motorbikeID = motorbikeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    //Equals and Hashcode
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
        final Motorbike other = (Motorbike) obj;
        return this.motorbikeID == other.motorbikeID;
    }
}
