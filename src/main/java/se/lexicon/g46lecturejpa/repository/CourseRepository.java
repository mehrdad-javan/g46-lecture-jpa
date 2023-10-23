package se.lexicon.g46lecturejpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import se.lexicon.g46lecturejpa.entity.Course;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

  List<Course> findByInstructors_Id(Long instructorId);

  @Query("select c from Course c join Instructor i Where i.id = :instructorId")
  List<Course> findCoursesByInstructorId(@Param("instructorId") Long instructorId);

}
