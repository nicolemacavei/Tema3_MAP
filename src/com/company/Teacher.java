package com.company;

import java.util.List;
import java.util.ArrayList;

public class Teacher extends Person {

    private List<Course> courses;

    /**
     * Instantiates a new Teacher.
     * @param firstName the first name
     * @param lastName  the last name
     */
    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
        courses = new ArrayList<>();
    }

    /**
     * add a course to a specific teacher
     * @param course = new course
     */
    public void addCourse(Course course){

        if(courses.contains(course)){

            System.out.print("Course already exists");
        }
        else{
            courses.add(course);
        }
    }

    /**
     * delete a course from the teachers list
     * @param course = old course
     */
    public void removeCourse(Course course){

        if(!courses.contains(course)){

            System.out.print("Course does not exist");
        }
        else{

            courses.remove(course);
        }
    }

    /**
     * Gets courses.
     *
     * @return the courses
     */
    public List<Course> getCourses() {
        return courses;
    }

    /**
     * Sets courses.
     *
     * @param courses the courses
     */
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
