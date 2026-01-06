package com.example.Spring.Boot.RestAPIs.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO
{
    private int id;
    private String Name;
    private String Email;
    private String Address;
    private String Phone_Number;



    // constructor
//
//    public StudentDTO(int id, String name, String email, String address, String phone_Number) {
//        this.id = id;
//        Name = name;
//        Email = email;
//        Address = address;
//        Phone_Number = phone_Number;
//    }
//    // default Constructor
//
//    public StudentDTO() {
//
//    }
//    // getter and setter
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return Name;
//    }
//
//    public void setName(String name) {
//        Name = name;
//    }
//
//    public String getEmail() {
//        return Email;
//    }
//
//    public void setEmail(String email) {
//        Email = email;
//    }
//
//    public String getAddress() {
//        return Address;
//    }
//
//    public void setAddress(String address) {
//        Address = address;
//    }
//
//    public String getPhone_Number() {
//        return Phone_Number;
//    }
//
//    public void setPhone_Number(String phone_Number) {
//        Phone_Number = phone_Number;
//    }
}
