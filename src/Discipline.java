/*
  @author   george
  @project   students-group
  @class  Discipline
  @version  1.0.0 
  @since 23.09.23 - 16.05
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Data
public class Discipline {
    private String name;
    private int lectureAmount;
    private int practicalAmount;
    private int laboratoryAmount;
    private Tutor tutor;
}
