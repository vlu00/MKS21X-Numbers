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
  }
}
