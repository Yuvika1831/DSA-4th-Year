import java.util.*;

class Solution {

    public List<String> AllPossibleStrings(String s) {
        List<String> ans = new ArrayList<>();

        int n = s.length();

        for (int mask = 1; mask < (1 << n); mask++) {
            String str = "";

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    str += s.charAt(i);
                }
            }

            ans.add(str);
        }

        Collections.sort(ans);
        return ans;
    }
}
