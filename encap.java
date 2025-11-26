// // class encap {
// //    private int roll ;
// //    private String name;
// //    private int marks;
   
// //    public void setter(int roll, String name, int marks) {
// //     if(roll>0) {
// //         this.roll = roll;
// //     } else {
// //         System.out.println("Enter valid roll number");
// //         return;
// //     }
// //     this.name = name;
// //     if(marks>0) {
// //         this.marks = marks;
// //     } else {
// //         System.out.println("enter valid  marks");
// //         return;
// //     }
// //    }
// //    public String getname() {
// //     return name;
// //    }
// //    public int getroll(){
// //     return roll;
// //    }
// //    public int getmarks() {
// //     return marks;
// //    }
// // }


// class encap {

//     private int amount ;
//     void withdraw(int amount){
//         if (this.amount >= amount) {
//             this.amount= amount - amount;
//             System.out.println("done successfully " + amount);
//         } else {
//             System.out.println("balance is low " + amount);
//         }        
//     }   
//     void setter(int amount) {
//         if (amount > 0){
//             amount += amount;
//             System.out.println("the updated balance is : " + amount);
//         } else {
//             System.out.println("please enter valid amount ");
//         }
//     }
//     public static void main(String[] args) {
//         encap en = new encap();
//         en.setter(-500);
//     }   
// }



public class encap {
    encap(int a, int b) {
        System.out.println(a+b);
    }
    encap (char a, char b){
        System.out.println(a);
    }
    public static void main(String[] args) {
        encap en = new encap(1,2);
        // encap en1 = new encap();
    }
}