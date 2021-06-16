/***** Sources
https://dzone.com/articles/decorator-design-pattern-in-java
*****/

public class Main {
  public static void main(String[] args) {
    // Make a digital piano made out of plastic
    Piano sample1 = new MaterialDecorator( new DigitalPiano(), "plastic" );
 
    sample1.getPianoInfo();

    System.out.println("**********"); // line to make output a bit easier to read

    // Make a grand piano with a length of 5 feet, and made out of wood
    Piano sample2 = new MaterialDecorator( 
      new LengthDecorator( new GrandPiano(), "5 feet" ), 
      "wood" );

    sample2.getPianoInfo();
  }
}