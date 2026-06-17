class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # hmap = {}

        # for num in nums:
        #     hmap[num] = 1 + hmap.get(num , 0)

        
        # arr = []
        # for n , c in hmap.items():
        #     arr.append([c , n ])
        # arr.sort()


        # res = []
        # while len(res) < k:
        #     res.append(arr.pop()[1])
        # return res

        hmap = {}
        arr = []
        res = []
        for num in nums:
            hmap[num] = 1 + hmap.get(num , 0 )
            
        for n , c in hmap.items():
            arr.append([c,n])
        arr.sort()

        while len(res) < k :
            res.append(arr.pop()[1])
        return res
