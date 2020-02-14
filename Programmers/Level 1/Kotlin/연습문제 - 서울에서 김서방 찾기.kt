class Solution {
    fun solution(seoul: Array<String>): String = "김서방은 ${seoul.indexOf("Kim")}에 있다"
}

fun main() {
    val testCase: Array<Array<String>> = arrayOf(
        arrayOf("Jane", "Kim"),
        arrayOf("Ann", "Kali", "Kim")
    )

    val s = Solution()

    for (case in testCase) {
        println(s.solution(case))
    }
}
