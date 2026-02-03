class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
        	return true;
        }
        int st=0;
        int lt=s.length()-1;
        while(st<=lt){
        	char currFirst=s.charAt(st);
        	char currLast=s.charAt(lt);
        	if(!Character.isLetterOrDigit(currFirst)){
        		st++;
        	}else if(!Character.isLetterOrDigit(currLast)) {
        		lt--;
        	} else{
        		if (Character.toLowerCase(currFirst)!=Character.toLowerCase(currLast)) {
        			return false;
        		}
        		st++;
        		lt--;
        	}
        }
        return true;
    }
}