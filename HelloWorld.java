public class HelloWorld{
    public static void main(String[] args){
        // print function does not go to new line
        // use \n for new line
        // System.out.print("Hello java \n");
        // // println function gor=es to new line
        // System.out.println("this is next line");
        // System.out.println("I am at new line");

        // Comments in java
        // 1. Block Style:
        /* this is a blockm style comment 
        used dfot multi line comments */

        // 2. Line style
        // this is a line stle comment, terminated as soon as the line ends

        //3. documentstion style
        /** this style of comment is used for documnetation */

        // Type Conversion in java
        // 1. Widening  conversion:
        // A smaller datatype element is kept inside a larger data type variable.
        // no data loss
        // done autometically
        // E.g. 
        int y = 3;
        float x = y;
        System.out.println(x);
        
        // 2. Narrowing conversion
        // A larger size datatype element is kept into a smaller size datatype variable.
        // not done autometically
        // loss of data
        // there will be an error
        // type cast is done by user itself
        // e.g.
        float a = 3.5f; // it is necessary to add a suffix f to define a float otherwise it will be treated as double
        int b = (int)a;
        System.out.println("a: "+a);
        System.out.println("b: "+b); // loss os data here


    }
}