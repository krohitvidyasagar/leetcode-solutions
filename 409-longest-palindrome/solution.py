class Solution:
    def longestPalindrome(self, s: str) -> int:
        char_dict = {}
        count = 0
        for ch in s:
            if ch in char_dict:
                char_dict[ch] = char_dict[ch] + 1
            else:
                char_dict[ch] = 1

        has_odd = False
        for key in char_dict:
            if char_dict[key] % 2 == 0:
                count += char_dict[key]
            else:
                has_odd = True
                count += char_dict[key] - 1

        if has_odd:
            count += 1

        return count
