/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author sa
 */
public class Calculator1 extends Application {
    
        private TextField num1 = new TextField();
        private TextField num2 = new TextField();
        private TextField result = new TextField();
        
        private Button btAdd = new Button("Add");
        private Button btSub = new Button("Substract");
        private Button btMul = new Button("Multiply");
        private Button btDiv = new Button("Divide");
        private Button btReset = new Button("Reset");
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane g = new GridPane();
        g.setHgap(5);
        g.setVgap(5);
        g.add(new Label("Number 1: "), 0, 0);
        g.add(num1, 1, 0);
        g.add(new Label("Number 2:"), 2, 0);
        g.add(num2, 3, 0);
        g.add(new Label("Result:"), 4, 0);
        g.add(result, 5, 0);
        g.add(btAdd, 1, 3);
        g.add(btSub, 3, 3);
        g.add(btMul, 4, 3);
        g.add(btDiv, 6, 3);
        g.add(btReset, 3, 6);
        g.setBackground(Background.EMPTY);
        
        g.setAlignment(Pos.CENTER);
        result.setEditable(false);
        
        
        btAdd.setOnAction(e -> Addition());
        btSub.setOnAction(e -> Substract());
        btMul.setOnAction(e -> Multiply());
        btDiv.setOnAction(e -> Divide());
        btReset.setOnAction(e -> Reset());
        
        Scene scene = new Scene(g, 300, 250);
        
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void Addition(){
        double n1 = Double.parseDouble(num1.getText());
        double n2 = Double.parseDouble(num2.getText());
        
        
        Addition add = new Addition(n1,n2);
        result.setText(String.format("%.1f",add.getRe()));    
        
    }
    private void Substract(){
        double n1 = Double.parseDouble(num1.getText());
        double n2 = Double.parseDouble(num2.getText());
        
        Substract sub = new Substract(n1,n2);
        result.setText(String.format("%.1f",sub.getRe()));
        
        
    }
     private void Multiply(){
        double n1 = Double.parseDouble(num1.getText());
        double n2 = Double.parseDouble(num2.getText());
        
        Multiplication sub = new Multiplication(n1,n2);
        result.setText(String.format("%.1f",sub.getRe()));
        
     }
      private void Divide(){
        double n1 = Double.parseDouble(num1.getText());
        double n2 = Double.parseDouble(num2.getText());
        
        Division sub = new Division(n1,n2);
        result.setText(String.format("%.1f",sub.getRe()));
        
     }
      private void Reset(){
        num1.clear();
        num2.clear();
        result.clear();
      }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
