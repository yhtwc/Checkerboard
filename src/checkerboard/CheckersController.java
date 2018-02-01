/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 */
public class CheckersController implements Initializable {
    
    
    @FXML
    private VBox vBox;
    
    @FXML
    private MenuBar menuBar;
    
    @FXML
    private AnchorPane anchorPane;
    
    Checkers board;

    private Stage stage;

    int tempCols, tempRows;
    
    Color tempLightColor, tempDarkColor;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void ready(Stage stage) {
        this.stage = stage;
        //System.out.println(vBox.getWidth());
        board = new Checkers(8, 8, vBox.getWidth(), vBox.getHeight() - menuBar.getHeight(), Color.RED, Color.BLACK);
        anchorPane = board.getBoard();
        vBox.getChildren().add(anchorPane);
        
        ChangeListener<Number> changeListener;
        changeListener = (ObservableValue<? extends Number> observable, Number oldValue, final Number newValue) -> {
            anchorPane.getChildren().clear();
            board = new Checkers(board.getNumRows(), board.getNumCols(), vBox.getWidth(), vBox.getHeight() - menuBar.getHeight(), board.getLightColor(), board.getDarkColor());
            anchorPane = board.getBoard();
            vBox.getChildren().add(anchorPane);
        };

        this.vBox.widthProperty().addListener(changeListener);
        this.vBox.heightProperty().addListener(changeListener);
        
        tempRows = board.getNumRows();
        tempCols = board.getNumCols();
        
        tempLightColor = board.getLightColor();
        tempDarkColor = board.getDarkColor();
     
    }
   
    @FXML
    private void handle16(ActionEvent event) {
        //CheckersController(16, 16, anchorPane.getWidth(), anchorPane.getHeight());
        
        
        anchorPane.getChildren().clear();
        
        board = new Checkers(16, 16, vBox.getWidth(), vBox.getHeight() - menuBar.getHeight(), tempLightColor, tempDarkColor);
        
        tempRows = board.getNumRows();
        tempCols = board.getNumCols();
        
        tempLightColor = board.getLightColor();
        tempDarkColor = board.getDarkColor();
        
        anchorPane = board.getBoard();
        vBox.getChildren().add(anchorPane);
    }
    
    @FXML
    private void handle10(ActionEvent event) {
        //CheckersController(10, 10, anchorPane.getWidth(), anchorPane.getHeight());
        anchorPane.getChildren().clear();
        
        board = new Checkers(10, 10, vBox.getWidth(), vBox.getHeight() - menuBar.getHeight(), tempLightColor, tempDarkColor);

        tempRows = board.getNumRows();
        tempCols = board.getNumCols();
        
        tempLightColor = board.getLightColor();
        tempDarkColor = board.getDarkColor();
        
        anchorPane = board.getBoard();
        vBox.getChildren().add(anchorPane);
    }
    
    @FXML
    private void handle8(ActionEvent event) {
        //CheckersController(8, 8, anchorPane.getWidth(), anchorPane.getHeight());
        
        anchorPane.getChildren().clear();
            
        board = new Checkers(8, 8, vBox.getWidth(), vBox.getHeight() - menuBar.getHeight(), tempLightColor, tempDarkColor);
    
        tempRows = board.getNumRows();
        tempCols = board.getNumCols();
        
        tempLightColor = board.getLightColor();
        tempDarkColor = board.getDarkColor();
        
        anchorPane = board.getBoard();
        vBox.getChildren().add(anchorPane);
    }
    
    @FXML
    private void handle3(ActionEvent event) {
        //CheckersController(3, 3, anchorPane.getWidth(), anchorPane.getHeight());
        
        anchorPane.getChildren().clear();
        
        board = new Checkers(3, 3, vBox.getWidth(), vBox.getHeight() - menuBar.getHeight(), tempLightColor, tempDarkColor);
    
        tempRows = board.getNumRows();
        tempCols = board.getNumCols();
        
        tempLightColor = board.getLightColor();
        tempDarkColor = board.getDarkColor();
        
        anchorPane = board.getBoard();
        vBox.getChildren().add(anchorPane);
    }
    
    @FXML
    private void handleColorDef(ActionEvent event) {
//        lightColor = Color.RED;
//        darkColor = Color.BLACK;
//       
        anchorPane.getChildren().clear();
        board = new Checkers(tempRows, tempCols, vBox.getWidth(), vBox.getHeight() - menuBar.getHeight(), Color.RED, Color.BLACK);
    
        tempLightColor = board.getLightColor();
        tempDarkColor = board.getDarkColor();
        
        anchorPane = board.getBoard();
        vBox.getChildren().add(anchorPane);
    }
  
    @FXML
    private void handleColorBlue(ActionEvent event) {
        
        anchorPane.getChildren().clear();
        board = new Checkers(tempRows, tempCols, vBox.getWidth(), vBox.getHeight() - menuBar.getHeight(), Color.SKYBLUE, Color.BLUE);
    
        tempLightColor = board.getLightColor();
        tempDarkColor = board.getDarkColor();
        
        anchorPane = board.getBoard();
        vBox.getChildren().add(anchorPane);
    }
}
