/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.fxexperience.javafx.scene.control.MoneyField;
import com.fxexperience.javafx.scene.control.skin.MoneyFieldSkin;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author genil
 */
public class TestMoney extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        MoneyField field = new MoneyField();
        MoneyFieldSkin skin = new MoneyFieldSkin(field);
        StackPane root = new StackPane();
        root.getChildren().addAll(field);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Money Test!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
