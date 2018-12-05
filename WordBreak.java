package Facebook_Leetcode;
import java.util.*;

// 变种题，求最小合理分割次数
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            // 从这个位置向前考虑能否match某个word，如果match并且前面也为true的话，那么这一段我们可以将其设置为true
            for (String word : wordDict) {
                // 至少i要在word之后吧，如果这个位置根本放不下这个word，那就下一个
                if (i >= word.length() && dp[i - word.length()] && word.equals(s.substring(i - word.length(),i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
