package org.harshitcgspring.studentcourseregistration.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Enrollment {

    private int studentId;
    private int courseId;

}