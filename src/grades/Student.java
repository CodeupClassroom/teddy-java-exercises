package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public static void main(String[] args) {
        Student student = new Student("Sandi Metz");
        student.addGrade(100);
        student.addGrade(99);
        student.addGrade(100);
        student.addGrade(99);
        student.addGrade(98);
        System.out.println(student.getName() + " has a grade of: " + student.getGradeAverage());
    }

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double total = 0;
        for(int grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }

}
