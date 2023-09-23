/*
  @author   george
  @project   students-group
  @class  Progress
  @version  1.0.0 
  @since 23.09.23 - 16.14
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@AllArgsConstructor
@Getter
@Setter
@Data
public class Progress {
    private Student student;
    private  Discipline discipline;
    private Tutor tutor;
    private int evaluation;
    private LocalDate date;
}
