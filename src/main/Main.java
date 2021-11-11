package main;

import controller.RegistrationSystem;
import com.company.*;
import repo.*;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //creating teachers with lastnames and firstnames
        TeacherRepo teacherRepo = new TeacherRepo();
        Teacher mathTeacher = new Teacher("Andra", "Banu");
        Teacher englishTeacher = new Teacher("Teona", "Popa");
        teacherRepo.create(mathTeacher);
        teacherRepo.create(englishTeacher);

        //adding new courses in the CourseRepo
        CourseRepo courseRepo = new CourseRepo();
        Course mathCourse = new Course("Math", mathTeacher,2, 10 );
        Course statisticsCourse = new Course("Statistics", mathTeacher, 2, 10);
        Course speakingCourse  = new Course("Speaking", englishTeacher, 2, 11);
        Course grammarCourse = new Course("Grammar", englishTeacher, 4, 12);

        //adding the courses to the teachers list
        mathTeacher.addCourse(mathCourse);
        mathTeacher.addCourse(statisticsCourse);
        englishTeacher.addCourse(speakingCourse);
        englishTeacher.addCourse(grammarCourse);

        courseRepo.create(mathCourse);
        courseRepo.create(statisticsCourse);
        courseRepo.create(speakingCourse);
        courseRepo.create(grammarCourse);

        //Creating new students
        StudentRepo studentRepo = new StudentRepo();
        Student catalinStudent = new Student("Catalin", "Bicu", 110);
        Student victorStudent = new Student("Victor", "Tudor", 125);
        Student dariusStudent = new Student("Darius", "Bulga", 118);

        studentRepo.create(catalinStudent);
        studentRepo.create(victorStudent);
        studentRepo.create(dariusStudent);

        //we register students in the courses
        RegistrationSystem rs = new RegistrationSystem(courseRepo,teacherRepo,studentRepo);
        rs.register(mathCourse,victorStudent);
        rs.register(statisticsCourse,victorStudent);
        rs.register(statisticsCourse,catalinStudent);
        rs.register(statisticsCourse,dariusStudent);
        rs.register(speakingCourse,dariusStudent);
        rs.register(grammarCourse,catalinStudent);

        System.out.println("\n");
        //get the gredits for Catalin
        System.out.println("Catalina has total Credits no. : " + catalinStudent.getTotalCredits() + "\n");
        System.out.println("Victor has the total No of Credits: " + victorStudent.getTotalCredits()+ "\n");

        //return courses with free places
        System.out.println(rs.retrieveCoursesWithFreePlaces() + "\n");

        //print students enrolled to a specific course
        rs.retrieveStudentsEnrolledForACourse(grammarCourse);
        System.out.print("\n");
        rs.retrieveStudentsEnrolledForACourse(mathCourse);
        System.out.print("\n");
        rs.retrieveStudentsEnrolledForACourse(speakingCourse);
        System.out.print("\n");

        //print all courses
        System.out.println(rs.getAllCourses());


    }
}