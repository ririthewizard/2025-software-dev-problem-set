class Solution:
    def groupAnagrams(strs: list[str]) -> list[list[str]]:
        result = []

        for word in range(0, len(strs) - 1):
            tmp = sorted(strs[word])
            print(tmp)

            for j in range(word + 1, len(strs)):
                print(strs[j])
                if sorted(strs[j]) == tmp[0] and strs[j] not in tmp:
                    tmp.append(strs[j])
            result.append(tmp)

    print(groupAnagrams(["eat","tea","tan","ate","nat","bat"]))