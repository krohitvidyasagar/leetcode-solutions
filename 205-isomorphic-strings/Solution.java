import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
    Map<Character, Character> sMap = new HashMap<>();
    Map<Character, Character> tMap = new HashMap<>();

    char sChar, tChar;
    for (int i = 0; i < s.length(); i++) {
        sChar = s.charAt(i);
        tChar = t.charAt(i);

        if (sMap.get(sChar) != null && sMap.get(sChar) != tChar) {
            return false;
        } else if (tMap.get(tChar) != null && tMap.get(tChar) != sChar) {
            return false;
        }

        sMap.put(sChar, tChar);
        tMap.put(tChar, sChar);
    }

    return true;
}
}