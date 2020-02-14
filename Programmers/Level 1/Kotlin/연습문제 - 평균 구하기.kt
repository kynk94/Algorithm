class Solution {
    fun solution(arr: IntArray): Double = arr.average()
}

fun main() {
    val testCase: Array<IntArray> = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 5)
    )

    val s = Solution()

    for (case in testCase) {
        println(s.solution(case))
    }
}