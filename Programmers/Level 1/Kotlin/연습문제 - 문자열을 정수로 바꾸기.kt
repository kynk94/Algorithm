class Solution {
    fun solution(s: String): Int = s.toInt()
}

fun main() {
    val testCase: Array<String> = arrayOf("1234", "-394", "+56789")

    val s = Solution()

    for (case in testCase) {
        println(s.solution(case))
    }
}
