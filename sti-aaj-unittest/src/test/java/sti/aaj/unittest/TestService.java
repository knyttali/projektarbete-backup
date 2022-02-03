package sti.aaj.unittest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sti.aaj.domain.Course;
import sti.aaj.domain.Student;
import sti.aaj.domain.Teacher;
import sti.aaj.service.StiService;

public class TestService {

    private static final Course course = new Course("Tyska", 10, new Teacher("Özgur", "Kibar", 567890, 10), 1010, 50);
    private static final String ANNA_KARLSSON = "Anna";

    private static ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("classpath:sti-aaj-service.xml");
    private static StiService stiService = (StiService) applicationContext.getBean("service");

/*
    @Test
    public void testSpringWiring(){
        StiService StiService = (StiService)applicationContext.getBean("service");
        List<String> students = StiService.getStudents();
        Assert.assertEquals(HELENA_OSTLUND, students.get(0));
    }
*/

    @Test
    public void testName(){
        Student student = new Student("Anna", "Karlsson", 10, 1010);
        Assert.assertEquals("Anna", student.getName());
    }

    @Before
    public void Before(){
        stiService = (StiService) applicationContext.getBean("service");
    }

    @Test
    public void testService(){
        Student student = new Student("Anna", "Karlsson", 10, 1010);
        Assert.assertNotNull(student);
    }
}