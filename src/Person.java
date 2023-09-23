/*
  @author   george
  @project   students-group
  @class  Person
  @version  1.0.0 
  @since 23.09.23 - 15.31
*/

import jdk.jfr.DataAmount;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Person {
    String pib;
}
