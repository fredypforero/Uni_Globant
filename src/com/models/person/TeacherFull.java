package com.models.person;

import com.models.chair.Chair;
import com.models.utils.Init;

import java.util.List;

public abstract class TeacherFull extends Person {
    private List<Chair> chairList = Init.chairList();
       private String area;

    public TeacherFull (String area, int id, String name, int years) throws Exception {
        super(id, name, years);
        this.area = area;
    }

    public String getArea ( ) {
        return area;
    }

    public void setArea (String area) {
        this.area = area;
    }

    public double calculateSalary ( ) {
        double salary = 1000;
        double Bonus = (double)this.getYears() * 1/10;
        return salary + salary * Bonus;
    }
    public String toString() {
        return "Identification='" + this.getId() + '\'' + ",Name=" + this.getName() + ", Years in UG=" + this.getYears();
    }

}
