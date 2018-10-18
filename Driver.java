public class Driver {
  public static void main(String[]args){
    RealNumber A = new RealNumber(10);
    RealNumber B = new RealNumber(5);
    RealNumber C = new RealNumber(2.5);

    System.out.println(A);
    System.out.println(C);
    System.out.println(A.add(B));
    System.out.println(A.subtract(B));
    System.out.println(A.divide(C));
    System.out.println(A.multiply(B));

    RationalNumber a = new RationalNumber(-1, 2);
    RationalNumber b = new RationalNumber(2, -4);
    RationalNumber c = new RationalNumber(-1, -4);

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(a.getNumerator());
    System.out.println(a.getDenominator());
    System.out.println(a.reciprocal());
    System.out.println(a.gcd(2, 4));
    System.out.println(a.equals(b));
    System.out.println(a.equals(c));
    System.out.println(a.multiply(b));
    System.out.println(a.divide(b));
    System.out.println(a.add(c));
    System.out.println(a.subtract(c));



  }
}
