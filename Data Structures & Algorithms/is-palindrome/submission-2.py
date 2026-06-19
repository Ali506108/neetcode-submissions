class Solution:
    def isPalindrome(self, s: str) -> bool:
        len_of_s = len(s)
        s = ''.join([i for i in s if i.isalnum() ])

        for i in range(0 , len(s)):
            if s[i].lower() != s[(len(s) -1 ) -i ].lower():
                return False
        
        return True