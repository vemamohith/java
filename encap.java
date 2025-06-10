class encap {
   private int roll ;
   private String name;
   private int marks;
   
   public void setter(int roll, String name, int marks) {
    if(roll>0) {
        this.roll = roll;
    } else {
        System.out.println("Enter valid roll number");
        return;
    }
    this.name = name;
    if(marks>0) {
        this.marks = marks;
    } else {
        System.out.println("enter valid  marks");
        return;
    }
   }
   public String getname() {
    return name;
   }
   public int getroll(){
    return roll;
   }
   public int getmarks() {
    return marks;
   }
}
