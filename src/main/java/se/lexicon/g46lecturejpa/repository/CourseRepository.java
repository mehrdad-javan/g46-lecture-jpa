package se.lexicon.g46lecturejpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.g46lecturejpa.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
