package com.example.Spring.Boot.RestAPIs.Service.Impl;

import com.example.Spring.Boot.RestAPIs.DTO.DtoStudentAdd;
import com.example.Spring.Boot.RestAPIs.DTO.StudentDTO;
import com.example.Spring.Boot.RestAPIs.Entity.Student;
import com.example.Spring.Boot.RestAPIs.Repository.StudentRepository;
import com.example.Spring.Boot.RestAPIs.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StudentServiceImplimentation implements StudentService {
    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<StudentDTO> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        List<StudentDTO> studentDTOS =
                students.stream()
                        .map(student -> new StudentDTO(student.getId(),
                                student.getName(),
                                student.getEmail(),
                                student.getAddress(),
                                student.getPhone_Number())).toList();
        return studentDTOS;
    }

    @Override
    public StudentDTO getStudentByID(int id) {
        Student student = studentRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Student Not found with ID : "+id));

        return modelMapper.map(student,StudentDTO.class);

    }

    @Override
    public StudentDTO AddStudent(DtoStudentAdd studentAdd) {
        Student NewStudent = modelMapper.map(studentAdd,Student.class);
        Student student = studentRepository.save(NewStudent);

        return modelMapper.map(student,StudentDTO.class);

    }

    @Override
    public void DeleteStudent(int id) {

        if (!studentRepository.existsById(id)){
            throw new IllegalArgumentException("Student Does not Exists by ID: " +id);

        }
        studentRepository.deleteById(id);

    }

    @Override
    public @Nullable StudentDTO UpdateStudent(int id, DtoStudentAdd studentAdd1) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException(("Student Not Found: "+id)));
        modelMapper.map(studentAdd1,student);

        student = studentRepository.save(student);
        return modelMapper.map(student,StudentDTO.class);

    }

    @Override
    public @Nullable StudentDTO updateStudent(int id, Map<String, Object> updates) {
        Student student =studentRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("Student not Found wit IDs: "+id));

        updates.forEach((field , value)->
        {
            switch (field){

                case "Name": student.setName((String) value);
                break;

                case "Email" : student.setEmail((String) value);
                break;

                case "Address" : student.setAddress((String) value);
                break;

                case "Phone Number" : student.setPhone_Number((String) value);
                break;
                default:
                    throw new IllegalArgumentException("Fields is Not Found :");

            }

        });
        Student student1 = studentRepository.save(student);
        return modelMapper.map(student1,StudentDTO.class);

    }
}
