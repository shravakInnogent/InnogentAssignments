package com.company;
public class Student{
    int id;
    String name;
    int  classId;
    int marks;
    String gender;
    int age;

//    public Student(int age, int classId, String gender, int id, String name, int marks) {
//        this.age = age;
//        this.classId = classId;
//        this.gender = gender;
//        this.id = id;
//        this.name = name;
//        this.marks = marks;
//    }
    public String toString(){
        return "ID | Name | Marks | Gender | Age | ClassId \n" + id + "   " + name + "    " + marks + "      " + gender + "   " + age + "      " + classId ;
    }
    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }
   public void setGender(String gender){
        this.gender= gender;
   }
    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setAge(int age) {
        this.age = age;
    }
   // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    public  int getClassId(){ return classId;}
    public int getMarks() {
        return marks;
    }
    
}