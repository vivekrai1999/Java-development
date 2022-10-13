public class ClassesAndObjects {
    // private variable can only be accessed inside the class
    private int length, breadth, height;
    // public functions can be called from outside the class by jvm
    public void setDimension(int l, int b, int h){
        length = l;
        breadth = b;
        height = h;
    }
    // public functions can be called from iutside the class by jvm
    public void showDimension(){
        System.out.println("l: "+length);
        System.out.println("b: "+breadth);
        System.out.println("h: "+height);
    }
}
