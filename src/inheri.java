public class inheri {
    public static class A{
        int value = 8;
        public void prints(){
            System.out.println("Hello from class A");
        }
    }
    public interface attack{
        int dmg = 12;
        int spl = 200;
    }
    public interface movement{
        int spd = 5;
    }
    public static class Warrior implements attack, movement{
        int dmg = 20;
        int spd = 2;
        public void printMessage(){
            System.out.println("A Warrior");
        }
    }
    public static class B extends A{
        @Override
        public void prints(){
            System.out.println("Hello from class B");
        }
        public void printsA(){
            super.prints();
        }
    }
    public static void main(String[] args){
        Warrior w = new Warrior();
        B b = new B();
        A a = new A();
        System.out.println(w.dmg);
        System.out.println(w.spl);
        over o = new over();
        b.prints();
        b.printsA();
        System.out.println(o.sum(3,6,9));
        System.out.println(b.value);
    }
    public static class over {
        public int sum(int a, int b) {
            return a + b;
        }

        public int sum(int a, int b, int c) {
            return a + b + c;
        }
    }
}
