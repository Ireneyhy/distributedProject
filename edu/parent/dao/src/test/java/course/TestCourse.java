package course;


import entity.Course;
import mapper.CourseDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class TestCourse {

    @Autowired
    private CourseDao cd;

    @Test
    public void queryAll(){
        List<Course> course = cd.queryAll();
        System.out.println(course);
    }
}
