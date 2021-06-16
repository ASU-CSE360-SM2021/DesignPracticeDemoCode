/**** Sources:
https://www.geeksforgeeks.org/facade-design-pattern-introduction/
http://www.newthinktank.com/2012/09/facade-design-pattern-tutorial/
*****/

public class Main {
  public static void main(String[] args) {
    PianoManager manager = new PianoManager();

    manager.getPianoInfo("Upright");
  }
}