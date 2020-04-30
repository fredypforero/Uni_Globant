package com.models.utils;
// imports
import com.models.chair.Chair;
import com.models.person.Person;
import com.models.person.Student;
import com.models.person.TeacherFull;
import com.models.person.TeacherPart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// Class Init
public class Init {
    private static Common common = new Common();

    public Init ( ) {

    }
        public static List<Chair> chairList () throws Exception {
            List<Chair> chairList = new ArrayList();
            Chair classes1 = new Chair(100, "Mathematics", "C1", 001, studentsClass1());
            Chair classes2 = new Chair(200, "Physic", "C2", 002, studentsClass2());
            Chair classes3 = new Chair(300, "Algebra", "C3", 003, studentsClass3());
            Chair classes4 = new Chair(400, "Equations", "C4", 003, studentsClass4());
            chairList.add(classes1);
            chairList.add(classes2);
            chairList.add(classes3);
            chairList.add(classes4);
            return chairList;
        }

    private static List<Student> studentsClass1() throws Exception {
        Student firstStudent = new Student(1001, "Lucas", 5) {
            @Override
            public double calculateSalary ( ) {
                return 0;
            }
        };
        Student SeccondStuddent = new Student(1002, "Daniel", 3) {
            @Override
            public double calculateSalary ( ) {
                return 0;
            }
        };
        List<Student> students = new ArrayList();
        students.add(firstStudent);
        students.add(SeccondStuddent);
        return students;
    }


    private static List<Student> studentsClass2() throws Exception {
        Student firstStudent = new Student(1003, "Roberto", 5) {
            @Override
            public double calculateSalary ( ) {
                return 0;
            }
        };
        Student SeccondStuddent = new Student(1004, "Sara", 3) {
            @Override
            public double calculateSalary ( ) {
                return 0;
            }
        };
        List<Student> students = new ArrayList();
        students.add(firstStudent);
        students.add(SeccondStuddent);
        return students;
    }

    private static List<Student> studentsClass3() throws Exception {
        Student firstStudent = new Student(1005, "Hilmar", 5) {
            @Override
            public double calculateSalary ( ) {
                return 0;
            }
        };
        Student SeccondStuddent = new Student(1006, "Mafe", 3) {
            @Override
            public double calculateSalary ( ) {
                return 0;
            }
        };
        List<Student> students = new ArrayList();
        students.add(firstStudent);
        students.add(SeccondStuddent);
        return students;
    }

    private static List<Student> studentsClass4() throws Exception {
        Student firstStudent = new Student(1007, "Karen", 5) {
            @Override
            public double calculateSalary ( ) {
                return 0;
            }
        };
        Student SeccondStuddent = new Student(1008, "Oscar", 3) {
            @Override
            public double calculateSalary ( ) {
                return 0;
            }
        };
        List<Student> students = new ArrayList();
        students.add(firstStudent);
        students.add(SeccondStuddent);
        return students;
    }

    public static List<Student> initStudents() throws Exception {
        List<String> lines = common.readFile("Student.txt");
        List<Student> studentList = new ArrayList();
        Iterator var3 = lines.iterator();

        while(var3.hasNext()) {
            String line = (String)var3.next();
            String[] values = line.split(",");
            Student student = new Student(Integer.parseInt(values[0]),values[1],Integer.parseInt(values[2])) {
                @Override
                public double calculateSalary ( ) {
                    return 0;
                }
            };
            studentList.add(student);
        }

        return studentList;
    }

    public static List<Person> initTeacher() throws Exception {
        List<String> lines = common.readFile("TeacherPart.txt");
        List<Person> teacherList = new ArrayList();
        Iterator var3 = lines.iterator();
        String line;
        String[] values;
        while(var3.hasNext()) {
            line = (String)var3.next();
            values = line.split(",");
            TeacherPart partTimeTeacher = new TeacherPart(Integer.parseInt(values[0]),values[1],Integer.parseInt(values[2]),values[3],Integer.parseInt(values[4])) {
            };
            teacherList.add(partTimeTeacher);
        }

        lines = common.readFile("TeacherFull.txt");
        var3 = lines.iterator();

        while(var3.hasNext()) {
            line = (String)var3.next();
            values = line.split(",");
            TeacherFull fullTimeTeacher = new TeacherFull(values[0],Integer.parseInt(values[1]),values[2],Integer.parseInt(values[3])) {
            };
            teacherList.add(fullTimeTeacher);
        }

        return teacherList;
    }


    }
