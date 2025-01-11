class Solution:
    def isAnagram(s: str, t: str) -> bool:
        sortedS = sorted(s)
        sortedT = sorted(t)

        return sortedS == sortedT