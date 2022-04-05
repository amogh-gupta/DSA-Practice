// Question URL : https://leetcode.com/problems/guess-number-higher-or-lower/ 

public class GuessNumberHigherorLower {
    public int guessNumber(int n) {
        int left = 1, right = n, mid;
        while(true){
            mid = left + ((right-left)/2);
            int num = guess(mid);
            if (num == -1){
                right = mid - 1;
            }
            else if(num == 1){
                left = mid + 1;
            }
            else{
                return mid;
            }
            }
    }
}
