public class EncapsulationTest{

  public static void main(String[] args) {

    Encapsulation e = new Encapsulation();

    int add = e.add(4, 2);
    int sub = e.subtract(4, 2);

    System.out.println("");
    System.out.println("Calling methods from EncapsulationTest class...");
    System.out.println("Input: 4, 2");
    System.out.println("Add: " + add);
    System.out.println("Subtract: " + sub);
    System.out.println("Accessing private variables...");


    //Next two line cause compiler error, because the variables are private
    //When the access modifier is changed to public their values print out

    //System.out.println("A: " + e.a);
    //System.out.println("B: " + e.b);
  }
}
