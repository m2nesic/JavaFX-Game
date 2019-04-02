import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Game extends Application {

    private GameObject player = new GameObject(0,300,40,40,"player", Color.BLUE);

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage myStage) throws Exception{
        myStage.setTitle("JavaFx-Game");

        StackPane myPane = new StackPane();
        Scene scene = new Scene(myPane,600,800);
        myPane.getChildren().add(player);

        myStage.setScene(scene);
        myStage.show();


    }

}
