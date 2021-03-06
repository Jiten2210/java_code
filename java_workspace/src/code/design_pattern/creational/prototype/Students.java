package code.design_pattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Students implements Cloneable {

    public List<String> studentsList;

    public Students() {
        studentsList = new ArrayList<String>();
    }


    public Students(List<String> studentsList) {
        this.studentsList = studentsList;
    }

    public void addStudents() {
        studentsList.add("Jitu");
        studentsList.add("Tanu");
        studentsList.add("Pooja");
        studentsList.add("Sonu");
        studentsList.add("Vaidik");
    }

    public List<String> getStudentsList() {
        return studentsList;
    }

    // To provide a deep copy of students list.
    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> studentsListTemp = new ArrayList<String>();
        for (String s : this.getStudentsList()) {
            studentsListTemp.add(s);
        }
        return new Students(studentsListTemp);
    }
}
