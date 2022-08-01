import java.util.HashSet;

public class substring {
    public int lengthOfLongestSubstring(String s) {

        int first = 0;
        int second = 0;

        HashSet<Character> mySet = new HashSet<>();

        int total = 0; 
        int count = 0;
        

        while(first < s.length()){
            if(!mySet.contains(s.charAt(first))){
                mySet.add(s.charAt(first));
                count++;
                first++;
                total = Math.max(total, count);
            }else{
                mySet.remove(s.charAt(second));
                second++;
                count--;
            }
        }

        return total;
        
    }
}
