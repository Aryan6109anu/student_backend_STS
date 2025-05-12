package com.example.Student_222;

import java.util.List;
import java.util.Optional;

public interface StudentService {
	    void saveStudent(Student student);
	    Optional<Student> getStudentById(Long id);
	    List<Student> getAllStudents();
	    Student updateStudent(Student student);
	    Optional<Student> deleteStudent(Long id);
	}

