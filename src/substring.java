import java.util.HashSet;

public class substring {
    public int lengthOfLongestSubstring(String s) {

        int total = 0; 
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            HashSet<Character> mySet = new HashSet<>();
            int index = i;

            while(!mySet.contains(s.charAt(index))){
                count++;
                mySet.add(s.charAt(index));
                if(index < s.length()-1){
                    index++;
                }
            }

            total = count >= total ? count : total; //update counter
            count =0;
        }
        
        return total;
        
    }
}
