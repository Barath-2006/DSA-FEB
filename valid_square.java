class Solution {
    public boolean isPerfectSquare(int num) {
        if(Math.pow(num,0.5)%1==0){
            return true;
        }
        else{
            return false;
        }
    }
}
