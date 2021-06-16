public abstract class PianoDecorator implements Piano {
  protected Piano decoratedPiano;

  public PianoDecorator( Piano arg ) {
    super(); // Call the Piano constructor

    this.decoratedPiano = arg;
  }
}