package Facebook_Leetcode;
import java.util.*;



public class CSVParser {
    public class Solution {
        public String parseCSV(String str) {
            List<String> res = new ArrayList<>();
            boolean inQuote = false;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (inQuote) {
                    if (str.charAt(i) == '\"') {
                        if (i < str.length() - 1 && str.charAt(i + 1) == '\"') {
                            sb.append("\"");
                            i++;
                        } else {
                            inQuote = false;
                        }
                    } else {
                        sb.append(str.charAt(i));
                    }
                } else {
                    if (str.charAt(i) == '\"') {
                        inQuote = true;
                    } else if (str.charAt(i) == ',') {
                        res.add(sb.toString());
                        sb.setLength(0);
                    } else {
                        sb.append(str.charAt(i));
                    }
                }
            }

            if (sb.length() > 0) {
                res.add(sb.toString());
            }
            return String.join("|", res);
        }
    }

    /*
        CSV Parser
        AirBnB Interview Question
        http://creativyst.com/Doc/Articles/CSV/CSV01.htm#EmbedBRs
     */
    public class Solution_2 {
        public String parseCSV(String str) {
            if (str == null || str.isEmpty()) return null;
            List<String> res = new ArrayList<>();
            StringBuilder curr = new StringBuilder();
            boolean inQuote = false;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (inQuote) {
                    if (c == '\"') {
                        if (i < str.length() - 1 && str.charAt(i + 1) == '\"') {
                            curr.append("\"");
                            i++;
                        } else {
                            inQuote = false;
                        }
                    } else {
                        curr.append(c);
                    }
                } else {
                    if (c == '\"') {
                        inQuote = true;
                    } else if (c == ',') {
                        res.add(curr.toString());
                        curr.setLength(0);
                    } else {
                        curr.append(c);
                    }
                }
            }

            if (curr.length() > 0)
                res.add(curr.toString());

            return String.join("|", res);
        }
    }


}

