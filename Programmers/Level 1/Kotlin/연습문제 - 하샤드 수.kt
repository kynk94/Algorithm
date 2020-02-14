class Solution {
    fun solution(x: Int): Boolean =
        x % x.toString().sumBy { it.toInt() - 48 } == 0
}

fun main() {
    val testCase: Array<Int> = arrayOf(10, 12, 11, 13)

    val s = Solution()

    for (case in testCase) {
        println(s.solution(case))
    }
}
