public class Main {

    public static void main(String[] args) {

    }

    /*
    *The parameter weekday is true if it is a weekday, and the parameter
    * vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    */

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation){
            return true;
        }
        else{
            return false;
        }
    }

    //Given two int values, return their sum. Unless the two values are the same, then return double their sum.

    public int sumDouble(int a, int b) {
        int sum = 0;
        if (a != b){
            sum = a + b;
            return sum;
        }
        else {
            sum = 2 * (a + b);
            return sum;
        }
    }

    /*
    * Given 2 int values, return whichever value is nearest to the value 10, or
    * return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
    */


    public int close10(int a, int b) {
        if (Math.abs(a-10)<Math.abs(b-10)){
            return a;
        }
        if(Math.abs(a-10)>Math.abs(b-10)){
            return b;
        }
        else{
            return 0;
        }
    }


    //Given a string, return a new string where the first and last chars have been exchanged.

    public String frontBack(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length()-1);

        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }

      /*
    * Given a string, return a new string where "not " has been added to the front. However,
    * if the string already begins with "not", return the string unchanged. Note: use .equals()
    * to compare 2 strings.
    */

    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }

        return "not " + str;
    }

}
