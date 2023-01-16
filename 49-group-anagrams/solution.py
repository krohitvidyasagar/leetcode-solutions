class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        wordDict = dict()
        for word in strs:
            sortedWord = ''.join(sorted(word))
            if wordDict.get(sortedWord):
                wordDict.get(sortedWord).append(word)
            else:
                wordDict[sortedWord] = [word]

        newWordList = []
        
        for key in wordDict:
            newWordList.append(wordDict[key])

        return newWordList