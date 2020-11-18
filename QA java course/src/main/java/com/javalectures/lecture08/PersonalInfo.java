package com.javalectures.lecture08;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PersonalInfo {

    private int age;
    private String name;
    private String familyName;
    private Sex sex;

    public PersonalInfo(){
        age = -1;
        name = "";
        familyName = "";
        sex = Sex.NOT_DECLARED;
    }

    public PersonalInfo(String fullName, int age, Sex sex) {
        this.age = age;
        setFullName(fullName);
        this.sex = sex;
    }

    public PersonalInfo(String fullName) {
        age = -1;
        setFullName(fullName);
        sex = Sex.NOT_DECLARED;
    }


    public String getFullName(){
        return (name + "" + familyName);
    }

    public void setFullName(String fullName){
        String names[] = ((fullName.trim()).split(" "));
        if (names.length == 1)  setName(names[0]);
        else if (names.length == 2) {
            setName(names[0]);
            setFamilyName(names[1]);
        } else {
            System.out.println(fullName + "is incorect name");
        }
    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getFamilyName() {
//        return familyName;
//    }
//
//    public void setFamilyName(String familyName) {
//        this.familyName = familyName;
//    }
//
//    public Sex getSex() {
//        return sex;
//    }
//
//    public void setSex(Sex sex) {
//        this.sex = sex;
//    }

    @Override
    public String toString() {
        return "PersonalInfo : " + '\n' +
                "   age= " + age + '\n' +
                "   name= " + name + '\n' +
                "   familyName= " + familyName + '\n' +
                "   sex= " + sex ;
    }
}
