package se.lexicon.g46lecturejpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.lexicon.g46lecturejpa.dao.StudentDao;
import se.lexicon.g46lecturejpa.entity.Student;

@Component
public class MyCommandLineRunner implements CommandLineRunner {


  @Autowired
  StudentDao studentDao;

  @Override
  public void run(String... args) throws Exception {
    //Student student = new Student("Test", "Testsson", "test@test.se");
    //studentDao.persist(student);
  }

}
