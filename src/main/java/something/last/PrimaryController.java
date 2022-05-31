package something.last;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.stage.Stage;

import java.io.IOException;

public class PrimaryController {

   
   
    @FXML
    private LineChart<?, ?> LineChart;

    @FXML
    private CategoryAxis x;

    @FXML
    private NumberAxis y;
    
    @FXML
    void second(ActionEvent event) {

    }
 
    @FXML
    protected void onFirstButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("silver.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Silver");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onsecondClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("palmoil.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Palmoil");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onthirdClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("oil.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Coal");
        stage.setScene(scene);
        stage.show();
    }


   
   
}
