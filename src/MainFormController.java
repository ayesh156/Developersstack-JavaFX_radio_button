import javafx.event.ActionEvent;
import javafx.scene.control.RadioButton;

public class MainFormController {

    public RadioButton rBtnMale;
    public RadioButton rBtnFemale;

    public void printDataOnAction(ActionEvent actionEvent) {
        /* if (rBtnFemale.isSelected()){
            System.out.println("Female");
        }else {
            System.out.println("Male");
        } */

        /* String gender = rBtnFemale.isSelected() ? "Female" : "Male";
        System.out.println(gender); */

        System.out.println(rBtnFemale.isSelected() ? "Female" : "Male");

    }
}
