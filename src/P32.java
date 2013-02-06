
public class P32 {
    
    public static void main(String... args) {
    	System.out.println(new Integer(1) & new Integer(0)); //auto-unboxing, primitives' and.
        System.out.println(new Integer(1) > new Integer(0)); //auto-unboxing, primitives' comparison.
        System.out.println(new Integer(0) == new Integer(0)); //won't auto-unboxing, just object comparison.
        System.out.println(new Integer(0) != new Integer(0)); //won't auto-unboxing, just object comparison.
        System.out.println(new Integer(0) == 0); //auto-unboxing, primitives' comparison.
        System.out.println(0 == new Integer(0)); //auto-unboxing, primitives' comparison.
        System.out.println(Integer.valueOf(127) == Integer.valueOf(127)); //object comparison. hit cache(-128~127).
        System.out.println(Integer.valueOf(128) == Integer.valueOf(128)); //not cached, so create a new one immediately
    }
    
}
