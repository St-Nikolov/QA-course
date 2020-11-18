package com.javalectures.lecture08;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ContactInfo {

    private String address;
    private String emailAddress;
    private int phoneNumber;

    public ContactInfo(){
        address = "";
        emailAddress = "";
        phoneNumber = -1;
    }

//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getEmailAddress() {
//        return emailAddress;
//    }
//
//    public void setEmailAddress(String emailAddress) {
//        this.emailAddress = emailAddress;
//    }
//
//    public int getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(int phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }

    @Override
    public String toString() {
        return "ContactInfo :" + '\n' +
                "   address= " + address + '\n' +
                "   emailAddress= " + emailAddress + '\n' +
                "   phoneNumber= " + phoneNumber ;
    }
}
