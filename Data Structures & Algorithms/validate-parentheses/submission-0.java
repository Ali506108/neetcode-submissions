class Solution {
    public boolean isValid(String s) {
        Stack<Character> stacks = new Stack<>();
        Map<Character , Character> closeToOpen = new HashMap<>();

        closeToOpen.put(')','(');
        closeToOpen.put(']','[');
        closeToOpen.put('}','{');

        for(char c : s.toCharArray()) {
            if(closeToOpen.containsKey(c)) {
                if(!stacks.isEmpty() && stacks.peek()
                 == closeToOpen.get(c)) {
                    stacks.pop();
                }else {
                    return false;
                }
            }else {
                stacks.push(c);
            }
        } 


        return stacks.isEmpty();
    }
}
