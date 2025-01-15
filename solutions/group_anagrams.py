class Solution:
    def groupAnagrams(strs: list[str]) -> list[list[str]]:
        strs_table = {}

        for string in strs:
            sorted_string = "".join(sorted(string))

            strs_table.setdefault(sorted_string, [])

            strs_table[sorted_string].append(string)

        
        return list(strs_table.values())