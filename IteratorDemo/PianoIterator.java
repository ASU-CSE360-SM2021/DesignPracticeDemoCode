import java.util.ArrayList;

public class PianoIterator {
  ArrayList<PianoType> iteratorList;
  int index;

  public PianoIterator(ArrayList<PianoType> listOfPianos) {
    iteratorList = listOfPianos;
    index = 0;
  }

  public boolean hasNext(){
    boolean returnValue = false;

    if( index < iteratorList.size() )
      returnValue = true;

    return returnValue;
  }

  public PianoType getNext(){
    index++;

    return iteratorList.get( index-1 );
  }
}