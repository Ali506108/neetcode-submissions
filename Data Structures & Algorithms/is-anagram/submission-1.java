class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        String[] arr1 = s.split("");
        String[] arr2 = t.split("");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0 ; i < arr1.length; i++) {
            if(!arr1[i].equals(arr2[i])) return false;
        }
        
        return true;
    }

}
