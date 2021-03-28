package twopointers

import (
	"fmt"
	"testing"
)

// 双指针法
func maxArea(h []int) int {
	max, left, right := 0, 0, len(h)-1
	for left < right {
		width := right - left
		hight := 0
		if h[left] < h[right] {
			hight = h[left]
			left++
		} else {
			hight = h[right]
			right--
		}
		area := width * hight
		if area > max {
			max = area
		}
	}
	return max
}

func TestMostWater(t *testing.T) {
	nums := []int{1, 8, 6, 2, 5, 4, 8, 3, 7}
	fmt.Println(maxArea(nums))
}
