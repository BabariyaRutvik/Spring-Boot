package com.example.Spring.Boot.RestAPIs.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class DtoStudentAdd
{
    @NotBlank(message = "Name ios Ruquired")
    @Size(min = 4 , max = 20 , message = "Name length should be 4 to 20")
    private String Name;
    @Email
    private String Email;
    private String Address;
    private String Phone_Number;

}
