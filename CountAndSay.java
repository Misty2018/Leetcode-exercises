package Facebook_Leetcode;

public class CountAndSay {
    public String countAndSay(int n) {
        if(n <= 1){
            return "1";
        }

        String str = countAndSay(n-1);
        StringBuilder say = new StringBuilder();
        int p = 0;
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(p)){
                count++;
            }else{
                say.append(count);
                say.append(str.charAt(p));
                count = 1;
                p = i;
            }
        }
        say.append(count);                  // dont forget this!
        say.append(str.charAt(p));          // dont forget this!

        return say.toString();

    }
}
