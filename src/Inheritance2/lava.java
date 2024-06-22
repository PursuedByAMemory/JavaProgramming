package Inheritance2;

public class lava {
    public static void main(String[] args){
        Base b = new Base();
        Derived d = new Derived();
        d.setX(8);
        System.out.println(d.getX());
    }
}

class Base{
    int x;

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public void methExample1(){
        System.out.println("Base Method Print");
    };
}

class Derived extends Base{
    String y;
    @Override
    public void methExample1(){
        System.out.println("Derived class print");
    }

    public String getY(){
        return y;
    }
    public void setY(String y){
        this.y = y;
    }
}
