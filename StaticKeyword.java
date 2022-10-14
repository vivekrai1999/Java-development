class StaticKeyword {
    // instance variable
    // instance variables are created everytime the objectof the class is created.
    public int x;
    // static variable
    // static variables are defined for the class and does not have any depenndency on the object.
    public static int y;

    // instance function
    public void fun1(){
        System.out.println("Vale of x is :"+x);
    }
    // Static function.
    // Static function can only access static variables of the class.
    public static void fun2(){
        // System.out.println("Vale of x is :"+x);  not possible as x is not a static member.
        // static function can only access static member varibales.
        System.out.println("Value of y is: "+y);
    }

    public static class Test{
        public static int number = 50;
    }
}

class Hello {
    public static void main(String[] args){
        StaticKeyword ex1 = new StaticKeyword();
        // Accessing instance members by crrating objects.
        ex1.x = 5;
        ex1.fun1();
        // Accessing Static members directly by class name.
        StaticKeyword.y = 10;
        StaticKeyword.fun2();

        // Accessing Static class directly by class name.
        System.out.println(StaticKeyword.Test.number);
    }
}
