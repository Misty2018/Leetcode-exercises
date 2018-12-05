package Facebook_Leetcode;

public class AddBinary {
    public String addBinary(String a, String b) {

        // a: "11" b: "1" >> "0
        // create a stringbuilder to prevent creating new space
        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() -1;

        int remainder = 0;
        while(i>= 0 || j>=0){

            int sum = remainder;

            if(i >= 0) sum += a.charAt(i) - '0';
            if (j >= 0) sum += b.charAt(j) - '0';

            sb.append(sum % 2);
            remainder = sum / 2;


        }

        if (remainder != 0) sb.append(remainder);

        return sb.reverse().toString();
    }
}
