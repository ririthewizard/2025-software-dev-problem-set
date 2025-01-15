class Solution:
    def groupAnagrams(strs: list[str]) -> list[list[str]]:
        result = []

        for word in range(0, len(strs) - 1):
            tmp = sorted(word)

            for j in range(word + 1, len(strs)):
                if sorted(j) == tmp[0] and j not in tmp:
                    tmp.append(j)
            result.append(tmp)

            
