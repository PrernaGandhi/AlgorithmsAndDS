package com.arrays.easy.singleNumber;

import java.util.HashMap;

/*
HashTable
Time Complexity : O(n)
 */
public class Approach2 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hash_table = new HashMap<>();

        for (int i : nums) {
            hash_table.put(i, hash_table.getOrDefault(i, 0) + 1);
            // returns default value if not found in hash map
        }
        for (int i : nums) {
            if (hash_table.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }
}
