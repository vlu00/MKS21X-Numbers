public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0);
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    }
    else {
      numerator = nume;
      denominator = deno;
    }
    reduce();
  }

  public double getValue(){
    return numerator / denominator + numerator % denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    if (numerator == 0) {
      return new RationalNumber(0, 1);
    }
    else {
      return new RationalNumber(this.denominator, this.numerator);
    }
  }

  //public boolean equals(RationalNumber other){
  //  if
  //  return false;
  //}

  public String toString(){
    if (denominator == 1) {
      return "" + getNumerator();
    }
    if (numerator == 0) {
      return "" + 0;
    }
    return getNumerator() + "/" + getDenominator();
  }

  public static int gcd(int a, int b){
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  private void reduce(){
    int g = gcd(numerator, denominator);
    numerator = numerator / g;
    denominator = denominator / g;
  }
/*
  public RationalNumber multiply(RationalNumber other){
    double nume;
    double deno;
    nume = (double)this.numerator * other.numerator;
    deno = (double)this.denominator * other.denominator;
    RationalNumber A = new RationalNumber(nume, deno);
    A.reduce();
    return A;
  }

  public RationalNumber divide(RationalNumber other){
    return this.nultiply(reciprocal(other));
  }

  public RationalNumber add(RationalNumber other){
  }
*/
}
