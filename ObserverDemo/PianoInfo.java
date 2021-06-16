/*****
The example from geeks for geeks notifies the observer with all the information. This example notifies the observer about only the changed information.
*****/

public class PianoInfo {
  String typeName;
  String stringLength;
  boolean isAcoustic;
  int numKeys;

  PianoObserver po;

  public PianoInfo(PianoObserver arg) {
    po = arg;
  }

  public void setTypeName(String arg1 ){
      typeName = arg1;

      po.notifyUpdate(1, typeName);
    po.notifyUpdate(4, "30");
  }

  public void setIsAcoustic(boolean arg2 ){
    isAcoustic = arg2;

    po.notifyUpdate(2, isAcoustic);
  }

  public void setNumKeys(int arg3 ){
    numKeys = arg3;

    po.notifyUpdate(3, numKeys);
  }
}