import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/*
  @author   george
  @project   students-group
  @class  StGroup
  @version  1.0.0 
  @since 23.09.23 - 15.31
*/
@AllArgsConstructor
@Getter
@Setter
@Data
public class StGroup {
    private String name;
    private String department;
    private Tutor curator;



}
