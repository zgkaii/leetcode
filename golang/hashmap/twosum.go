package main

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
