/*
  @author   george
  @project   students-group
  @class  Tutor
  @version  1.0.0 
  @since 23.09.23 - 16.09
*/

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Tutor extends Person{
    private String department;
    private String occupation;

    public Tutor(String pib) {
        super(pib);
    }

    public Tutor(String pib, String department, String occupation) {
        super(pib);
        this.department = department;
        this.occupation = occupation;
    }

}
