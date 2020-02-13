class Solution {
    fun solution(s: String): String {
        return s.slice((s.length - 1) / 2..s.length / 2)
    }
}

fun main() {
    val testCase: Array<String> = arrayOf("abcde", "qwer")

    val s = Solution()
    for (case in testCase) {
        println(s.solution(case))
    }
}
