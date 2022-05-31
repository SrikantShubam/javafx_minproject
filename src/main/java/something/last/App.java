package something.last;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


import javafx.application.Application;
import javafx.scene.Scene;
import java.io.IOException;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
/**
 * JavaFX App
 */

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
       XYChart.Series series=new XYChart.Series();
       series.getData().add(new XYChart.Data("1",209));
//       LineChart.getData().addAll(series);
       
        scene = new Scene(loadFXML("primary"), 700, 500);
        stage.setScene(scene);
        stage.setTitle("Commodities Market Screener");
        stage.show();
        
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}