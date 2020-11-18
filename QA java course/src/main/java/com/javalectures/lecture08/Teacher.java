package com.javalectures.lecture08;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Teacher extends Person {

    private String faculty;
    private ArrayList<String> speciality = new ArrayList(1);
    private AcademicRank academicRank;
    private int experienceYears;

    public Teacher(String name, AcademicRank academicRank, int experienceYears){
        super(name);
        setProfesion("Teacher");
        this.academicRank = academicRank;
        this.experienceYears = experienceYears;
    }

    public Teacher(String name, int age, Sex sex, AcademicRank academicRank, int experienceYears) {
        super(name, age, sex);
        setProfesion("Teacher");
        this.academicRank = academicRank;
        this.experienceYears = experienceYears;
    }

    @Override
    public String toString() {
        String info = super.toString() + '\n' +
                "   Experrience : " + experienceYears + " years" + '\n' +
                "   AcademicRank : " + academicRank + '\n' +
                "   Specialities : " + speciality.toString();
        return info;
    }


}
