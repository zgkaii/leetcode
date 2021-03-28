package array

import (
	"fmt"
	"testing"
)

// 给定一个数组 nums，编写一个函数将所有0移动到数组的末尾，同时保持非零元素的相对顺序。
func moveZeroes(nums []int) {
	if len(nums) < 2 && nums == nil {
		return
	}
	// 双指针
	lo, hi, len := 0, 0, len(nums)
	for hi < len {
		if nums[hi] != 0 {
			nums[lo], nums[hi] = nums[hi], nums[lo]
			lo++
		}
		hi++
	}
}

func TestDemo(t *testing.T) {
	nums := []int{0, 1, 0, 3, 12}
	moveZeroes(nums)
	for _, v := range nums {
		fmt.Printf("%d\n", v) //[1,3,12,0,0]
	}
}
