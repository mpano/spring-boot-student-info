package com.auca.studentinfo.service;

import com.auca.studentinfo.controller.studentrepository;
import com.auca.studentinfo.entity.student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class studentservice implements services{
    private studentrepository studentrep;

    public studentservice(studentrepository therepository){

        studentrep=therepository;
    }

    @Override
    public List<student> displaystudent() {

        return studentrep.findAll();
    }

    @Override
    public student findById(int myid) {
        Optional<student> result = studentrep.findById(myid);

        student thestudent = null;

        if (result.isPresent()) {
            thestudent = result.get();
        }
        else {

            throw new RuntimeException("Did not find student id:" + myid);
        }

        return thestudent;
    }


    @Override
    public void savest(student mystudent) {

        studentrep.save(mystudent);
    }

    @Override
    public void deletest(int myid) {

        studentrep.deleteById(myid);
    }


}
