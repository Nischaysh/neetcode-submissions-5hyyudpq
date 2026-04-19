class Solution {
    public int longestConsecutive(int[] nums) {
        
         TreeSet<Integer> set = new TreeSet<>();
    
    for (int num : nums) {
        set.add(num);
    }

    int longest = 0;
    int currentStreak = 0;
    int prev = Integer.MIN_VALUE;

    for (int num : set) {
        if (num == prev + 1) {
            currentStreak++;
        } else {
            currentStreak = 1;
        }
        longest = Math.max(longest, currentStreak);
        prev = num;
    }

    return longest;
    }
}
