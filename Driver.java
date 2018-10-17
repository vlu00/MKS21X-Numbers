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

    RationalNumber a = new RationalNumber(1, 2);
    RationalNumber b = new RationalNumber(1, 4);
    RationalNumber c = new RationalNumber(1, 5);

    System.out.println(a);
    System.out.println(b);
    System.out.println(a.add(b));
    System.out.println(a.subtract(b));
    System.out.println(a.divide(c));
    System.out.println(a.multiply(b));

  }
}
