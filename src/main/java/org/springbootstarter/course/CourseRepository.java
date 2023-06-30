package org.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByName(String name);
    public List<Course> findByDescription(String name); // param name can be any
    public List<Course> findByTopicId(String topicId);
}
