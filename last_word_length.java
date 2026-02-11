public class last_word_length {
    public int lengthOfLastWord(String s) {
        int n=s.length()-1;
        while(n>=0&&s.charAt(n)==' '){
            n--;
        }
        int start=n;
        while(start>=0&&s.charAt(start)!=' ') {
            start--;
        }
        return n-start;        
    }
    
}
