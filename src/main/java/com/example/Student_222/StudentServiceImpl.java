package com.example.Student_222;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;  // You should have this repository for data handling

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

   @Override
	public  Optional<Student> getStudentById(Long id) {
	  return studentRepository.findById(id);
		
	}


	public List<Student> getAllStudents() {
	   return studentRepository.findAll();
	
	}

	 public Student updateStudent(Student student) {
	        // Step 1: Find the student by ID
	        Optional<Student> optionalStudent = studentRepository.findById(student.getId());

	        if (optionalStudent.isPresent()) {
	            Student existing = optionalStudent.get();
	            // Step 2: Update fields
	            existing.setName(student.getName());
	            existing.setPhone(student.getPhone());
	            // Step 3: Save and return updated student
	            return studentRepository.save(existing);
	        } else {
	            throw new RuntimeException("Student with ID " + student.getId() + " not found");
	        }
	    }


	@Override
	public Optional<Student> deleteStudent(Long id) {
		    studentRepository.deleteById(id);
		return Optional.empty();
	}
	

	

	      
	}
