/*
You are given a string s. Your task is to count the number of ways of splitting s into three non-empty parts a, b and c 
(s = a + b + c) in such a way that a + b, b + c and c + a are all different strings.
 */
public class NumWaysSplitStrings {

    public int numWays(String s) {
        int counter = 0;
        String s1, s2, s3;
        int stringLength = s.length();

        for(int i = 1; i < stringLength; i++) {
            for(int j = i + 1; j < stringLength; j++) {
                s1 = s.substring(0, i);
                s2 = s.substring(i, j);
                s3 = s.substring(j, stringLength);

                // a + b != b + c && b + c != c + a && c + a != a + b
                if(!(s1+s2).equals(s2+s3) && !(s2+s3).equals(s3+s1) && !(s3+s1).equals(s1+s2)) {
                    counter++;
                }
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        NumWaysSplitStrings obj = new NumWaysSplitStrings();

        String s = "xzxzx";

        int count = obj.numWays(s);

        System.out.println("Number of ways the string can be split with distinct words: " + count);

    }
    
}
