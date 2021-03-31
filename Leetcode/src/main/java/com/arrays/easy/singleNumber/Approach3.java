package com.arrays.easy.singleNumber;

import java.util.HashSet;
import java.util.Set;

/*
Using math :
2 * (a + b + c) - (a + a + b + b + c) = c

Time complexity : O(n + n) = O(n)O(n+n)=O(n). sum will call next to iterate through \text{nums}nums. We can see it as sum(list(i, for i in nums)) which means the time complexity is O(n)O(n) because of the number of elements(nn) in \text{nums}nums.

Space complexity : O(n + n) = O(n)O(n+n)=O(n). set needs space for the elements in nums

 */
public class Approach3 {
    public int singleNumber(int[] nums) {
        int sumOfSet = 0, sumOfNums = 0;
        Set<Integer> set = new HashSet();

        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
                sumOfSet += num;
            }
            sumOfNums += num;
        }
        return 2 * sumOfSet - sumOfNums;
    }
}
