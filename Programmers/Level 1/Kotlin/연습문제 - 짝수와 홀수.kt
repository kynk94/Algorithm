class Solution {
    fun solution(num: Int): String =
        if (num % 2 == 0) "Even" else "Odd"
}

fun main() {
    val testCase: Array<Int> = arrayOf(3, 4)

    val s = Solution()

    for (case in testCase) {
        println(s.solution(case))
    }
}