public class Poly {
    public static void main(String[] args){
        Poly p = new Poly();
        System.out.println(p.sum(20, 30));
    }

    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int a, int b, int c){
        return a+b+c;
    }
}
