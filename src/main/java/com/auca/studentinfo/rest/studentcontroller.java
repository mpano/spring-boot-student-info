package com.auca.studentinfo.rest;

import com.auca.studentinfo.entity.student;
import com.auca.studentinfo.service.services;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class studentcontroller {

    private services myservice;

    public studentcontroller(services theservice){
        myservice=theservice;

    }
   // displaying all student in database
    @GetMapping("/student")
    public List<student> displaystudent(){

        return myservice.displaystudent();
    }
   // searching student by id

    @GetMapping("/student/{myid}")
    public student getStudent(@PathVariable int myid){
        student thestudent = myservice.findById(myid);
        if(thestudent==null){
            throw new RuntimeException("there is no student who have that id"+myid);
        }
        return thestudent;
    }

    // for adding new student in our database

    @PostMapping("/student")
    public student addnewstudent(@RequestBody student thestudent){
        thestudent.setId(thestudent.getId());
        myservice.savest(thestudent);
        return thestudent;

    }

    // for updating student you want

    @PutMapping("/student")
    public student updatestudent(@RequestBody student thestudent){
        myservice.savest(thestudent);
        return thestudent;
    }

    // deleting a student in database

    @DeleteMapping("/student/{myid}")
    public String deletestudent(@PathVariable int myid){
        student mystudent=myservice.findById(myid);

        if(mystudent==null){
            throw new RuntimeException("the student is not in the database");
        }
        myservice.deletest(myid);
        return "student deleted id:"+myid;
    }

}
