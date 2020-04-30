package com.models.chair;

import com.models.person.Student;
import java.util.List;

public class Chair {

    private int IdClass;
    private String subject;
    private String classroom;
    private int teacherId;
    private List<Student> students;

    public Chair (int idClass, String subject, String classroom, int teacherId, List<Student> students) {
        IdClass = idClass;
        this.subject = subject;
        this.classroom = classroom;
        this.teacherId = teacherId;
        this.students = students;
    }

    public int getIdClass ( ) {
        return IdClass;
    }

    public void setIdClass (int idClass) {
        IdClass = idClass;
    }

    public String getSubject ( ) {
        return subject;
    }

    public void setSubject (String subject) {
        this.subject = subject;
    }

    public String getClassroom ( ) {
        return classroom;
    }

    public void setClassroom (String classroom) {
        this.classroom = classroom;
    }

    public int getTeacherId ( ) {
        return teacherId;
    }

    public void setTeacherId ( ) {
        this.teacherId = teacherId;
    }

    public List<Student> getStudents ( ) {
        return students;
    }

    public void setStudents (List<Student> students) {
        this.students = students;
    }

    public String toString() {
        return "ID Code= " + this.IdClass + '\'' + "Subject= " + this.subject + ", Classroom= " + this.classroom;
    }
}
