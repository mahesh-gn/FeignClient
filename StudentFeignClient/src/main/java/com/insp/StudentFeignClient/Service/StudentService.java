package com.insp.StudentFeignClient.Service;

import com.insp.StudentFeignClient.Model.Student;
import com.insp.StudentFeignClient.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    NotificationClient notificationClient;
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(int id) {
        return studentRepository.findById(id);
    }

    public Student createStudent(Student student) {
        notificationClient.saveStudent(student);
        return studentRepository.save(student);
    }

    public void updateStudent(int id, Student student) {
        if (studentRepository.existsById(id)) {
            student.setSid(id);
            studentRepository.save(student);
        }
    }

    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}
