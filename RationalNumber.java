public class RationalNumber extends RealNumber{
  public int numerator, denominator;
  public RationalNumber(int a, int b) {
    numerator = a;
    denominator = b;
  }

  public RationalNumber() {
    numerator = 1;
    denominator = 2;
  }

  public double getNumerator() {
    return numerator;
  }

  public double getDenominator() {
    return denominator;
  }

  public RationalNumber add (RationalNumber B){
    return new RationalNumber(0,10);
  }

  public RationalNumber subtract (RationalNumber B){
    return new RationalNumber(0,10);
  }

  public RationalNumber multiply (RationalNumber B){
    return new RationalNumber(0,10);
  }

  public RationalNumber divide (RationalNumber B){
    return new RationalNumber(0,10);
  }

  public RationalNumber compareTo(RationalNumber B) {
    return new RationalNumber(0,10);
  }

  public RationalNumber reduce (RationalNumber B){
    return new RationalNumber(0,10);
  }

  public double toDouble() {
    return numerator / denominator + numerator % denominator;
  }

  public String toString() {
    return numerator + "/" + denominator;
  }
}
