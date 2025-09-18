package Oops.ObjectOrientedDesignPrinciple;



import java.util.ArrayList;
import java.util.List;

/**
 * Subject class represents a single course taken by a student.
 * It contains the subject name and the marks obtained.
 */
class Subject {
    private String subjectName;
    private int marks;

    public Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getMarks() {
        return marks;
    }
}

/**
 * Student class holds personal details and manages a collection of Subject objects (Composition).
 */
class Student {
    private String name;
    private int rollNo;
    private List<Subject> subjects;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }
}

/**
 * GradeCalculator class provides the logic to calculate the grade (Uses relationship).
 */
class GradeCalculator {
    public String calculateGrade(Student student) {
        List<Subject> subjects = student.getSubjects();
        if (subjects.isEmpty()) {
            return "N/A";
        }

        int totalMarks = 0;
        for (Subject subject : subjects) {
            totalMarks += subject.getMarks();
        }

        double average = (double) totalMarks / subjects.size();

        // Grading logic
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

/**
 * The main application class for running the school result system.
 */
public class schoolresultApplication {

    public static void main(String[] args) {
        // 1. Create a Student object (John, rollNo 101)
        Student john = new Student("John", 101);

        // 2. Create Subject objects and add them to the student
        john.addSubject(new Subject("Maths", 85));
        john.addSubject(new Subject("Physics", 78));
        john.addSubject(new Subject("Chemistry", 92));

        // 3. Create a GradeCalculator object
        GradeCalculator calculator = new GradeCalculator();

        // 4. Calculate and print the result
        String finalGrade = calculator.calculateGrade(john);

        System.out.println("--- Student Result ---");
        System.out.println("Name: " + john.getName());
        System.out.println("Roll No: " + john.getRollNo());
        System.out.println("Subjects and Marks:");
        for (Subject s : john.getSubjects()) {
            System.out.println("  - " + s.getSubjectName() + ": " + s.getMarks());
        }
        System.out.println("\nFinal Grade: " + finalGrade);
    }
}