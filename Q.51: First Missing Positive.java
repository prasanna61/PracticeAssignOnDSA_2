class Solution {
    public int firstMissingPositive(int[] nums) {
        PriorityQueue <Integer> minHeap = new PriorityQueue<>();
    // Add all the positive numbers in the PriorityQueue
    for(int i = 0; i < nums.length; i ++) {
        if(nums[i] > 0) minHeap.add(nums[i]);
    }
    int minMissing = 1;
    // Check for all minimum missing positive number
    while(! minHeap.isEmpty()) {
        int element = minHeap.poll();
        if(element == minMissing) minMissing ++;
        else if(element > minMissing) break;
    }
    return minMissing;
    }
}
