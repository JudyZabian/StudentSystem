package studentsSystem.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import studentsSystem.model.db.StudentEntity;
import studentsSystem.repository.StudentRepository;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
        StudentRepository repository)  {
        return args -> {
                    StudentEntity judy = new StudentEntity(
                            1L,
                            "Judy",
                            "Judy.zabian@gail.com",
                            LocalDate.of(1995,01,01),
                            21
                    );
                  StudentEntity anas = new StudentEntity(
                            1L,
                            "Anas",
                            "Anas@gmail.com",
                            LocalDate.of(1995,01,01),
                            21
                    );
        repository.saveAll(
                List.of(judy,anas)
        );
        };
    }
}
