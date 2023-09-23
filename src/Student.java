/*
  @author   george
  @project   students-group
  @class  Student
  @version  1.0.0 
  @since 23.09.23 - 15.36
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student extends Person {
    private StGroup group;

    public Student(String pib, StGroup group) {
        super(pib);
        this.group = group;
    }

}
