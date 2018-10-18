public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super((double)nume/deno);
    if (deno < 0) {
      numerator = -nume;
      denominator = -deno;
    }
    else if (deno == 0) {
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
    return numerator / (double)denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public boolean equals(RationalNumber other){
    return this.numerator == other.numerator &&
           this.denominator == other.denominator;
    }

  public String toString(){
    if (denominator == 1) {
      return "" + getNumerator();
    }
    if (numerator == 0) {
      return "" + 0;
    }
    return getNumerator() + "/" + getDenominator();
  }

  public RationalNumber reciprocal(){
    if (numerator == 0) {
      return new RationalNumber(0, 1);
    }
    else {
      return new RationalNumber(this.denominator, this.numerator);
    }
  }

  public static int gcd(int a, int b){
    if (a == 0) {
      return 1;
    }
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  private void reduce(){
    int g = gcd(Math.abs(numerator), Math.abs(denominator));
    numerator = numerator / g;
    denominator = denominator / g;
  }

  public RationalNumber multiply(RationalNumber other){
    RationalNumber A = new RationalNumber(this.numerator * other.numerator,
                                          this.denominator * other.denominator);
    A.reduce();
    return A;
  }

  public RationalNumber divide(RationalNumber other){
    return this.multiply(other.reciprocal());
  }

  public RationalNumber add(RationalNumber other){
    RationalNumber A = new RationalNumber (this.numerator * other.denominator + other.numerator * this.denominator,
                                          this.denominator * other.denominator);
    A.reduce();
    return A;
  }

  public RationalNumber subtract(RationalNumber other){
    RationalNumber A = new RationalNumber (this.numerator * other.denominator - other.numerator * this.denominator,
                                          this.denominator * other.denominator);
    A.reduce();
    return A;
  }
}
