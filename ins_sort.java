public class ins_sort {
    public static void sort(int [] lst) {
        for (int i = 1; i < lst.length; i++) {
            for (int j = i; j > 0; j--) {
                if (lst[j-1] < lst[j]) {
                    break;
                }
                else {
                    int temp = lst[j-1];
                    lst[j-1] = lst[j];
                    lst[j] = temp;
                }
            }
        }
    }
    public static void print(int [] lst) {
        for (int i : lst) {
            System.out.print(i + ", ");
        }
    }
}
