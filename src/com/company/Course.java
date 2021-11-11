package com.company;

import java.util.*;

public class Course {

    public String name;
    public Person teacher;
    public int maxEnrollement;
    public List<Student> studentsEnrolled;
    public int credits;

    /**
     * Instantiates a new Course.
     *
     * @param name           the name
     * @param teacher        the teacher
     * @param maxEnrollement the max enrollement
     * @param credits        the credits
     */
    public Course(String name, Person teacher, int maxEnrollement, int credits) {
        this.name = name;
        this.teacher = teacher;
        this.maxEnrollement = maxEnrollement;
        this.studentsEnrolled = new ArrayList<Student>();
        this.credits = credits;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public int getMaxEnrollement() {
        return maxEnrollement;
    }

    public void setMaxEnrollement(int maxEnrollement) {
        this.maxEnrollement = maxEnrollement;
    }

    public List<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(List<Student> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    /**
     * Gets credits.
     *
     * @return the credits
     */
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Course : " + name + ", Professor= " + teacher + ", maxNo=" + maxEnrollement + ", enrolled= " + studentsEnrolled + "] , ECTS= " + credits + "\n" ;
    }

    /**
     * Case 1 - when the student is already enrolled
     * Case 2 - when the no is maxim
     * else the student will get into the Course
     * @param student = the specific Student
     */
    public void addStudent(Student student){

        if (!studentsEnrolled.contains(student)) {
            if(studentsEnrolled.size() == maxEnrollement){
                System.out.print("No more places in the CourseRoom.");
            }
        } else System.out.print("The student is already enrolled");
        studentsEnrolled.add(student);
    }

}