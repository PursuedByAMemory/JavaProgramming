import java.util.*;
public class sequencialString {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i = 0;i < q;i++){
            al.add(sc.next());
        }
        sequencialString ss = new sequencialString();
        ArrayList<String> result = ss.seqFunc(al);
//        for(int j = result.size()-1;j >= 0; j--) {
//            System.out.println(result.get(j));
//        }
        for(String val: result){
            System.out.println(val);
        }
        System.out.println(result.size());
    }

    public ArrayList<String> seqFunc(ArrayList<String> al) {
        String comp = "hackerrank";
        ArrayList<String> res = new ArrayList<>();
        String s = al.remove(al.size() - 1);
        char compArr[] = comp.toCharArray();
        char sArr[] = s.toCharArray();

        if (compArr.length > sArr.length) {
            res.add("NO-Len");
        } else {
            for (int p = 0; p < al.size(); p++) {
                boolean check[] = new boolean[compArr.length];
                s = al.get(p);
                sArr = s.toCharArray();

                for (int i = 0; i < sArr.length; i++) {
                    for (int j = 0; j < compArr.length; j++) {
                        if (Objects.equals(sArr[i], compArr[j])) {
                            check[j] = true;
                        }
                    }
                }

                boolean allTrue = true;
                for (int i = 0; i < check.length; i++) {
                    if (check[i] == false) {
                        res.add("NO-Check");
                        allTrue = false;
                        break;
                    }
                }

                if (allTrue) {
                    res.add("YES-Check");
                }
            }
        }

        return res;
    }
}
