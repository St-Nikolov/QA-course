package com.javalectures.lecture08;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Petar Velkov",36,Sex.FEMALE,AcademicRank.PROFESSOR, 11);


        ArrayList speciality = new ArrayList<>();
        speciality.add("Mathematics++");
        speciality.add("Physics");
        teacher.setSpeciality(speciality);

        System.out.println(teacher.toString());

    }
}
