public class WrapperClass {
    // there can be two ways by which an integer can be declared.
    // 1. by using primitive data type(not an object oriented method)
    // public int x;
    // 2. by creating a class with single variable(object oriented method)
    // public class Int{
    //     public int y;
    // }
    // there are alreday available wrapper class for the above
    /*
     * boolean -> Boolean
     * char    -> Character
     * byte    -> Byte
     * short   -> Short
     * int     -> Int
     * long    -> Long
     * float   -> Float
     * double  -> Double
     */
    // using wrapper class
    public static void main(String[] args){
        // valueOf method return an object of relative wrapper class, static type
        // 123 ek object ki form m hai
        Integer i1 = Integer.valueOf(123);
        System.out.println(i1);
        // parseXXX method returns corresponding XXX value (XXX -> primitive data type), static type
        int x = Integer.parseInt("456");
        System.out.println(x);
        // XXXvalue method returns corresponding primitive type and it is an instance member function so there is need of creating object
        // 123 corresponding primitive type m change ho gya.
        int c = i1.intValue();
        System.out.println(c);
    }
}
