package heying.service.impl;

import entity.Course;
import heying.service.CourseService;
import mapper.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public List<Course> queryAll() {
        return courseDao.queryAll();
    }
}
