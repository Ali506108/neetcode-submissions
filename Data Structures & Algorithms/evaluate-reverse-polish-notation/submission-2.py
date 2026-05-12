class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []

        for c in tokens:
            if c == "+" :
                stack.append(stack.pop()  + stack.pop())
            elif c == "-":
                fVal = stack.pop()
                sVal = stack.pop()
                stack.append(sVal - fVal)
            elif c == "*":
                stack.append(stack.pop() * stack.pop())
            elif c == "/":
                fVal = stack.pop()
                sVal = stack.pop()
                stack.append(int(float(sVal) / fVal))
            else:
                stack.append(int(c))

        return stack.pop()