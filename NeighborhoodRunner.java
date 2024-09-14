import org.code.neighborhood.*;

/*
the following code will create the ghost from Pac Man, change the color arguments passed in on
lines 15 and 16 to experiment with differnet colored ghosts
*/


public class NeighborhoodRunner {
  public static void main(String[] args) {
    
  BackgroundPainter Salik = new BackgroundPainter();
  //instantiate a new painter object who's job is to paint the ghost outline color

  Salik.ghost(8, "red", 8); // method paints ghost's color 
  background("white");

  }

  
  public static void background(String back_color){
    CharacterPainter Salik2 = new CharacterPainter(back_color);
    //instantiate a new character painter object and pass in color of background
    Salik2.top_left_corner(); //paint each component through a different method
    Salik2.right_outline();
    Salik2.both_eyes();
    Salik2.legs();
  }



  
}