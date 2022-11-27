package com.student.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.demo.model.Students;

@Repository
public interface StudentRepo extends JpaRepository<Students,Integer > {

}
