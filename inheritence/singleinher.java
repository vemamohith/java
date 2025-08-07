package inheritence;

class b {
     
    
    public b() {  
        this(20)  ;       
        System.out.println("hello"); 
    }
    public b(int age) {
        System.out.println(age);
    }
    public static void main(String[] args) {
        b bobj = new b();
    }
}
