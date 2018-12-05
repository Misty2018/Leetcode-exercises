package Facebook_Leetcode;

public class ImplementStrStr {
    private int implementStrStr(String t, String s){
        if(s.isEmpty()){
            return 0;
        }

        if (s.equals(t)){
            return 0;
        }

        for (int i = 0; i <= t.length() - s.length(); i++){
            if (t.substring(i, i + s.length()).equals(s)){
                return i;
            }
        }

        return -1;

    }
}
