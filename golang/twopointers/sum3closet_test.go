package twopointers

import (
	"fmt"
	"math"
	"sort"
	"testing"
)

//  1.双指针 时间O(n^2) 空间O(n)
func threeSumClosest(nums []int, target int) int {
	sort.Ints(nums)
	res, near := math.MaxInt32, math.MaxInt32
	for i := 0; i < len(nums)-2; i++ {
		left, right := i+1, len(nums)-1
		for left < right {
			sum := nums[i] + nums[left] + nums[right]
			distance := target - sum
			if distance == 0 {
				return sum
			} else if distance > 0 {
				left++
			} else {
				right--
				distance = -distance
			}
			if abs(distance) < near {
				res, near = sum, distance
			}
		}
	}
	return res
}

func abs(a int) int {
	if a > 0 {
		return a
	}
	return -a
}

// 解法二 暴力解法 O(n^3)
func threeSumClosest1(nums []int, target int) int {
	res, difference := 0, math.MaxInt16
	for i := 0; i < len(nums); i++ {
		for j := i + 1; j < len(nums); j++ {
			for k := j + 1; k < len(nums); k++ {
				if abs(nums[i]+nums[j]+nums[k]-target) < difference {
					difference = abs(nums[i] + nums[j] + nums[k] - target)
					res = nums[i] + nums[j] + nums[k]
				}
			}
		}
	}
	return res
}

func TestDemo(t *testing.T) {
	nums := []int{-1, 2, 1, -4}
	target := 3
	fmt.Println(threeSumClosest(nums, target))
}
