package com.example.Spring.Boot.RestAPIs.Cantroller;

import com.example.Spring.Boot.RestAPIs.DTO.DtoStudentAdd;
import com.example.Spring.Boot.RestAPIs.DTO.StudentDTO;
import com.example.Spring.Boot.RestAPIs.Service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;



    // Getting the request
//    @GetMapping("/student")
//    public StudentDTO getStudents(){
//        return  new StudentDTO(1,"Rutvik Babariya","rutvik@gmail.com","Ahmedabad","6351202084");
//
//    }
    // getting all Students

    @GetMapping
    public ResponseEntity<List<StudentDTO>> getStudent(){
        return ResponseEntity.status(HttpStatus.OK).body(studentService.getAllStudents());


    }
    @GetMapping("/{id}")
    public ResponseEntity<StudentDTO> getStudentsBYID(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK).body(studentService.getStudentByID(id));



    }
    // now insert the new Student
    @PostMapping("")
    public ResponseEntity<StudentDTO> insertNewStudent(@RequestBody @Valid DtoStudentAdd studentAdd){
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.AddStudent(studentAdd));

    }
    // for Delete the Student
    @DeleteMapping("/{id}")
    public ResponseEntity<Void>DeleteStudent(@PathVariable int id){
        studentService.DeleteStudent(id);
        return ResponseEntity.noContent().build();
    }
    // for update whole data from database by Its id
    @PutMapping("/{id}")
    public ResponseEntity<StudentDTO> updateStudent(@PathVariable int id,
                                                    @RequestBody DtoStudentAdd studentAdd1){

        return ResponseEntity.ok(studentService.UpdateStudent(id,studentAdd1));

    }
    // for Partially update
    @PatchMapping("/{id}")
    public ResponseEntity<StudentDTO>updateStudent2(@PathVariable int id,
                                                    @RequestBody Map<String, Object> updates){
        return ResponseEntity.ok(studentService.updateStudent(id,updates));

    }

}
