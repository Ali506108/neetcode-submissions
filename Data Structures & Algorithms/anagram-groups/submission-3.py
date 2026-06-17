class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = []
        hmap = defaultdict(list)

        for word in strs:
            sortedWord = ''.join(sorted(word))
            hmap[sortedWord].append(word)
        
        for val in hmap.values():
            res.append(val)
        return res