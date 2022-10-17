class Box {
    private int l,b,h; // instance variable
    // setDimension function can access both instance variable and local variable
    // as there will be name conflict we need to specify the instance variable
    // this keyword is a reverence variable which has reference of current object.
    // every instance member method of a class has implementation of this keyword.
    // this has reference of the caller object
    // use 1: when there is a name conflict
    public void setDimension(int l, int b, int h){ // local variables
    //instance variable = local vareiable
        this.l=l; // can be interpreted as b1.l(b1 object ka instance variable l)
        this.b=b;
        this.h=h;
    }

    public void showDimension(){
        System.out.println(l);
        System.out.println(b);
        System.out.println(h);
    }

    // Not so important implementation

    public class Gift{
        public void given(Box b){
            System.out.println("gift recieved");
        }
    }

    public void giftGiven(){
        Gift gf = new Gift();
        gf.given(this); // this here refered as b1
    }

}

public class ThisExample{
    public static void main(String[] args){
        Box b1 = new Box();
        b1.setDimension(12, 20, 30);
        b1.showDimension();
    }
}
