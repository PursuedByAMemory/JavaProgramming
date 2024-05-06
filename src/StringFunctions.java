public class StringFunctions {
    public static void main(String[] args){
        String name = new String("MaNkEeRaT");
        String name2 = "Mankeerat";
        System.out.println(name);
        System.out.println(name2);
        int a = 9000;
        float pi = 3.14F;
        System.out.printf("The values are %d and %.1f",a,pi);
        System.out.println(" ");
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String notTrimed = "             Manu           ";
        System.out.print(notTrimed.trim());
        System.out.print("Check");
        System.out.println(" ");
        System.out.println(name.substring(0,3));
        System.out.println(name.substring(3));
        System.out.println("endIndex and beginIndex(when single arg) val is excluded.");
        System.out.println(name.replace('e', 'a'));
        System.out.println(name.replace('e', 'a').replace('E', 'a'));
        System.out.println(name.replace("MaN","man"));
        System.out.println(name.startsWith("MaN"));
        System.out.println(name.startsWith("RaT"));
        System.out.println("char at function: "+name.charAt(4));
        System.out.println(name2.indexOf("a",4));
        String words = "ABAABCD";
        System.out.println(words.lastIndexOf("C",2));
        System.out.println(name2.equals("Mankeerat"));
        System.out.println(name.equalsIgnoreCase("mankeerat"));
    }
}
