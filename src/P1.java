

public class P1 {

    public static void main(String args[]) {
        System.out.println(isOdd(-2));
        System.out.println(fixedIsOdd(-2));
        System.out.println(isOdd(-1));
        System.out.println(bestIsOdd(-1));

        System.out.println(-3 % 2);
    }
    
    private static boolean isOdd(int i) {
        return i % 2 == 1;
    }
    
    private static boolean fixedIsOdd(int i) {
        return i % 2 != 0;
    }
    
    public static boolean bestIsOdd(int i) {
        return (i & 1) != 0;
    }


    
}
