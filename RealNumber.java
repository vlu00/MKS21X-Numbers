public class RealNumber{
  private double x;

  public RealNumber() {
    x = 10;
  }

  public RealNumber(double value) {
    x = value;
  }

  public double getX() {
    return x; 
  }

  public String toString() {
    return "" + getX();
  }

}
