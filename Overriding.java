class Car {
    public void shiftGear(int x){
        System.out.println("CAr");
    }
}
class SuperCar extends Car {
    public void shiftGear(int x){
        System.out.println("supercar");
    }
}

public class Overriding{
    public static void main(String[] args) {
        SuperCar s1 = new SuperCar();
        s1.shiftGear(2);
    }
}
