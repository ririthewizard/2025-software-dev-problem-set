class Solution:
    def isAnagram(s: str, t: str) -> bool:
        sortedS = sorted(s)
        sortedT = sorted(t)

        count = 0
        for i in range(0, len(sortedS)):
            if sortedS[i] == sortedT[i]:
                count += 1
                print(count)
            
            
        if count == len(sortedS) and count == len(sortedT):
                return True
        return False
    
    print(isAnagram("a", "ab"))