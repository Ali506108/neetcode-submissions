class Solution:
    def isValid(self, s: str) -> bool:
        matches = {")": "(", 
                    "}": "{", 
                    "]": "["}

        stack = []

        for c in s:
            if c not in matches:
                stack.append(c)
                continue
            
            if not stack or matches[c] != stack.pop():
                return False
            

        if stack:

            return False
        
        return True