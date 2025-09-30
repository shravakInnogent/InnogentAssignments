package com.company;
public class Class {
    int id;
    String cls ;

//    public Class(String cls, int id) {
//        this.cls = cls;
//        this.id = id;
//    }
    public String toString(){
        return "Class\n" + cls ;
    }
    public int getId() {
        return id;
    }

    public String getCls() {
        return cls;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

}