package studentsSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import studentsSystem.model.db.StudentEntity;

@Repository
public interface StudentRepository
        extends JpaRepository<StudentEntity,Long> {

}
