package sti.aaj.unittest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sti.aaj.domain.Student;
import sti.aaj.service.StiService;

public class TestService {

    private static final Student ANNA_KARLSSON = new Student("Anna", "Karlsson", 10, 1010);

    private static ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("classpath:sti-aaj-service-impl.xml");
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
    public void testSpringWiring(){
        Student student = stiService.getStudent(10);
        Assert.assertEquals(ANNA_KARLSSON, student);
        }
    }