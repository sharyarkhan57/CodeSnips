class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<>();
        
        int left = 0;
        int right = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                left++;
            } else if (c == ')') {
                if (left == 0) {
                    right++;
                } else {
                    left--;
                }
            }
        }
        
        dfs(res, s, left, right, 0);
        return res;
    }
    
    private void dfs(List<String> res, String s, int left, int right, int index) {
        if (left < 0 || right < 0) {
            return;
        }
        if (left == 0 && right == 0 && isValidParentheses(s) && !res.contains(s)) {
            res.add(s);
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (i != index && s.charAt(i) == s.charAt(i - 1)) {
                continue;
            }
            dfs(res, s.substring(0, i) + s.substring(i + 1), left, right - 1, i);
            dfs(res, s.substring(0, i) + s.substring(i + 1), left - 1, right, i);
        }
    }
    
    private boolean isValidParentheses(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (count == 0) {
                    return false;
                }
                count--;
            }
        }
        return count == 0;
    }
}