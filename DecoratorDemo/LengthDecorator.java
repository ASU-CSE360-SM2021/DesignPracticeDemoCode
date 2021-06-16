public class LengthDecorator extends PianoDecorator {
  String pianoLength;

  public LengthDecorator( Piano arg1, String arg2 ) {
    super( arg1 ); // Call the PianoDecorator constructor

    pianoLength = arg2;
  }

  public void getPianoInfo() {
    decoratedPiano.getPianoInfo(); // Call the base class's getPianoInfo()

    System.out.println( "Has a lenght of: " + pianoLength );
  }
}