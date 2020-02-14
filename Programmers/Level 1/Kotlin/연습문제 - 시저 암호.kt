class Solution {
    fun solution(s: String, n: Int): String =
        s.toCharArray().map { char ->
            when {
                char == ' ' -> char
                char.isLowerCase() -> ((char.toInt() - 97 + n) % 26 + 97).toChar()
                else -> ((char.toInt() - 65 + n) % 26 + 65).toChar()
            }
        }.joinToString("")
}

fun main() {
    val testCase: Array<Array<Any>> = arrayOf(
        arrayOf("AB", 1),
        arrayOf("z", 1),
        arrayOf("a B z", 4)
    )

    val s = Solution()

    for (case in testCase) {
        println(s.solution(case[0] as String, case[1] as Int))
    }
}
