import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regx {
    public static void main(String[] args){
        Pattern ptr = Pattern.compile("/bWORD/b",Pattern.CASE_INSENSITIVE);
        Matcher mat = ptr.matcher("SUBWORD");
        boolean matchFound = mat.find();
        if(matchFound){
            System.out.println("Match found");
        }else{
            System.out.println("Match not found");
        }
    }
}