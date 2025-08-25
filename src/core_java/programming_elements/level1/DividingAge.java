package programming_elements.level1;

public class DividingAge { public static void main(String[] args) {
    int pen=14;
    int students=3;
    int eachStudentWillGet=pen/students;
    int remaningPen=pen%students;

    System.out.println("The Pen Per Student is "+eachStudentWillGet+" and the remaining pen not distributed is "+remaningPen);
}
}
