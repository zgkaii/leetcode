## Project Structure

```shell
LeetCode
├── Golang
└── Java
```

##  Teaching Resources

### Book

- [x] 入门书籍——《[算法图解(Aditya Bhargava)](https://book.douban.com/subject/26979890/)》
- [ ] 基础知识——《[算法(Robert Sedgewick/Kevin Wayne)](https://book.douban.com/subject/10432347/)》
- [ ] 理论加持——《[算法导论(Thomas H. Cormen/Charles E. Leiserson)](https://book.douban.com/subject/20432061/)》
- [ ] 思维改善——《[编程珠玑(Jon Bentley)](https://book.douban.com/subject/3227098/)》

### Website

* [List of Algorithms](https://www.wikiwand.com/en/List_of_algorithms)
* [Data Structure Visualizations](https://www.cs.usfca.edu/~galles/visualization/Algorithms.html)
* [VisuAlgo](https://visualgo.net/en)
* [LeetCode](https://leetcode-cn.com/)

### Other

* https://github.com/halfrost/LeetCode-Go

* https://github.com/TheAlgorithms/Java
* https://github.com/TheAlgorithms/Python
* https://github.com/haoel/leetcode

## LeetCode

| NO.  | Title                                                        | Solution                                                     | Difficulty | Category          | Y&N |
| ---- | ------------------------------------------------------------ | ------------------------------------------------------------ | ---------- | ----------------- | ----- |
| 1    | [Two Sum](https://leetcode-cn.com/problems/two-sum/)         | [Java](./java/hashmap/TwoSum.java)、[Go](./golang/array/twosum_test.go) | Easy       | Array      | !!!   |
| 3 | [Longest Substring Without Repeating Characters](https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/) | [Go](./golang/twopointers/Longestsubstring_test.go) | Medium | Two Pointers | ? |
| 5 | [Longest-Palindromic-Substring](https://leetcode-cn.com/problems/longest-palindromic-substring/) | [Java](./java/string/PalindromicSubstring.java) | Medium | DP | ? |
| 8 | [String-To-Integer-Atoi](https://leetcode-cn.com/problems/string-to-integer-atoi/) | [Java](./java/string/Atoi.java) | Medium | String | ? |
| 11   | [Container With Most Water](https://leetcode-cn.com/problems/container-with-most-water/) | [Java](./java/array/MostWater.java)、[Go](./golang/twopointers/mostwater_test.go) | Medium     | Two Pointers | ??  |
| 14 | [Longest-Common-Prefix](https://leetcode-cn.com/problems/longest-common-prefix/description/) | [Java]() | Easy | String | ? |
| 15   | [3Sum](https://leetcode-cn.com/problems/3sum/)               | [Java](./java/array/ThreeSum.java)                           | Medium     |                   | ??    |
| 16 | [3Sum-Closest](https://leetcode-cn.com/problems/3sum-closest/) | [Go](./golang/twopointers/sum3closet_test.go) | Medium | Two Pointers | ? |
| 17   | [Letter-Combinations-Of-A-Phone-Number](https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/) | [Java](./java/divde_conquer/LetterCombinations.java)         | Medium     | Recursion         | ?     |
| 19   | [Remove-Nth-Node](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/) | [Java](./java/list/RemoveNthNode.java)                       | Medium     |                   | ?     |
| 20   | [Valid Parentheses](https://leetcode-cn.com/problems/valid-parentheses/) | [Java](./java/stack/ValidParentheses.java)                   | Easy       | Stack             | ??!  |
| 21   | [Merge Two Sorted Lists](https://leetcode-cn.com/problems/merge-two-sorted-lists/) | [Java](./java/list/MergeTwoSortedLists.java)                 | Easy       |                   | ?!   |
| 22   | [Generate Parentheses](https://leetcode-cn.com/problems/generate-parentheses/) | [Java](./java/recursion/GenerateParentheses.java)            | Medium     | DFS               | ??   |
| 24   | [Swap Nodes in Pairs](https://leetcode-cn.com/problems/swap-nodes-in-pairs/) | [Java](./java/list/SwapNodes.java)                           | Medium     |                   | ???   |
| 25   | [Reverse Nodes in k-Group](https://leetcode-cn.com/problems/reverse-nodes-in-k-group/) | [Java](./java/list/ReverseNodesKGroup.java)                  | Hard       |                   | ?     |
| 26   | [Remove Duplicates from Sorted Array](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/) | [Java](./java/array/RemoveDuplicates.java)                   | Easy       |                   | ?    |
| 32   | [Longest Valid Parentheses](https://leetcode.com/problems/longest-valid-parentheses/) |                                                              | Hard       |                   |       |
| 33   | [Search-In-Rotated-Sorted-Array](https://leetcode-cn.com/problems/search-in-rotated-sorted-array/) | [Java](./java/binarysearch/RotatedSortedArray.java)          | Medium     |                   | ?    |
| 36   | [Valid-Sudoku](https://leetcode-cn.com/problems/valid-sudoku/description/) | [Java](./java/array/ValidSudoku.java)                        | Medium     |                   | ?     |
| 37   | [Sudoku-Solver](https://leetcode-cn.com/problems/sudoku-solver/) | [Java](./java/recursion/ValidSudokuTwo.java)                 | Hard       |                   | ?     |
| 39   | [Combination-Sum](https://leetcode-cn.com/problems/combination-sum/) |                                                              | Medium     |                   |       |
| 42   | [Trapping Rain Water](https://leetcode-cn.com/problems/trapping-rain-water/)&hearts; | [Java](./java/stack/TrappingRainWater.java)                  | Hard       | Stack、DP         | !?    |
| 44 | [Wildcard-Matching](https://leetcode-cn.com/problems/wildcard-matching/) | [Java](./java/dp/WildcardMatching.java) | Hard | DP | ? |
| 45   | [Jump-Game-ii](https://leetcode-cn.com/problems/jump-game-ii/) | [Java](./java/greedy/JumpGameTwo.java)                       | Hard       |                   | ?    |
| 46   | [Permutations](https://leetcode-cn.com/problems/permutations/) | [Java](./java/recursion/Permutations.java)                   | Medium     |                   | ?     |
| 47   | [Permutations II](https://leetcode-cn.com/problems/permutations-ii/) | [Java](./java/recursion/PermutationsTwo.java)                | Medium     |                   | ?     |
| 49   | [Group Anagrams](https://leetcode-cn.com/problems/group-anagrams/) | [Java](./java/hashmap/GroupAnagrams.java)                    | Medium     | HashMap           | !?    |
| 50   | [PowX-N](https://leetcode-cn.com/problems/powx-n/)           | [Java](./java/divde_conquer/Powxn.java)                      | Medium     |                   | ?    |
| 51   | [N-Queens](https://leetcode-cn.com/problems/n-queens/)       | [Java](./java/recursion/NQueens.java)                        | Hard       | Backtracking      | ?     |
| 52   | [N-Queens-ii](https://leetcode-cn.com/problems/n-queens-ii/description/) |                                                              | Hard       |                   |       |
| 53   | [Maximum-Subarray](https://leetcode-cn.com/problems/maximum-subarray/) | [Java](./java/dp/MaximumSubarray.java)                       | Easy       |                   | !?    |
| 55   | [Jump-Game](https://leetcode-cn.com/problems/jump-game/)     | [Java](./java/greedy/JumpGame.java)                          | Medium     | Greedy            | ?！  |
| 56   | [Merge-Intervals](https://leetcode-cn.com/problems/merge-intervals/) | [Java](./java/sort/MergeIntervals.java)                      | Medium     |                   | ?    |
| 58   | [Length-Of-Last-Word](https://leetcode-cn.com/problems/length-of-last-word/) | [Java](./java/string/LengthOfLastWord.java) | Easy       | String | ! |
| 62   | [Unique-Paths](https://leetcode-cn.com/problems/unique-paths/) | [Java](./java/dp/UniquePaths.java)                           | Medium     | DP                | !?    |
| 63   | [Unique-Paths-ii](https://leetcode-cn.com/problems/unique-paths-ii/) | [Java](./java/dp/UniquePathsTwo.java)                        | Medium     |                   | ?    |
| 64   | [Minimum Path Sum](https://leetcode-cn.com/problems/minimum-path-sum/) | [Java](./java/dp/MinimumPathSum.java)                        | Medium     |                   | ?    |
| 66   | [Plus One](https://leetcode-cn.com/problems/plus-one/)       | [Java](./java/array/PlusOne.java)                            | Easy       |                   | !?    |
| 69   | [Sqrtx](https://leetcode-cn.com/problems/sqrtx/)             | [Java](./java/binarysearch/SqrtX.java)                       | Easy       |                   | !     |
| 70   | [Climbing-Stairs](https://leetcode-cn.com/problems/climbing-stairs/) | [Java](./java/dp/ClimbingStairs.java)                        | Easy       |                   | !!!   |
| 72   | [Edit Distance](https://leetcode.com/problems/edit-distance/)&hearts; | [Java](./java/dp/EditDistance.java)                          | Hard       | DP                | ?     |
| 74   | [Search-A-2d-Matrix](https://leetcode-cn.com/problems/search-a-2d-matrix/) | [Java](./java/binarysearch/Matrix.java)                      | Medium     |                   | !     |
| 75 | [Sort-Colors](https://leetcode-cn.com/problems/sort-colors/) | [Java](./java/array/SortColors.java) | Medium | Array | ! |
| 76   | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) |                                                              | Hard       |                   |       |
| 77   | [Combinations](https://leetcode-cn.com/problems/combinations/) | [Java](./java/recursion/Combinations.java)                   | Medium     |                   | ?     |
| 78   | [Subsets](https://leetcode-cn.com/problems/subsets/)         | [Java](./java/divde_conquer/Subsets.java)                    | Medium     |   Backtracking              | ??     |
| 79   | [Word-Search](https://leetcode-cn.com/problems/word-search/) | [Java](./java/dfs_bfs/WordSearch.java)                       | Medium     | DFS               | ？    |
| 83   | [Remove-Duplicates-From-Sorted-List](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/description/) | [Java](./java/list/RemoveDuplicates.java)                    | Easy       |                   | !     |
| 84   | [Largest Rectangle in Histogram](https://leetcode-cn.com/problems/largest-rectangle-in-histogram/) | [Java](./java/stack/LargestRectangle.java)                   | Hard       | Stack             | !?    |
| 85   | [Maximal-Rectangle](https://leetcode-cn.com/problems/maximal-rectangle/) |                                                              | Hard       |                   |       |
| 91   | [Decode Ways](https://leetcode-cn.com/problems/decode-ways/) | [Java](./java/dp/DecodeWays.java)                            | Medium     | DP                | ?     |
| 88   | [Merge Sorted Array](https://leetcode-cn.com/problems/merge-sorted-array/) | [Java](./java/array/MergeSortedArray.java)                   | Easy       |                   | ?!   |
| 94   | [Binary Tree Inorder Traversal](https://leetcode-cn.com/problems/binary-tree-inorder-traversal/) | [Java](./java/tree/InOrderTraversal.java)                    | Medium     |                   | !     |
| 98   | [Validate Binary Search Tree](https://leetcode-cn.com/problems/validate-binary-search-tree/) | [Java](./java/recursion/ValidateBinarySearchTree.java)       | Medium     |                   | !     |
| 101  | [symmetric-tree](https://leetcode-cn.com/problems/symmetric-tree/description/) |                                                              | Easy       | Tree              | !     |
| 102  | [Binary Tree Level Order Traversal](https://leetcode-cn.com/problems/binary-tree-level-order-traversal/) | [Java](./java/tree/LevelOrderTraversal2.java)                | Medium     | BFS               | !??    |
| 104  | [Maximum Depth of Binary Tree](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/) | [Java](./java/recursion/MaximumDepth.java)                   | Easy       |                   | ?!!  |
| 105  | [Construct Binary Tree from Preorder and Inorder Traversal](https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | [Java](./java/recursion/ConstructBinaryTree.java)            | Medium     |                   | !     |
| 108  | [Convert Sorted Array to Binary Search Tree](https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree) |                                                              | Easy       | Tree              | ?     |
| 109  | [Convert-Sorted-List-To-Binary-Search-Tree](https://leetcode-cn.com/problems/convert-sorted-list-to-binary-search-tree/description/) | [Java](./java/tree/ConvertSortedList.java)                   | Medium     | Tree              | ?     |
| 110  | [Balanced-Binary-Tree](https://leetcode-cn.com/problems/balanced-binary-tree/description/) |                                                              | Easy       | Tree              | !     |
| 111  | [Minimum Depth of Binary Tree](https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/) | [Java](./java/recursion/MinimumDepth.java)                   | Easy       | Tree              | !?    |
| 112  | [Path-Sum](https://leetcode-cn.com/problems/path-sum)        |                                                              | Easy       | Tree              | ?     |
| 115  | [Distinct-subsequences](https://leetcode-cn.com/problems/distinct-subsequences/) |                                                              | Hard       |                   |       |
| 120  | [Triangle](https://leetcode-cn.com/problems/triangle/description/) | [Java](./java/dp/Triangle.java)                              | Medium     |                   | !     |
| 121  | [Best-Time-To-Buy-And-Sell-Stock](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/) |                                                              | Easy       |                   |       |
| 122  | [Best-Time-To-Buy-And-Sell-Stock-ii](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/description/) | [Java](./java/greedy/BuyAndSellStock.java)                   | Easy       |                   | !     |
| 123  | [Best-Time-To-Buy-And-Sell-Stock-iii](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iii/) |                                                              | Hard       |                   |       |
| 125  | [Valid Palindrome](https://leetcode-cn.com/problems/valid-palindrome/) | [Java](./java/string/ValidPalindrome.java)                   | Easy       |                   | !     |
| 126  | [Word-Ladder-ii](https://leetcode-cn.com/problems/word-ladder-ii/description/) | [Java](./java/dfs_bfs/WordLadderTwo.java)                    | Hard       |                   | ?     |
| 127  | [Word-Ladder](https://leetcode-cn.com/problems/word-ladder/) | [Java](./java/dfs_bfs/WordLadder.java)                       | Hard       |                   | ??     |
| 128  | [Longest-Consecutive-Sequence](https://leetcode-cn.com/problems/longest-consecutive-sequence) | [Java](./java/hashmap/LongestConsecutiveSequence.java)       | Hard       | HashMap           | ?     |
| 130  | [Surrounded-Regions](https://leetcode-cn.com/problems/surrounded-regions/) | [Java](./SurroundedRegions)                                  | Medium     | Disjoint Sets     | ?     |
| 138  | [Copy List with Random Pointer](https://leetcode-cn.com/problems/copy-list-with-random-pointer/) | [Java](./java/list/RandomPointer.java)                       | Medium     |                   | ?     |
| 141  | [Linked List Cycle](https://leetcode-cn.com/problems/linked-list-cycle/) | [Java](./java/list/LinkedListCycle.java)                     | Easy       |                   | !!    |
| 142  | [Linked List Cycle II](https://leetcode-cn.com/problems/linked-list-cycle-ii/) | [Java](./java/list/LinkedListCycleTwo.java)                  | Medium     |                   | !?    |
| 144  | [Binary Tree Preorder Traversal](https://leetcode-cn.com/problems/binary-tree-preorder-traversal/) | [Java](./java/tree/PreorderTraversal.java)                   | Medium     |                   | !     |
| 145  | [Binary Tree Postorder Traversal](https://leetcode-cn.com/problems/binary-tree-postorder-traversal/) | [Java](./java/tree/PostorderTraversal.java)                  | Medium     |                   | !     |
| 146  | [LRU Cache](https://leetcode-cn.com/problems/lru-cache/)     | [Java](./java/list/LRUCache.java)                            | Medium     |                   | !     |
| 151 | [Reverse-Words-In-A-String](https://leetcode-cn.com/problems/reverse-words-in-a-string/) | [Java](./java/string/ReverseWords.java) | Medium | String | ? |
| 152  | [Maximum-Product-Subarray](https://leetcode-cn.com/problems/maximum-product-subarray/) | [Java](./java/dp/MaximumProductSubarray.java)                | Medium     |                   | !     |
| 153  | [Find-Minimum-In-Rotated-Sorted-Array](https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/) | [Java](./java/binarysearch/Minimum.java)                     | Medium     |                   | !     |
| 155  | [Min Stack](https://leetcode-cn.com/problems/min-stack/)     | [Java](./java/stack/MinStack.java)                           | Easy       |                   | !     |
| 160  | [Intersection-Of-Two-Linked-Lists](https://leetcode-cn.com/problems/intersection-of-two-linked-lists/description/) | [Java](./java/list/TwoLinkedLists.java)                      | Easy       |                   | !     |
| 169  | [Majority-Element](https://leetcode-cn.com/problems/majority-element) | [Java](./java/divde_conquer/MajorityElement.java)            | Easy       |                   | !     |
| 188  | [Best-Time-To-Buy-And-Sell-Stock-iv](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iv/) |                                                              | Hard       |                   |       |
| 189  | [Rotate Array](https://leetcode-cn.com/problems/rotate-array/) | [Java](./java/array/RotateArray.java)                        | Medium     |                   | !?    |
| 190  | [Reverse-Bits](https://leetcode-cn.com/problems/reverse-bits/) | [Java](./java/bitwise/ReverseBits.java)                      | Easy       | Bitwise Operation | ?     |
| 191  | [Number-Of-1-Bits](https://leetcode-cn.com/problems/number-of-1-bits/) | [Java](./java/bitwise/NumberOfOneBits.java)                  | Easy       | Bitwise Operation | ?     |
| 198  | [House-Robber](https://leetcode-cn.com/problems/house-robber/) | [Java](./java/dp/HouseRobber.java)                           | Medium     |                   | !     |
| 200  | [Number Of Islands](https://leetcode-cn.com/problems/number-of-islands/) | [Java](./java/dfs_bfs/NumberOfIslands.java)                  | Medium     |                   | !     |
| 206  | [Reverse Linked List](https://leetcode-cn.com/problems/reverse-linked-list/) | [Java](./java/list/ReverseLinkedList.java)、[Go](./golang/list/reverseilist_test.go) | Easy       | List | !?!   |
| 208  | [Implement-Trie-Prefix-Tree](https://leetcode-cn.com/problems/implement-trie-prefix-tree/) | [Java](java/trie/Trie.java)                                  | Medium     | Trie              | ?     |
| 212  | [Word-Search-ii](https://leetcode-cn.com/problems/word-search-ii/) |                                                              | Hard       | Trie              |       |
| 213  | [House-Robber-ii](https://leetcode-cn.com/problems/house-robber-ii/description/) |                                                              | Medium     |                   |       |
| 217  | [Contains-Duplicate](https://leetcode-cn.com/problems/contains-duplicate/description/) | [Java](./java/hashmap/ContainsDuplicate.java)                | Easy       | HashMap           | !     |
| 221  | [Maximal Square](https://leetcode-cn.com/problems/maximal-square/) | [Java](./java/dp/MaximalSquare.java)                         | Medium     | DP                | ?     |
| 225  | [Implement Stack using Queues](https://leetcode-cn.com/problems/implement-stack-using-queues/description/) | [Java](./java/stack/MyStack.java)                            | Easy       | Stack             | !     |
| 226  | [Invert Binary Tree](https://leetcode-cn.com/problems/invert-binary-tree/) | [Java](./java/recursion/InvertBinaryTree.java)               | Easy       | Tree              | !?    |
| 231  | [Power-Of-Two](https://leetcode-cn.com/problems/power-of-two/) | [Java](./java/bitwise/PowerOfTwo.java)                       | Easy       | Bitwise Operation | ?     |
| 232  | [Implement Queue using Stacks](https://leetcode-cn.com/problems/implement-queue-using-stacks/description/) | [Java](./java/stack/MyQueue.java)                            | Easy       | Stack             | !     |
| 234  | [Palindrome-Linked-List](https://leetcode-cn.com/problems/palindrome-linked-list/) | [Java](./java/list/PalindromeLinkedList.java)                | Easy       |                   | !     |
| 236  | [Lowest Common Ancestor of a Binary Tree](https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/) | [Java](./java/recursion/LowestCommonAncestor.java)           | Medium     |                   | !     |
| 239  | [Sliding Window Maximum](https://leetcode-cn.com/problems/sliding-window-maximum/) | [Java](./java/queue/SlidingWindowMaximum.java)               | Hard       |                   | !     |
| 240  | [Search-A-2d-Matrix-ii](https://leetcode-cn.com/problems/search-a-2d-matrix-ii/description/) | [Java](./java/matrix/SearchMatrix.java)                      | Medium     |                   | !     |
| 241  | [Different-Ways-To-Add-Parentheses](https://leetcode-cn.com/problems/different-ways-to-add-parentheses/) | [Java](./java/divde_conquer/DiffWaysToCompute.java)          | Medium     | Divide & Conquer  | ?     |
| 242  | [Valid Anagram](https://leetcode-cn.com/problems/valid-anagram/) | [Java](./java/hashmap/ValidAnagram.java)                     | Easy       |                   | !?    |
| 260 | [Single-Number-iii](https://leetcode-cn.com/problems/single-number-iii/) | [Java](./java/bitwise/SingleNumber.java) | Medium | Bitwise Operation | ? |
| 279  | [Perfect-Squares](https://leetcode-cn.com/problems/perfect-squares/) |                                                              | Medium     |                   |       |
| 283  | [Move Zeroes](https://leetcode-cn.com/problems/move-zeroes/) | [Java](./java/array/MoveZeroes.java)、[Go](./golang/array/movezeros_test.go) | Easy       | Array | ?!   |
| 297  | [Serialize and Deserialize Binary Tree](https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree/) | [Java](./java/recursion/Codec.java)                          | Hard       |                   | ?     |
| 300  | [Longest-Increasing-Subsequence](https://leetcode-cn.com/problems/longest-increasing-subsequence/) | [Java](./java/dfs_bfs/LongestIncreasingSubsequence.java)     | Medium     | Binary Search     | ?     |
| 309  | [Best-Time-To-Buy-And-Sell-Stock-With-Cooldown](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/) |                                                              | Medium     |                   |       |
| 312  | [Burst Balloons](https://leetcode.com/problems/burst-balloons/) |                                                              | Hard       |                   |       |
| 322  | [Coin-Change](https://leetcode-cn.com/problems/coin-change/)&hearts; | [Java](./java/dp/CoinChange.java)                            | Medium     | DP                | !     |
| 328  | [Odd-Even-Linked-List](https://leetcode-cn.com/problems/odd-even-linked-list/description/) | [Java](./java/list/OddEven.java)                             | Medium     |                   | ?     |
| 337  | [House-Robber-iii](https://leetcode-cn.com/problems/house-robber-iii/description/) | [Java](./java/tree/HouseRobberThree.java)                    | Medium     | Tree              | ?     |
| 338  | [Counting-Bits](https://leetcode-cn.com/problems/counting-bits/)&hearts; | [Java](./java/bitwise/CountingBits.java) | Medium     | DP、Bitwise Operation | ? |
| 363  | [Max-Sum-Of-Rectangle-No-Larger-Than-K](https://leetcode-cn.com/problems/max-sum-of-rectangle-no-larger-than-k/) |                                                              | Hard       |                   |       |
| 367  | [Valid-Perfect-Square](https://leetcode-cn.com/problems/valid-perfect-square/) | [Java](./java/binarysearch/ValidPerfectSquare.java)          | Easy       |                   | !     |
| 378  | [Kth-Smallest-Element-In-A-Sorted-Matrix/](https://leetcode-cn.com/problems/kth-smallest-element-in-a-sorted-matrix/) | [Java](./java/matrix/KthSmallest.java)                       | Medium     |                   | ?     |
| 403  | [Frog Jump](https://leetcode-cn.com/problems/frog-jump/)     | [Java](./java/dp/FrogJump.java)                              | Hard       | DP                | ?     |
| 404  | [Sum-Of-Left-Leaves](https://leetcode-cn.com/problems/sum-of-left-leaves/description/) |                                                              | Easy       | Tree              | !     |
| 410  | [Split Array Largest Sum](https://leetcode.com/problems/split-array-largest-sum/) |                                                              | Hard       |                   |       |
| 429  | [N-Ary-Tree-Level-Order-Traversal](https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/) | [Java](./java/tree/NLevelOrderTraversal.java)                | Medium     |                   | !     |
| 433  | [MinimumGeneticMutation](https://leetcode-cn.com/problems/minimum-genetic-mutation) | [Java](./java/dfs_bfs/MinimumGeneticMutation.java)           | Medium     |                   | !     |
| 437  | [Path-Sum-iii](https://leetcode-cn.com/problems/path-sum-iii/description/) | [Java](./java/tree/PathSumThree.java)                        | Medium     | Tree              | ?     |
| 455  | [Assign-Cookies](https://leetcode-cn.com/problems/assign-cookies/description/) | [Java](./java/greedy/AssignCookies.java)                     | Easy       |                   | !     |
| 485  | [Max-Consecutive-Ones](https://leetcode-cn.com/problems/max-consecutive-ones/description/) | [Java](./java/array/MaxOnes.java)                            | Easy       |                   | ?     |
| 493  | [Reverse-Pairs](https://leetcode-cn.com/problems/reverse-pairs/) |                                                              | Hard       |                   |       |
| 503  | [Next Greater Element II](https://leetcode-cn.com/problems/next-greater-element-ii/submissions/) | [Java](./java/stack/NextGreaterElement.java)                 | Medium     |                   | ?     |
| 513  | [Find Bottom Left Tree Value](https://leetcode-cn.com/problems/find-bottom-left-tree-value/description/) | [Java](./java/tree/FindBottom.java)                          | Medium     | BFS               | ?     |
| 515  | [Find-Largest-Value-In-Each-Tree-Row](https://leetcode-cn.com/problems/find-largest-value-in-each-tree-row/) | [Java](./java/dfs_bfs/LargestValue.java)                     | Medium     |                   | !     |
| 518  | [Coin Change 2](https://leetcode.com/problems/coin-change-2/) | [Java](./java/dp/CoinChangeTwo.java)                         | Medium     | DP                | ?     |
| 529  | [Minesweeper](https://leetcode-cn.com/problems/minesweeper/) | [Java](./java/dfs_bfs/Minesweeper.java)                      | Medium     |                   | !     |
| 535  | [Encode-And-Decode-Tinyurl](https://leetcode-cn.com/problems/encode-and-decode-tinyurl) | [Java](./java/hashmap/DecodeTinyurl.java)                    | Medium     | HashMap           | ?     |
| 543  | [Diameter-Of-Binary-Tree](https://leetcode-cn.com/problems/diameter-of-binary-tree/description/) |                                                              | Easy       | Tree              | ?     |
| 552  | [Student-Attendance-Record-ii](https://leetcode-cn.com/problems/student-attendance-record-ii/) |                                                              | Hard       |                   |       |
| 566  | [Reshape-The-Matrix](https://leetcode-cn.com/problems//description/) | [Java](./java/matrix/ReshapeTheMatrix.java)                  | Easy       |                   | ?     |
| 572  | [Subtree-Of-Another-Tree](https://leetcode-cn.com/problems/subtree-of-another-tree/description/) |                                                              | Easy       | Tree              |       |
| 589  | [N-Ary-Tree-Preorder-Traversal](https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal) | [Java](./java/tree/NPreorderTraversal.java)                  | Easy       |                   | !     |
| 590  | [N-Ary-Tree-Postorder-Traversal](https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/) | [Java](./java/tree/NPreorderTraversal.java)                  | Easy       |                   | !     |
| 594  | [Longest-Harmonious-Subsequence](https://leetcode-cn.com/problems/longest-harmonious-subsequence/description/) | [Java](./java/hashmap/LongestHarmoniousSubsequence.java)     | Easy       | HashMap           | !     |
| 617  | [Merge Two Binary Trees](https://leetcode-cn.com/problems/merge-two-binary-trees/description/) |                                                              | Easy       | Tree              | ?     |
| 621  | [Task-Scheduler](https://leetcode-cn.com/problems/task-scheduler/) |                                                              | Medium     |                   |       |
| 637  | [Average-Of-Levels-In-Binary-Tree](https://leetcode-cn.com/problems/average-of-levels-in-binary-tree/) |                                                              | Easy       | DFS/BFS           | ?     |
| 641  | [Design Circular Deque](https://leetcode-cn.com/problems/design-circular-deque/) | [Java](./java/queue/MyCircularDeque.java)                    | Medium     |                   | !     |
| 647  | [Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings/) | [Java](./java/tree/LongestUnivaluePath.java)                 | Medium     | Tree              |       |
| 671  | [Second Minimum Node In a Binary Tree](https://leetcode-cn.com/problems/second-minimum-node-in-a-binary-tree/) |                                                              | Easy       | Tree              | ?     |
| 687  | [Longest Univalue Path](https://leetcode-cn.com/problems/longest-univalue-path/) |                                                              | Medium     |                   |       |
| 709  | [To-Lower-Case](https://leetcode-cn.com/problems/to-lower-case/) |                                                              | Easy       |                   |       |
| 712  | [Best-Time-To-Buy-And-Sell-Stock-With-Transaction-Fee](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/) |                                                              | Medium     |                   |       |
| 725  | [Split-Linked-List-In-Parts](https://leetcode-cn.com/problems/split-linked-list-in-parts) | [Java](./java/list/SplitListToParts.java)                    | Medium     |                   | ?     |
| 739  | [DailyTemperatures](https://leetcode-cn.com/problems/daily-temperatures/) | [Java](./java/stack/DailyTemperatures.java)                  | Medium     | Stack             | ?     |
| 746  | [Min-Cost-Climbing-Stairs](https://leetcode-cn.com/problems/min-cost-climbing-stairs/) |                                                              | Easy       |                   |       |
| 766  | [Toeplitz Matrix](https://leetcode-cn.com/problems/toeplitz-matrix/) | [Java](./java/matrix/ToeplitzMatrix.java)                    | Easy       |                   | ?     |
| 773  | [Sliding-Puzzle](https://leetcode-cn.com/problems/sliding-puzzle/) |                                                              | Hard       |                   |       |
| 818  | [Race-Car](https://leetcode-cn.com/problems/race-car/)       |                                                              | Hard       |                   |       |
| 860  | [Lemonade-Change](https://leetcode-cn.com/problems/lemonade-change) | [Java](./java/greedy/LemonadeChange.java)                    | Easy       |                   | !     |
| 874  | [Walking-Robot-Simulation](https://leetcode-cn.com/problems/walking-robot-simulation) | [Java](./java/greedy/WalkingRobot.java)                      | Easy       |                   | !     |
| 980  | [Unique Paths III](https://leetcode-cn.com/problems/unique-paths-iii/) | [Java](./java/dfs_bfs/UniquePathsThree.java)                 | Hard       | DFS               | ?   |
| 1091 | [Shortest-Path-In-Binary-Matrix](https://leetcode-cn.com/problems/shortest-path-in-binary-matrix/) |                                                              | Medium     |                   |       |
| 1122 | [Relative-Sort-Array](https://leetcode-cn.com/problems/relative-sort-array/) |                                                              | Easy       |                   |       |
| 1143 | [Longest-Common-Subsequence](https://leetcode-cn.com/problems/longest-common-subsequence/) | [Java](./java/dp/CommonSubsequence.java)                     | Medium     |                   | ?    |
| 1277 | [Count-Square-Submatrices-With-All-Ones](https://leetcode-cn.com/problems/count-square-submatrices-with-all-ones/) | [Java](./java/dp/SquareSubmatrices.java)                     | Medium     | DP                | ?     |


## 剑指Offer
| No. | Title                                                        | Solution                                                | Difficulty | Category         | Y&N |
| ---------- | ------------------------------------------------------------ | ------------------------------------------------------- | ---------- | ---------------- | ----- |
| 51         | [数组中的逆序对](https://leetcode-cn.com/problems/shu-zu-zhong-de-ni-xu-dui-lcof/) | [Java](./leetcode/java/divde_conquer/ReversePairs.java) | Hard       | Divide & Conquer | ?     |


> ! --- success ;  ? --- failure .

