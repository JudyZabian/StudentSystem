package studentsSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studentsSystem.model.db.StudentEntity;
import studentsSystem.repository.StudentRepository;

import java.time.LocalDate;
import java.util.List;
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<StudentEntity> getStudents() {
        return studentRepository.findAll() ;
    }
}
