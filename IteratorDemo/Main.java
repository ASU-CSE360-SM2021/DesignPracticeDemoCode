import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<PianoType> listOfPianos = new ArrayList<PianoType>();
    
    listOfPianos.add( new PianoType("Upright", true, 88) );
    //listOfPianos.add( new PianoType("Grand", true, 88) );
    listOfPianos.add( new PianoType("Digital", false, 88) );

    PianoIterator it = new PianoIterator( listOfPianos );

    while( it.hasNext() ) {
      PianoType current = it.getNext();
      System.out.println("Piano Type: " + current.typeName);
      System.out.println("Piano is acoustic: " + current.isAcoustic);
      System.out.println("Piano has " + current.numKeys + " keys.");
    }
  }
}