package main

import (
	"fmt"
	"testing"
)

// 1. 两数之和 https://leetcode-cn.com/problems/two-sum/
func twoSum(nums []int, target int) []int {
	hashtable := map[int]int{}
	for i, x := range nums {
		if p, ok := hashtable[target-x]; ok {
			return []int{p, i}
		}
		hashtable[x] = i
	}
	return nil
}

func TestTwoSum(t *testing.T) {
	nums := []int{1, 2, 3, 4, 5}
	target := 10
	fmt.Println("twaosum", twoSum(nums, target))
}
