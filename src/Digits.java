import java.util.ArrayList;

public class Digits
{
    /** The list of digits from the number used to construct this object.
     * The digits appear in the list in the same order in which they appear in the original number.
     */
    private ArrayList<Integer> digitList;
    
    /** Constructs a Digits object that represents num.
     * Precondition: num >= 0
     */
    public Digits(int num)
    {
        //YOUR CODE HERE

        digitList = new ArrayList<Integer>;
        for(int x = 0; x < num.length() + 1; x++){
            digitList.add(x, num.substring(x - 1, Integer(x));
        }
    }
    
    /** Returns true if the digits in this Digits object are in strictly increasing order;
     * false otherwise.
     */
    public boolean isStrictlyIncreasing() {
        //YOUR CODE HERE

        for (int x = 0; x < num.length() + 1; x++) {
            if (digitList.get(x - 1) >= digitList.get(x)) {
                return false;
            }
            if (digitList.get(x - 1) < digitList.get(x)) {
                return true;
            }
        }
    

    public String toString() {
        return digitList.toString();
    }
}

