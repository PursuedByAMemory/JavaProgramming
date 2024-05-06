public class outer{
    int outNum = 8;
    public void heyFuncOut(){
        System.out.println("Hey from Outer class");
        class LocalInnerClass{
            String licVar = "An LIC Variable";
            public void printLIC(){
                System.out.println(licVar);
            }

        }
        LocalInnerClass lic = new LocalInnerClass();
        lic.printLIC();
    }
    public static class inner{
        int inNum = 9;
        public void heyFuncIn(){
            System.out.println("Hey from inner class");
        }
    }


    public static void main(String[] args){
        outer o = new outer();
        o.heyFuncOut();

        outer.inner i = new outer.inner(); //static inner class
        //outer.inner i = o.new inner(); if inner class is not static
        i.heyFuncIn();
    }
}