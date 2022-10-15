// 1. Overloading when one method in superclass and one method in subclass
// class A{
//     public void someFunction(int x){
//         System.out.println("A");
//     }
// }
// class B extends A{
//     public void someFunction(int x, int y){
//         System.out.println("B");
//     }
// }
// public class overloading {
//     public static void main(String[] args){
//         B obj1 = new B();
//         obj1.someFunction(1);
//         obj1.someFunction(1,2);
//     }
// }

// 2. overloading in same superclass

// class A{
//     public void someFunction(int x){
//         System.out.println("A");
//     }
//     public void someFunction(int x, int y){
//         System.out.println("B");
//     }
// }
// class B extends A{
    
// }
// public class overloading {
//     public static void main(String[] args){
//         B obj1 = new B();
//         obj1.someFunction(1);
//         obj1.someFunction(1,2);
//     }
// }

// 3. overloading in smae subclass

// class A{
    
// }
// class B extends A{
//     public void someFunction(int x){
//         System.out.println("A");
//     }
//     public void someFunction(int x, int y){
//         System.out.println("B");
//     }
// }
// public class overloading {
//     public static void main(String[] args){
//         B obj1 = new B();
//         obj1.someFunction(1);
//         obj1.someFunction(1,2);
//     }
// }
