class Solution {
    fun solution(phone_number: String): String {
        val n: Int = phone_number.length - 4
        return "${"*".repeat(n)}${phone_number.substring(n)}"
    }
}

fun main() {
    val testCase: Array<String> = arrayOf("01033334444", "027778888", "1234")

    val s = Solution()

    for (case in testCase) {
        println(s.solution(case))
    }
}
