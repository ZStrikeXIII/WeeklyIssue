package sample;

public class MoviePlayer extends Product implements MultimediaControl {

  MoviePlayer(String nm, String mnfct, String tp) {
    super(nm, mnfct, tp);
  }

  public void play() {
    System.out.println("Playing movie");
  }

  public void stop() {
    System.out.println("Stopping movie");
  }

  public void previous() {
    System.out.println("Previous movie");
  }

  public void next() {
    System.out.println("Next movie");
  }
}
