public class Inheritance {
    public static void main(String[] args){
        base b = new base();
        derived d = new derived();
        d.setX(8);
        System.out.println(d.getX());
        d.setY(10);
        System.out.println(d.getY());

    }
}
    class base{
        int x;
        public int getX(){
            return x;
        }
        public void setX(int x){
            this.x = x;
        }
        public void printMe(){
            System.out.println("Im a constructor");
        }
    }

    class derived extends base{
        int y;
        public int getY(){
            return y;
        }
        public void setY(int y){
            this.y = y;
        }
    }
