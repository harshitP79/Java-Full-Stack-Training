package org.harshitcgspring.studentcourseregistration.Service;


import org.harshitcgspring.studentcourseregistration.model.Course;
import org.harshitcgspring.studentcourseregistration.model.Student;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EnrollmentService {

    private Map<Integer, Student> students = new HashMap<>();
    private Map<Integer, Course> courses = new HashMap<>();
    private Map<Integer, List<Course>> enrollments = new HashMap<>();


    public Student addStudent(Student student) {

        students.put(student.getId(), student);
        return student;

    }


    public Course addCourse(Course course) {

        courses.put(course.getId(), course);
        return course;

    }
    public String enrollStudent(int studentId, int courseId) {
        if (!students.containsKey(studentId))
            return "Student not found";
        if (!courses.containsKey(courseId))
            return "Course not found";
        enrollments.putIfAbsent(studentId, new ArrayList<>());
        enrollments.get(studentId).add(courses.get(courseId));
        return "Student enrolled successfully";
    }
    public List<Course> getStudentCourses(int studentId) {

        return enrollments.getOrDefault(studentId, new ArrayList<>());

    }

    public String removeEnrollment(int studentId, int courseId) {
        List<Course> courseList = enrollments.get(studentId);
        if (courseList == null)
            return "No enrollments found";
        courseList.removeIf(course -> course.getId() == courseId);
        return "Enrollment removed";
    }

}