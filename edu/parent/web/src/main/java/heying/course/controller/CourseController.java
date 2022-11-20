package heying.course.controller;

import entity.Course;
import heying.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("course")
public class CourseController {

    @Autowired
    @Qualifier("eduCourseService")
    private CourseService courseService;

    @GetMapping("queryAll")
    public List<Course> queryAll(){
        List<Course> list = courseService.queryAll();
        return list;
    }
}
