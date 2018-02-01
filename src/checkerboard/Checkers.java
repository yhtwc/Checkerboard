/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 */
public class Checkers {
    
    private AnchorPane anchorPane = new AnchorPane();
    
    private int NUMROWS;
    private int NUMCOLS;
    
    private double boardWidth;
    private double boardHeight;
    
    private double rectWidth;
    private double rectHeight;
    
    private Color darkColor;
    private Color lightColor;
    
    private Color color;
    
    public Checkers(int numRows, int numCols, double boardWidth, double boardHeight)
    {
        this(numRows, numCols, boardWidth, boardHeight, Color.RED, Color.BLACK);   
    }
    
    public Checkers(int numRows, int numCols, double boardWidth, double boardHeight, Color lightColor, Color darkColor)
    {
        NUMCOLS = numCols;
        NUMROWS = numRows;
        
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        
        this.rectWidth = this.boardWidth / NUMCOLS;
        this.rectHeight = this.boardHeight / NUMROWS;
        
        this.lightColor = lightColor;
        this.darkColor = darkColor;
    }
    
    public AnchorPane getBoard() {
        build();
        
        if(anchorPane == null)
        {
            return null;
        }
        else
            return anchorPane;
    }
    
    public AnchorPane build() {
        //anchorPane = new AnchorPane();
        for (int row = 0; row < getNumRows(); row++) 
        {
            for (int col = 0; col < getNumCols(); col++) 
            {
                if(col % 2 == 0 && row % 2 == 0)
                    color = getLightColor();
                else if (row % 2 != 0 && col %2 != 0)
                    color = getLightColor();
                else
                    color = getDarkColor();
                
                Rectangle rect = new Rectangle(getRectangleWidth(), getRectangleHeight(), color);
                
                AnchorPane.setTopAnchor(rect, getRectangleHeight() * row);
                AnchorPane.setLeftAnchor(rect, getRectangleWidth() * col);
                
                anchorPane.getChildren().add(rect);

            }
        }   
        return anchorPane;
     }
    
    public int getNumRows(){
        return NUMROWS;
    }
    
    public int getNumCols(){
        return NUMCOLS;
    }
    
    public double getWidth(){
        return boardWidth;
    }
    
    public double getHeight(){
        return boardHeight;
    }
    
    public Color getLightColor(){
        return lightColor;
    } 
    
    public Color getDarkColor(){
        return darkColor;
    }
        
    public double getRectangleWidth(){
        return rectWidth;
    }
    
    public double getRectangleHeight(){
        return rectHeight;
    }
}
