/***** This is the facade that the end user interacts with *****/
public class PianoManager {

  UprightPiano upInfo;
  GrandPiano grInfo;

  public PianoManager(){
    upInfo = new UprightPiano();
    grInfo = new GrandPiano();
  }

   public void getPianoInfo(String type) {
     if( type == "Upright"){
      System.out.println( upInfo.getTypeName() );
      System.out.println( upInfo.getIsAcoustic() );
      System.out.println( upInfo.getNumKeys() );
     } else {
      System.out.println( grInfo.getTypeName() );
      System.out.println( grInfo.getIsAcoustic() );
      System.out.println( grInfo.getNumKeys() );
     }
  }
}