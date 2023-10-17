package se.lexicon.g46lecturejpa.dao;

import se.lexicon.g46lecturejpa.entity.Student;

import java.util.Collection;
import java.util.Optional;

public interface StudentDao {

  Student persist(Student student);

  Optional<Student> findById(String id);

  Optional<Student> findByEmail(String email);

  Collection<Student> findByFirstNameContains(String firstName);

  Collection<Student> findAll();

  void update(Student student);

  void remove(String id);

}
