class Constructor{
    private int x;
    Constructor(){
        System.out.println("x: "+x);
        System.out.println("Updating value of x for object");
        x = 10;
        System.out.println("x: "+x);
    }

    
        public static void main(String[] args){
            Constructor c1 = new Constructor();
            Constructor c2 = new Constructor();
        }
    
}
