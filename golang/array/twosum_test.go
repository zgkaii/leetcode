package main

import (
	"fmt"
	"testing"
)

// 1. 两数之和 https://leetcode-cn.com/problems/two-sum/
func twoSum(nums []int, target int) []int {
	m := make(map[int]int)
	for i := 0; i < len(nums); i++ {
		another := target - nums[i]
		if _, ok := m[another]; ok {
			return []int{m[another], i}
		}
		m[nums[i]] = i
	}
	return nil
}

func TestTwoSum(t *testing.T) {
	nums := []int{1, 2, 3, 4, 5}
	target := 9
	fmt.Println("twaosum", twoSum(nums, target))
}
