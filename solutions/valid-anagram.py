from collections import defaultdict

class Solution:
    def isAnagram(s: str, t: str) -> bool:
        sortedS = sorted(s)
        sortedT = sorted(t)

        return sortedS == sortedT

    def isAnagramHT(s: str, t: str) -> bool:
        count = defaultdict(int)

        for i in s:
            count[i] += 1

        for i in t:
            count[i] -= 1

        for val in count.values():
            if val != 0:
                return False
        return True
    
    print(isAnagramHT("anagram", "nagaram"))
    print(isAnagramHT("rat", "car"))
    print(isAnagramHT("a", "ab"))
    print(isAnagramHT("ab", "a"))