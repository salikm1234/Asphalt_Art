import org.code.neighborhood.*;

public class BackgroundPainter extends PainterPlus {

public BackgroundPainter(){
  setPaint(1000); //give a Large amount of paint in constructor so it is only called once
}
  
  public void row(int columns, String color) { 
    //paint one full row, given the color paint, and the number of spaces needed to fill
    paint(color);
    for (int count = 1; count < columns; count++) {
    if(canMove()){
     move();
   }
    paint(color);
    }
  }

  public void ghost(int rows, String color, int columns) {
    //paint the full canvas the color that the ghost will be
    //pass in the number of rows and columns you wish to paint of the canvas
  for (int count = 0; count < (rows/2); count++) {
    row(columns, color);
    turnRight();
    if (canMove()){
    move();}
    turnRight();
    row(columns, color);
    turnLeft();
    if (canMove()){
    move();}
    turnLeft();
  
  }
  }
    
}
