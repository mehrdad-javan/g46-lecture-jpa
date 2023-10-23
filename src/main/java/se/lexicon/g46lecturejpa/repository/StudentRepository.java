package se.lexicon.g46lecturejpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import se.lexicon.g46lecturejpa.entity.Student;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

  List<Student> findByFirstName(String firstName);
  @Query("SELECT  s from Student s where s.firstName = :fn")
  List<Student> selectStudentByFirstName(@Param("fn") String firstName);

  List<Student> findByFirstNameContains(String firstName);
  List<Student> findByStatusTrue();
  Student findByEmailIgnoreCase(String email);

  // update student set status = true where id = :id;
  @Modifying
  @Query("UPDATE Student s set s.status = true where s.id = :studentId")
  void updateStudentStatusToTrue(@Param("studentId") String studentId);



}
