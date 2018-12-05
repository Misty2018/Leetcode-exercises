package Facebook_Leetcode;

public class IsNumeric {

    public static void main(String[] args){
        IsNumeric object = new IsNumeric();
        boolean a = object.isNumeric("-123");
    }
    public static boolean isNumeric(String str)
    {   int count = 0;
        if (str.charAt(0) != '-' && !Character.isDigit(str.charAt(0))) return false;
        for (char c : str.substring(1,str.length()).toCharArray())
        {   if (c == ',') count++;
            if (!Character.isDigit(c) || count > 1) return false;
        }
        return true;
    }
}


/*
public static boolean isNumeric(String str)
{
    for (char c : str.toCharArray())
    {
        if (!Character.isDigit(c)) return false;
    }
    return true;
}
 */