package mapper;

import entity.Course;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CourseDao {
    List<Course> queryAll();
}
