package com.models.person;

public class TeacherPart extends TeacherFull {
    int hours;
    public TeacherPart (int hours,String area, int id, String name, int years) throws Exception {
        super(area, id, name, years);
        this.hours=hours;
    }

    public int getHours ( ) {
        return hours;
    }

    public void setHours (int hours) {
        this.hours = hours;
    }

    public double calSalary ( ) {
        double hourValue = 10;
        return hourValue * (double)this.hours;
    }
    public String toString() {
        return "Id= " + this.getId() + "\tName= " + this.getName() + "\tExperience= " + this.getYears() + "\tFaculty= " + this.getArea() + "\tSalary= " + this.calSalary() + "\tHours per Week= " + this.hours;
    }
}
