package com.javalectures.lecture08;

import lombok.Getter;
import lombok.Setter;

public class Person {
    private PersonalInfo personalInfo;
    private ContactInfo contactInfo;

    @Getter
    @Setter
    private String profesion;

    public Person(String name) {
        personalInfo = new PersonalInfo(name);
        contactInfo = new ContactInfo();
        profesion = "";
//        String fullName[] = ((name.trim()).split(" "));
//        if (fullName.length == 1) personalInfo.setName(fullName[0]);
//        else if (fullName.length == 2) {
//            personalInfo.setName(fullName[0]);
//            personalInfo.setFamilyName(fullName[1]);
//        } else System.out.println("Unsupported name format");
    }

    public Person(String name,int age, Sex sex) {
        personalInfo = new PersonalInfo(name,age,sex);
        contactInfo = new ContactInfo();
        profesion = "";
    }

    @Override
    public String toString() {
        return "Person :" + '\n' +
                personalInfo + '\n' +
                contactInfo + '\n' +
                "   profesion= " + profesion;
    }

//    public String getProfesion() {
//        return profesion;
//    }
//
//    public void setProfesion(String profesion) {
//        this.profesion = profesion;
//    }




    public String getAddress() {
        return contactInfo.getAddress();
    }

    public void setAddress(String address) {
        contactInfo.setAddress(address);
    }

    public String getEmailAddress() {
        return contactInfo.getEmailAddress();
    }

    public void setEmailAddress(String emailAddress) {
        contactInfo.setEmailAddress(emailAddress);
    }

    public int getPhoneNumber() {
        return contactInfo.getPhoneNumber();
    }

    public void setPhoneNumber(int phoneNumber) {
        contactInfo.setPhoneNumber(phoneNumber);
    }


    public int getAge() {
        return personalInfo.getAge();
    }


    public void setAge(int age) {
        personalInfo.setAge(age);
    }

    public String getName() {
        return personalInfo.getName();
    }

    public void setName(String name) {
        personalInfo.setName(name);
    }

    public String getFamilyName() {
        return personalInfo.getFamilyName();
    }

    public void setFamilyName(String familyName) {
        personalInfo.setFamilyName(familyName);
    }

    public Sex getSex() {
        return personalInfo.getSex();
    }

    public void setSex(Sex sex) {
        personalInfo.setSex(sex);
    }

}
