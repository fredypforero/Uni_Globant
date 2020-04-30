package com.models;

import com.models.chair.Chair;
import com.models.person.Person;
import com.models.person.Student;
import com.models.person.TeacherFull;
import com.models.person.TeacherPart;
import com.models.utils.Init;
import com.sun.xml.internal.ws.util.StreamUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operations {
    private List<Student> studentList = Init.initStudents();
    private List<Chair> chairList = Init.chairList();
    private List<Person> teacherList = Init.initTeacher();

    public Operations ( ) throws Exception {
    }

    public List<Student> getStudentList ( ) {
        return studentList;
    }

    public void setStudentList (List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Chair> getClassesList ( ) {
        return chairList;
    }

    public void setClassesList (List<Chair> classesList) {
        this.chairList = classesList;
    }

    public List<Person> getTeacherList ( ) {
        return teacherList;
    }

    public void setTeacherList (List<Person> teacherList) {
        this.teacherList = teacherList;
    }

   public void menu(int option) throws Exception {
       Scanner reader = new Scanner(System.in);
       switch (option){
           case 1:
               System.out.println("Primer Case");
               System.out.println("Following the all teachers list: ");

               this.getTeacherList().forEach((teacher) -> { System.out.println(teacher.toString());});
               break;
           case 2:

               System.out.println("List of Chairs: ");
                this.getClassesList().forEach((chair) -> { System.out.println(chair.toString());});
                System.out.println("What chair do you want to consult");
               int idClass = reader.nextInt();
               int size=0;
               int i=0;
               int tid;
               int j;
               int id;
               String name;
               String classroom;
               boolean band;
               size = this.chairList.size();
               band=false;
               while(i < size) {

                   if (idClass == this.chairList.get(i).getIdClass()) {
                       System.out.println("ID Class" + chairList.get(i).getIdClass());
                       System.out.println("Class Name" + chairList.get(i).getSubject());
                       System.out.println("Classroom" + chairList.get(i).getClassroom());
                       band = true;
                       tid = chairList.get(i).getTeacherId();
                       size = this.teacherList.size();
                       j = 0;
                       while (j < size) {

                           if (tid == teacherList.get(j).getId()) {
                               System.out.println("Teacher Name" + teacherList.get(j).getName());
                               j = size + 1;
                           }
                           j = j + 1;
                       }
                       System.out.println("Student List");
                       size = chairList.get(i).getStudents().size();
                       j = 0;
                       while (j < size) {
                           System.out.println("Student Name" + chairList.get(i).getStudents().get(j).getName());
                           j = j + 1;
                       }
                       size = chairList.size();
                       i = size + 1;
                   }
                   i=i+1;
               }

               if(band==false){
               System.out.println("This Class does not Exist in the Schedule");

           }
               break;
           case 3:
               System.out.println("Create Student Module");
               System.out.println("What class do you want?");
               idClass = reader.nextInt();
               i=0;
               size=chairList.size();
               while(i < size) {
                   if (idClass == chairList.get(i).getIdClass()) {


                       System.out.println("Id Student: ");
                       id = reader.nextInt();
                       System.out.println("Name of the student ");
                       name = reader.next();
                       this.studentList.add(new Student(id, name, '0') {
                           @Override
                           public double calculateSalary ( ) {
                               return 0;
                           }
                       });

                       this.chairList.get(i).getStudents().add(new Student(id, name, '0') {
                           @Override
                           public double calculateSalary ( ) {
                               return 0;
                           }
                       });
                       i = i + size;
                   }
                       i = i + 1;
                   }
               break;
           case 4:
               System.out.println("Create Teacher Module");
               System.out.println("What type or teacher:");
               System.out.println("1. Fulltime");
               System.out.println("2. PartTime");
               i=reader.nextInt();

               switch (i){
                   case 1:
                       System.out.println("What is the Area");
                       String area = reader.next();
                       System.out.println("What is the Id");
                       id = reader.nextInt();
                       System.out.println("What is the name");
                       name = reader.next();
                       System.out.println("What is the years");
                       j= reader.nextInt();
                       this.teacherList.add(new TeacherFull(area,id,name,j) {
                           @Override
                           public String getArea ( ) {
                               return super.getArea();
                           }
                       });

                       break;
                   case 2:
                       System.out.println("What is the hours");
                        i = reader.nextInt();
                       System.out.println("What is the Area");
                       area = reader.next();
                       System.out.println("What is the Id");
                       id = reader.nextInt();
                       System.out.println("What is the name");
                       String name1= reader.next();
                       System.out.println("What is the years");
                       j= reader.nextInt();
                       this.teacherList.add(new TeacherPart(i,area,id,name1,j));


                       break;
                   default:

               }


               break;
           case 5:

               System.out.println("Name of the New Chair");
                name = reader.next();
               System.out.println("Where is the Chair");
               classroom =reader.next();
               System.out.println("What is the Teacher Id");
               id = reader.nextInt();
               List<Student> student = new ArrayList<>();
               i=1;

               while(i!=0) {

                   System.out.println("Type the Ids of the the Students");
                   System.out.println("If you finish type 0");
                   i = reader.nextInt();

                   if (i != 0) {
                       band=false;
                       for (j = 0; j < this.studentList.size(); ++j) {

                           if (this.studentList.get(j).getId()==i) {
                               Student studentClass = new Student(((Student) this.studentList.get(j)).getId(), ((Student) this.studentList.get(j)).getName(), this.studentList.get(j).getYears()) {
                                   @Override
                                   public double calculateSalary ( ) {
                                       return 0;
                                   }
                               };
                               student.add(studentClass);
                               band=true;
                               System.out.println("Guardado");
                           }


                       }

                       if(band==false){
                           System.out.println("The Student Id does Not Exist");
                       }

                   }
               }


               this.chairList.add(new Chair(chairList.get(chairList.size()-1).getIdClass()+100,name,classroom,id,student));
                    System.out.println("New Chair saved");

               break;
           case 6:
               System.out.println("Consult of Schedule of a student");
                id=reader.nextInt();
                size=studentList.size();
                int size1;
                int size2;
                int k;
                i=0;
                band=false;
                while (i<size){
                    if(id==studentList.get(i).getId()){
                        band= true;
                        System.out.println("The student data");
                        System.out.println("Nombre:"+studentList.get(i).getName());
                        System.out.println("Id:"+studentList.get(i).getId());
                        System.out.println("years:"+studentList.get(i).getYears());
                        System.out.println("Chairs of the student");
                        size1=chairList.size();
                        j=0;
                        band=false;
                        while (j<size1){
                            size2=chairList.get(j).getStudents().size();
                            k=0;
                               while (k<size2){
                                   if(id==this.chairList.get(j).getStudents().get(k).getId()){
                                        System.out.println(this.chairList.get(j).getSubject());
                                        band=true;
                                   }
                                   k=k+1;
                               }
                            j=j+1;
                        }

                    }
                    i=i+1;
                }

                if(band==false){
                    System.out.println("The Student does not exist");
                }

               break;
           default:
               System.out.println("Thanks for use this Program");
               break;
       }
   }
}
