import java.util.ArrayList;


public class subsequence {
    /**
    * поиск и вывод
    */
    public static String search(int [] a, int [] b) {
        int k = 0;
        ArrayList list_res = new ArrayList();
        while (k < a.length) {
            int j = 0;
            String res = "";
            for (int i = k; i < a.length; i++) {
                if (a[i] == b[j] && j < b.length) {
                    res += a[i]  + ", ";
                    if (j+1<b.length) {
                        j ++; 
                    }
                    else break;
                }
                else {
                    for (int l = j; l < b.length; l++) {
                        if (a[i] == b[l]) {
                            res += a[i]  + ", ";
                            if (l+1 < b.length) {
                                j = l+1;
                                break;
                            }
                            else break;
                        }                    
                    }
                }
            }
            list_res.add(res);
            k++;
        }
        int max = 0;
        int max_len = 0;
        for (int i=0; i < list_res.size(); i++)
        {
            String str = String.format("%s", list_res.get(i));
            System.out.println(str);
            if (max_len < str.length()) {
                max = i;
                max_len = str.length();
            }
        }
        return String.format("%s", list_res.get(max));
    }
    
}