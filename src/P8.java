
public class P8 {

    public static void main(String[] args) {
        char x = 'X';
        int i = 0;
        System.out.println(returnTrue() ? x : 0);
        System.out.println(!returnTrue() ? i : x);

    }

    public static boolean returnTrue() {
        return true;
    }
    
}
