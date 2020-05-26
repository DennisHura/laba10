package com.company;
import java.lang.String;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Label nameLbl = new Label("Введите число(не больше 9):");
        TextField number = new TextField();
        Label msg = new Label();
        msg.setStyle("fx-text-fill: red;");
        Button drawBtn = new Button("Нарисовать");
        Button exitBtn = new Button("Выход");
        drawBtn.setOnAction(e -> {
            int n = Integer.parseInt(number.getText());
            String str = "";


            for(int i = n ; i > 0; i--){
                for(int j = 0; j < i; j++){
                    str+=j+1;
                }
                str+="\n";
            }

            if (n>= 1 && n<=9) {
                msg.setText(str);
            } else {
                msg.setText("ведите число от 0 до 9");
               // Platform.exit();
            }
        });
        exitBtn.setOnAction(e -> Platform.exit());
        VBox root = new VBox();
        root.setSpacing(15);
        root.getChildren().addAll(nameLbl, number,
                msg, drawBtn, exitBtn);
        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        stage.setTitle("lab_10_Denys_Hura_KB-71");
        stage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
