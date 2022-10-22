public class tower {
    /**
    *
    */
    public static void tower(int num_disk, String start, String buf, String to){
        if (num_disk == 1) {
            System.out.println(num_disk + start + "->" + to);
        } else {
            tower(num_disk-1, start, to, buf);
            System.out.println(num_disk + start + "->" + to);
            tower(num_disk-1, buf, start, to);
        }
    }
    
}


