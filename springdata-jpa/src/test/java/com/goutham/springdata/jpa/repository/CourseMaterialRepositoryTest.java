package com.goutham.springdata.jpa.repository;

import com.goutham.springdata.jpa.Entity.Course;
import com.goutham.springdata.jpa.Entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    public void saveCourseMaterial(){
        Course course = Course.builder().
                title(".Net").
                credit(3).
                build();

        CourseMaterial courseMaterial = CourseMaterial.builder().
                url("www.wikipedia.com").
                course(course).
                build();

        courseMaterialRepository.save(courseMaterial);

    }

    @Test
    public void getCourseMaterial(){
        List<CourseMaterial> courseMaterialList = courseMaterialRepository.findAll();
        System.out.println(courseMaterialList);
    }
}