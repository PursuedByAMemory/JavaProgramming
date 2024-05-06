import java.util.Objects;
import java.util.regex.*;
public class regexExperiments {
    public static void main(String[] args){
        String comp = "hackerrank";
        String s = "haacckkerrraannnk";
        char compArr[] = comp.toCharArray();
        char sArr[] = s.toCharArray();
        boolean check[] = new boolean[compArr.length];
        if(compArr.length > sArr.length){
            System.out.println("NO");
        }
        for(int i = 0; i<sArr.length;i++){
            for(int j = 0; j< compArr.length; j++){
                if(Objects.equals(sArr[i], compArr[j])){
                    check[j] = true;
                }
            }
        }
        for(int i = 0; i < check.length; i++) {
            if (!check[i]) {
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
