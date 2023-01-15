class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        for ch in s:
            if not t:
                return False
            
            if ch in t:
                t = t.replace(ch, '', 1)
            else:
                return False

        return len(t) == 0