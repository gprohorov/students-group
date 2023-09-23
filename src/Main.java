
/*
  @author   george
  @project   Default (Template) Project
  @class  ${NAME}
  @version  1.0.0 
  @since 23.09.23 - 15.30
*/

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Tutor docent = new Tutor("john","Software Engineering","docent");
        Tutor serhiy = new Tutor("Serhiy","Software Engineering","assistant");
        StGroup se243a = new StGroup("243a","Software Engineering", docent);
        Discipline java = new Discipline("Java Programming",35,0, 32, docent);
//--------------------------------------------
   Student john = new Student("john", se243a);
   Student tom = new Student("tom", se243a);
//-----------------------------------------------
        List<Progress> progresses = List.of(
                new Progress(john, java, docent, 80, LocalDate.of(2023, Month.JUNE, 7)),
                new Progress(tom, java, docent, 60, LocalDate.of(2023, Month.JUNE, 6))


        );



    }
}
