package constructor;

public class cons {
    int age;
    String name;

    public cons (int age, String name) {
       this.age = age ;
       this.name = name;
    }

    // Copy constructor
    public cons(cons other) {
        this.age = other.age;
        this.name = other.name;
    }
    public static void main(String[] args) { 

      cons con = new cons(20,"mohith");

      cons con2 = new cons(con);

      System.out.println(con2.aget);
      
      
      
    }
}

