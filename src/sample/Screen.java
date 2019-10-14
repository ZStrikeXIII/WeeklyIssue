package sample;

public class Screen implements ScreenSpec {

  String resolution;
  int refreshrate;
  int responsetime;

  public String getResolution() {
    return resolution;
  }

  public int getRefreshRate() {
    return refreshrate;
  }

  public int getResponseTime() {
    return responsetime;
  }
}
