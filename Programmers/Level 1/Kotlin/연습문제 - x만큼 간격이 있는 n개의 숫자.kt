class Solution {
    fun solution(x: Int, n: Int): LongArray =
        LongArray(n) { ((it.toLong() + 1L) * x) }
}

fun main() {
    val testCase: Array<IntArray> = arrayOf(
        intArrayOf(2, 5),
        intArrayOf(4, 3),
        intArrayOf(-4, 2)
    )

    val s = Solution()

    for (case in testCase) {
        println(s.solution(case[0], case[1]).contentToString())
    }
}
