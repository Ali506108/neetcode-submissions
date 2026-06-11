class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = []
        hmap = defaultdict(list)

        for word in strs:
            srtWord = ''.join(sorted(word))
            hmap[srtWord].append(word)
        
        for val in hmap.values():
            res.append(val)
        
        return res