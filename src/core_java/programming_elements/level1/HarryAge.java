package programming_elements.level1;

import java.time.LocalDate;

public class HarryAge {

        public static void main(String[] args) {
            int age=2000;
            int currdate= LocalDate.now().getYear();
            int diff=currdate-age;
            System.out.println("Age "+diff);

    }
}
