package com.company;
public class Address {
    private String city;
    private int ID;
    private int pinCode ;
    private int studentId;

//    public Address(String city, int ID, int pinCode, int studentId) {
//        this.city = city;
//        this.ID = ID;
//        this.pinCode = pinCode;
//        this.studentId = studentId;
//    }
    public String toString(){
        return "City | Pincode\n" + city + "  " + pinCode;
    }

    public String getCity() {
        return city;
    }

    public int getId() {
        return ID;
    }

    public int getPinCode() {
        return pinCode;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }



}