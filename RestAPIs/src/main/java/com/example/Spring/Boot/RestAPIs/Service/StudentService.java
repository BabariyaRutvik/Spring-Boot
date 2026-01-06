package com.example.Spring.Boot.RestAPIs.Service;

import com.example.Spring.Boot.RestAPIs.DTO.DtoStudentAdd;
import com.example.Spring.Boot.RestAPIs.DTO.StudentDTO;
import org.jspecify.annotations.Nullable;

import java.util.List;
import java.util.Map;

public interface StudentService {
 List<StudentDTO> getAllStudents();

    StudentDTO getStudentByID(int id);

    StudentDTO AddStudent(DtoStudentAdd studentAdd);

    void DeleteStudent(int id);

    @Nullable StudentDTO UpdateStudent(int id, DtoStudentAdd studentAdd1);

    @Nullable StudentDTO updateStudent(int id, Map<String, Object> updates);
}
