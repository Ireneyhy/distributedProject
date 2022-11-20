import entity.Course;
import entity.User;
import heying.service.CourseService;
import heying.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring-*.xml"})
public class TestCourse {

    @Autowired
    private CourseService courseService;

    @Test
    public void queryAll(){
        List<Course> list = courseService.queryAll();
        System.out.println(list);
    }
}
