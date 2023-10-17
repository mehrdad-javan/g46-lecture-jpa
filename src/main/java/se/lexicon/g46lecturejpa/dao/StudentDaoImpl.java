package se.lexicon.g46lecturejpa.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import se.lexicon.g46lecturejpa.entity.Student;

import java.util.Collection;
import java.util.Optional;

@Repository
public class StudentDaoImpl implements StudentDao {

  @PersistenceContext
  private EntityManager entityManager;

  @Override
  @Transactional
  public Student persist(Student student) {
    entityManager.persist(student);
    return student;
  }

  @Override
  public Optional<Student> findById(String id) {
    Student foundStudent = entityManager.find(Student.class, id);
    return Optional.ofNullable(foundStudent);
  }

  @Override
  public Optional<Student> findByEmail(String email) {
    return entityManager
            .createQuery("select s from Student s where s.email = :em", Student.class)
            .setParameter("em", email)
            .getResultList()
            .stream()
            .findFirst();
  }

  @Override
  public Collection<Student> findByFirstNameContains(String firstName) {
    // todo: implement later
    return null;
  }

  @Override
  public Collection<Student> findAll() {
   return entityManager.createQuery("select s from Student s", Student.class)
            .getResultList();
  }

  @Override
  @Transactional
  public void update(Student student) {
    entityManager.merge(student);
  }

  @Override
  @Transactional
  public void remove(String id) {
    Student foundStudent = entityManager.find(Student.class, id);
    if (foundStudent != null) entityManager.remove(foundStudent);
    //todo: throws exception
  }
}
