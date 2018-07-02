public class InheritenceTest{


  public static void main(String[] args){
    Parent p = new Parent();
    Child1 c1 = new Child1();
    Child2 c2 = new Child2();

    System.out.println();
    System.out.println("Examples of overriding...");
    p.name(); //Parent class, calls parent's name method
    c1.name(); //Child class, calls child's name method, because one exists so the parent's method is overided
    c2.name(); //Child class, call's parents, because there is no overriding

    System.out.println();
    System.out.println("Examples of overloading...");
    p.arguments(); //Calls the method with no arguemnts
    p.arguments(1); //Calls the method with 1 arguemnt
    p.arguments(1, 1); //Calls the method with 2 arguemnts

  }
}
