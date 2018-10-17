public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(nume * 1.0 / deno + nume % deno);
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    }
    else {
      nume = numerator;
      deno = denominator;
    }
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



  /******************Operations!!!!****************/


  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    double nume;
    double deno;
    nume = this.numerator * other.numerator;
    deno = this.denominator * other.denominator;
    RationalNumber A = new RationalNumber(nume, deno);
    A.reduce();
    return A;
  }

  public RationalNumber divide(RationalNumber other){
    return this.nultiply(reciprocal(other));
  }

  public RationalNumber add(RationalNumber other){
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    return null;
  }
}
