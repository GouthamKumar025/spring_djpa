package com.goutham.springdata.jpa.repository;

import com.goutham.springdata.jpa.Entity.Guardian;
import com.goutham.springdata.jpa.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

//    @Test
//    public void saveStudents(){
//        Student student = Student.builder().
//                firstName("Goutham").
//                lastName("Kumar").
//                emailId("gou4716@gmail.com").
//                guardianName("Srini").
//                guardianEmail("sri@gmail.com").
//                guardianMobile("9999999999").
//                build();
//
//        studentRepository.save(student);
//
//    }

//    @Test
//    public void saveStudentsWithGuardian(){
//
//        Guardian guardian = Guardian.builder().
//                name("Srini").
//                email("sri@gmail.com").
//                mobile("9876543210").
//                build();
//
//        Student student = Student.builder().
//                firstName("Dhoni").
//                lastName("MS").
//                emailId("msd@gmail.com").
//                guardian(guardian).
//                build();
//
//        studentRepository.save(student);
//    }

    @Test
    public void printStudentByFirstName(){
        List<Student>studentList = studentRepository.findByFirstName("goutham");
        System.out.println("student_list = " + studentList);
    }

    @Test
    public void printAllStudents(){
        List<Student>studentList = studentRepository.findAll();
        System.out.println("student_list = " + studentList);
    }

    @Test
    public void printStudentByEmailId(){
        Student studentName = studentRepository.getStudentByMailId("msd@gmail.com");
        System.out.println(studentName);
    }

    @Test
    public void printStudentByEmailIdNativeParam(){
        Student studentName = studentRepository.getStudentByMailIdNativeParam("gou4716@gmail.com");
        System.out.println(studentName);
    }

    @Test
    public void updateStudentFirstNameByMail(){
        studentRepository.updateStudentFirstNameByEmailId("GK","gou4716@gmail.com");
    }

}