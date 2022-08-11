package com.auca.studentinfo.controller;

import com.auca.studentinfo.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentrepository extends JpaRepository<student,Integer>{


}
