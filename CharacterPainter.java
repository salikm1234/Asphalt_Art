import org.code.neighborhood.*;

public class CharacterPainter extends BackgroundPainter {

private String color2;
  
public CharacterPainter(String color){
  setPaint(1000);
  color2 = color; //pass constructor parameter to instance variable so different color backgrounds can be made
}


public void test(){ //testing method to move painter out to test reset()
  move();
  turnRight();
  move();
  move();
  move();
  move();
  move();
  turnLeft();
}

  
public void reset(){ 

 /*will cause painter to turn west, then go all the way to the wall, turn north 
 then go all the way to the top left corner, then turn until facing east
   */
  while(!isFacingWest()){
    turnLeft();
  }
for(int count = 0; count < 2; count++) {
  while(canMove()){
    move();
  }
  turnRight();
   }
}




public void top_left_corner(){
  //Will paint the top left corner of the background
  paint(color2);
  move();
  paint(color2);
  turnAround();
  move();
  turnLeft();
  move();
  paint(color2);
  reset();
}

public void right_outline(){
  /*will print the full row on the right side of the background, 
    using row method that was created in Background Painter class */
  while(canMove()){
    move();
  }
  paint(color2);
  turnAround();
  move();
  paint(color2);
  turnAround();
  move();
  turnRight();
  row(8, color2);
  reset();
}

  
public void one_eye(){
  //method prints L shape of the eye and returns to starting point
  paint(color2);
  move();
  paint(color2);
  turnLeft();
  move();
  paint(color2);
  turnAround();
  move();
  turnRight();
  move();
  turnAround();
}

public void both_eyes(){
  //navigates to middle of canvas and calls eye method twice
  turnRight();
  move();
  move();
  move();
  turnLeft();
  move();
  one_eye();
  move();
  move();
  move();
  one_eye();
  reset();
} 

public void legs(){
  //travels to the bottom of the canvas and paints the three squares to make legs
  turnRight();
  while(canMove()){
    move();
  }
  turnLeft();
  for(int count = 0; count < 3; count++) {
    move();
    paint(color2);
    move();
  } 
  reset();
}


  
}
