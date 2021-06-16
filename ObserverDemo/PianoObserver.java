public class PianoObserver {

  public PianoObserver(){

  }
  
  public void notifyUpdate(int updateType, String arg) {
    
    if(updateType == 1){
      System.out.println("Piano Type: " + arg);
    }
    if(updateType == 4){
      System.out.println("Piano String length: " + arg);
    }
  }

  public void notifyUpdate( int updateType, boolean arg) {
    System.out.println("Piano is acoustic: " + arg);
  }

  public void notifyUpdate( int updateType, int arg) {
    System.out.println("Piano has " + arg + " keys.");
  }
}