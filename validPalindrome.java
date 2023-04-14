class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int low = 0;
        int end = s.length()-1;
        while(low<end){
            if(s.charAt(low)!=s.charAt(end)){
                return false;
            }
            low++;
            end--;
            
        }
        return true;
    }
}
