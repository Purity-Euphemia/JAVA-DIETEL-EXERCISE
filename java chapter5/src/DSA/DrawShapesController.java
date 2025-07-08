package DSA;




import java.awt.*;
import java.awt.event.ActionEvent;

public class DrawShapesController {
    @FXML
    private Canvas canvas;

    @FXML
    void strokeRectanglesButtomPressed(ActionEvent event) {
        draw("rectangles");

    }
        @FXML
        void strokeOvaIsButtonPressed (ActionEvent event){
            draw("ovals");
        }

        public void draw (String choice){
            GraphicsContext gc = canvas.getGraphicsContext2D();

            gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

            int step = 10;

            for (int count = 0; count < 10; count++) {
                switch (choice) {
                    case "rectangles":
                        gc.strokeRect(10 + count * step, 10 + count * step,
                                90 + count * step, 90 + count * step);
                        break;
                    case "ovals":
                        gc.strokeOval(10 + count * step, 10 + count * step,
                                90 + count * step, 90 + count * step);
                        break;
                }
            }
        }
    }

