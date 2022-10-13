// creating a class in java
class Box {
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

// creating an object in java

class ClassesAndObjects {
    public static void main(String[] args){
        // An object is made with the help of new keyword
        Box smallBox = new Box();
        smallBox.setDimension(12, 10, 5);
        smallBox.showDimension();

        // assigning new object to reference varibale smallbox
        smallBox = new Box();
        smallBox.showDimension();
    }
}
