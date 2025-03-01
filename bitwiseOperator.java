public class bitwiseOperator {
    /**
     * @param args
     */
    /**
     * @param args
     */
    public static void main(String args[]){

        int x=-0b1010,
            y=0b0110,z;
        // z=x&y;    AND 
        // z=x|y;    OR   
        // y=x<<1;   Left Shift
        // y=x>>1;   Right Shift
        // y=x>>>1;  Unsigned Right Shift

        

        System.out.printf("%s",Integer.toBinaryString(y));

    }
}
//NOTE :If you are doing manually the unsigned right shift first take number in 1 byte and write negative number as +ve in its binary form then do 1's and 2's complement then change the signed bit also which is not done in right shift..
//Difference between right shift and unsigned right shift is :::
// In right shift Bit sign is untouched.(Remaining -VE only)