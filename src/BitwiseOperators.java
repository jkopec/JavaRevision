/*
 * This class represents an revision of bitwise operators in Java
 */
public class BitwiseOperators {

    // sets bitlength for the output
    public static final int bit = 32;

    /*
     * << : bitwise leftShift Operator (Multiply by 2^n if n>=0)
     */
    public static void leftShift(int a, int b){
        int result = a << b;

        System.out.println("operation: " + a + " << " +b);

        System.out.println("a: " + a + " -> " + toBit(a, bit));
        System.out.println("b: " + b + " -> " + toBit(b, bit));
        System.out.println("result: " + result + " -> " + toBit(result, bit));

        if(b >= 0) {
            int assumption = a * (int) Math.pow(2, b);
            System.out.println("assumption: " + a + "*(2^" + b + ") = " + assumption);
        }
    }

    /*
     * >> : bitwise signet rightShift Operator (Devide by 2^n if n>=0)
     */
    public static void rightShift(int a, int b){
        int result = a >> b;

        System.out.println("operation: " + a + " >> " +b);

        System.out.println("a: " + a + " -> " + toBit(a, bit));
        System.out.println("b: " + b + " -> " + toBit(b, bit));
        System.out.println("result: " + result + " -> " + toBit(result, bit));

        if(b >= 0) {
            int assumption = a / (int) Math.pow(2, b);
            System.out.println("assumption: " + a + "/(2^" + b + ") = " + assumption);
        }
    }

    /*
     * >>> : bitwise zero-fill right-shift operator
     */
    public static void rightShiftPos(int a, int b){
        int result = a >>> b;

        System.out.println("operation: " + a + " >>> " +b);

        System.out.println("a: " + a + " -> " + toBit(a, bit));
        System.out.println("b: " + b + " -> " + toBit(b, bit));
        System.out.println("result: " + result + " -> " + toBit(result, bit));
    }

    /*
     * & : bitwise - AND
     */
    public static void and(int a, int b){
        int result = a & b;

        System.out.println("operation: " + a + " & " +b);

        System.out.println("a: " + a + " -> " + toBit(a, bit));
        System.out.println("b: " + b + " -> " + toBit(b, bit));
        System.out.println("result: " + result + " -> " + toBit(result, bit));
    }

    /*
     * | : bitwise - OR
     */
    public static void or(int a, int b){
        int result = a | b;

        System.out.println("operation: " + a + " | " +b);

        System.out.println("a: " + a + " -> " + toBit(a, bit));
        System.out.println("b: " + b + " -> " + toBit(b, bit));
        System.out.println("result: " + result + " -> " + toBit(result, bit));
    }

    /*
     * ^ : bitwise - XOR
     */
    public static void xor(int a, int b){
        int result = a ^ b;

        System.out.println("operation: " + a + " ^ " +b);

        System.out.println("a: " + a + " -> " + toBit(a, bit));
        System.out.println("b: " + b + " -> " + toBit(b, bit));
        System.out.println("result: " + result + " -> " + toBit(result, bit));
    }

    /*
     * ^ : bitwise - NOT
     */
    public static void not(int a){
        int result = ~a;

        System.out.println("operation: ~" + a);

        System.out.println("a: " + a + " -> " + toBit(a, bit));
        System.out.println("result: " + result + " -> " + toBit(result, bit));
    }

    /*
     * returns int as String in binary format depending on bit length
     */
    public static String toBit(int num, int bit){
        return String.format("%"+bit+"s", Integer.toBinaryString(num)).replace(' ', '0');
    }

    public static void main(String[] args) {
        rightShiftPos(-8,2);
    }
}
