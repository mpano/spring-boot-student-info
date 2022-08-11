package com.auca.studentinfo.service;

import com.auca.studentinfo.entity.student;

import java.util.List;

public interface services {

    public List<student> displaystudent();
    public student findById(int myid);



    public void savest(student mystudent);
    public void deletest(int myid);
}
