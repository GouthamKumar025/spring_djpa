package com.goutham.springdata.jpa.repository;

import com.goutham.springdata.jpa.Entity.Course;
import com.goutham.springdata.jpa.Entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher(){

        Course course = Course.builder().
                title("DA").
                credit(6).
                build();

        Teacher teacher = Teacher.builder().
                firstName("Kapil").
                lastName("Dev").
                course(List.of(course)).
                build();

        teacherRepository.save(teacher);
    }
}