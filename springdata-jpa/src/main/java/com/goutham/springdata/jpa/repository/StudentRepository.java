package com.goutham.springdata.jpa.repository;

import com.goutham.springdata.jpa.Entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByFirstName(String name);

    @Query("select s from Student s where s.emailId = ?1")
    Student getStudentByMailId(String emailId);


    @Query(value = "select * from tbl_student s where s.email_address = :emailId", nativeQuery = true)
    Student getStudentByMailIdNativeParam(@Param("emailId") String emailId);

    @Transactional
    @Modifying
    @Query(
            value = "update tbl_student set first_name = ?1 where email_address = ?2",
            nativeQuery = true
    )
    int updateStudentFirstNameByEmailId(String firstname, String emailId);
}
