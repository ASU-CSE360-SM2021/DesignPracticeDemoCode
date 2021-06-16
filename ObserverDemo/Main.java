/***** Sources
https://www.geeksforgeeks.org/observer-pattern-set-2-implementation/
*****/
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    PianoObserver po = new PianoObserver();
    PianoInfo pi = new PianoInfo(po);

    pi.setTypeName("Digital");
    pi.setIsAcoustic(false);
    pi.setNumKeys(88);    
  }
}