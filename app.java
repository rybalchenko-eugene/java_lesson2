import java.util.ArrayList;

import javax.lang.model.util.ElementScanner6;

public class app {
    public static void main(String[] args) {
        file_out.save("#1 Задача про максимальные подпоследовательности ");
        int [] a = {1,33,7,3,5,3,78,4,5,84,3,1,3,6,8};
        int [] b = {1,5,7,33,5,2,78,4,5,84,3,53,6,8,1,5,2,9,4,2,3,8};
        String str1 = subsequence.search(a, b);
        String str2 = subsequence.search(b, a);
        if (str1.length() > str2.length())
        {
            file_out.save("Максимальная подпоследовательность - " + str1);
        }
        else
        {
            file_out.save("Максимальная подпоследовательность - " + str2);
        }      
        file_out.save("\n#2 Задача, показывающая последовательность действий для игры Ханойская башня");
        tower.tower(5, " A", " B", " C");
        file_out.save("\n#3 Сортировка вставками\n\n Неотсортированный массив:");
        ins_sort.print(b);
        ins_sort.sort(b);
        file_out.save("\nОтсортированный массив:");
        ins_sort.print(b);

    }
    
}
