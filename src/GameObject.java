import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class GameObject extends Rectangle {
    boolean alive = false;
    final String type;
    boolean moveLeft = false, moveRight = false;

    GameObject(int x, int y, int width, int height, String type, Color color){
        super(width,height,color);
        this.type = type;
        setTranslateX(x);
        setTranslateY(y);
    }

    void movingLeft(){
        setTranslateX(getTranslateX() - 10);
    }
    void movingRight(){
        setTranslateX(getTranslateX() + 10);
    }
    void movingUp(){
        setTranslateY(getTranslateY() - 10);
    }
    void movingDown(){
        setTranslateY(getTranslateY() + 10);
    }
}
