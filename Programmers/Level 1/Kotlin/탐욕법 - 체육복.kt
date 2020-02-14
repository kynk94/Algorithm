class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var count: IntArray = IntArray(n) { 1 }
        lost.forEach { count[it - 1]-- }
        reserve.forEach { count[it - 1]++ }

        for ((idx, e) in count.withIndex()) {
            if (e == 0) {
                if (idx > 0 && count[idx - 1] == 2) count[idx]++.also { count[idx - 1]-- }
                else if (idx < n - 1 && count[idx + 1] == 2) count[idx]++.also { count[idx + 1]-- }
            }
        }
        return n - count.count { it == 0 }
    }
}

fun main() {
    val testCase: List<List<Any>> = listOf(
        listOf(5, intArrayOf(2, 4), intArrayOf(1, 3, 5)),
        listOf(5, intArrayOf(2, 4), intArrayOf(3)),
        listOf(3, intArrayOf(3), intArrayOf(1))
    )


    val s = Solution()

    for (case in testCase) {
        println(s.solution(case[0] as Int, case[1] as IntArray, case[2] as IntArray))
    }
}
