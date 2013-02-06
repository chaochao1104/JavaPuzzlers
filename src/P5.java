import static java.lang.System.out;



public class P5 {

	public static void main(String[] args) {
		out.println(Long.toHexString(0x100000000L + 0xcafebabe));
		out.println(Long.toHexString(0x100000000L + 0xcafebabeL));

		out.println(Integer.toString(0xcafebabe));

		out.println(Long.toBinaryString((long) 0x7afebabe));
		out.println(Long.toBinaryString((long) 0xcafebabe));
		out.println(Long.toBinaryString(0xcafebabeL));

		out.println(Long.toString((long) 0xcafebabe));
		out.println(Long.toString(0xcafebabeL));

		out.println(Integer.toHexString(0xcafebabe));
		out.println(Long.toHexString((long) 0xcafebabe));
		out.println(Long.toHexString(0xcafebabeL));

		out.println((long) 0xcafebabe == 0xcafebabeL);

		out.println(Long.toHexString((long) 0x7afebabe));
		out.println(Long.toString((long) 0x7afebabe));
		out.println(Long.toString(0x7afebabeL));

		System.out.println(Integer.toBinaryString(-2));
		
	}
	

}
