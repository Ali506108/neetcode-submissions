class Solution:
    def isValid(self, s: str) -> bool:
        stack = []

        cloaseToOpen = {")" : "(" , "]" : "[" , "}" : "{"}

        for c in s:
            if c in cloaseToOpen:
                if stack and stack[-1] == cloaseToOpen[c]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(c)
        

        return True if not stack else False