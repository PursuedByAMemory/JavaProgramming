class Animal{
    public void walk(){
        System.out.println("I walk");
    }
    public void eat(){
        System.out.println("I eat");
    }
    public void speak(){
        System.out.println("Mouth Noises");
    }
    int x;
    public int getx(){
        return x;
    }
    public void setx(int val){
        x = val;
    }
    Animal(int a){
        System.out.println("I am a constructor, in Base class with val "+a);
    }
    Animal(){
        System.out.println("I am a constructor, in Base class");
    }
}
class Dog extends Animal{
    @Override
    public void walk(){
        System.out.println("I walk on all fours like a Dogg");
    }
    @Override
    public void eat(){
        System.out.println("I eat like a dog");
    }
    @Override
    public void speak(){
        System.out.println("Woof!");
    }
    int y;

    public int gety(){
        return y;
    }
    public void sety(int val){
        y = val;
    }
    Dog(){
        super(0);
        System.out.println("I am the constructor of Derived class");
    }
    Dog(int b){
        System.out.println("I am the constructor of Derived class with val "+b);
    }
}
class InheritanceExperiment{
    public static void main(String[] args){
        Dog d = new Dog();
        //Animal a = new Animal();
        d.speak();
        //a.speak();


    }
}