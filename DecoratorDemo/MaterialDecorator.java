public class MaterialDecorator extends PianoDecorator {
  String materialType;

  public MaterialDecorator( Piano arg1, String arg2 ) {
    super( arg1 ); // Call the PianoDecorator constructor

    materialType = arg2;
  }

  public void getPianoInfo() {
    decoratedPiano.getPianoInfo(); // Call the base class's getPianoInfo()

    System.out.println( "Made out of: " + materialType );
  }
}