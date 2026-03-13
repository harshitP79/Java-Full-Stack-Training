package org.harshitcgspring.studentcourseregistration.controller;

import lombok.RequiredArgsConstructor;
import org.harshitcgspring.studentcourseregistration.Service.EnrollmentService;
import org.harshitcgspring.studentcourseregistration.model.Course;
import org.harshitcgspring.studentcourseregistration.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class StudentCourseController {

    private final EnrollmentService service;

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return service.addCourse(course);
    }

    @PostMapping("/enroll/{studentId}/{courseId}")
    public String enrollStudent(@PathVariable int studentId,
                                @PathVariable int courseId) {

        return service.enrollStudent(studentId, courseId);

    }


    @GetMapping("/students/{id}/courses")
    public List<Course> getCourses(@PathVariable int id) {

        return service.getStudentCourses(id);

    }


    @DeleteMapping("/enroll/{studentId}/{courseId}")
    public String removeEnrollment(@PathVariable int studentId,
                                   @PathVariable int courseId) {

        return service.removeEnrollment(studentId, courseId);

    }

}