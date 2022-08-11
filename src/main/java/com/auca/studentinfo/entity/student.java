package com.auca.studentinfo.entity;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class student {
    // define my variable with it's name in database

    @Id
   // @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastname;
// define my constractor
    public student(){

    }

    public student(int id,String firstname, String lastname) {
        this.id= id;
        this.firstname = firstname;
        this.lastname = lastname;
    }


    // define getter and setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    // define tostring


    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
