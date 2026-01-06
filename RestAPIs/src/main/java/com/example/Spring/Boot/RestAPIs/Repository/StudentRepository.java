package com.example.Spring.Boot.RestAPIs.Repository;

import com.example.Spring.Boot.RestAPIs.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student , Integer>
{

}
