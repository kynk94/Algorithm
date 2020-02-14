class Solution {
    //fun solution(n: Int): String =
    //    (0 until n).joinToString("") { if (it % 2 == 0) "수" else "박" }
    fun solution(n: Int): String =
        Array(n) { if (it % 2 == 0) "수" else "박" }.joinToString("")
}

fun main() {
    val testCase: IntArray = intArrayOf(3, 4)

    val s = Solution()

    for (case in testCase) {
        println(s.solution(case))
    }
}
