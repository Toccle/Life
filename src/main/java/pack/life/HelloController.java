package pack.life;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField salary;

    @FXML
    TextField costOfFood;

    @FXML
    Button getSalary;

    @FXML
    Button buyFood;

    @FXML
    Button goToBar;

    @FXML
    Button addNewWorker;

    @FXML
    Button resign;

    @FXML
    Label barDescription;

    @FXML
    TableView listOfWorkers;
}