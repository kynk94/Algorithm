class Solution {
    fun solution(arrangement: String): Int {
        var answer: Int = 0
        var count: Int = 0
        var bi: Char = ' '
        for (i in arrangement) {
            when {
                bi == '(' && i == ')' -> {
                    count--
                    answer += count - 1
                }
                i == '(' -> {
                    count++
                    answer++
                }
                i == ')' -> count--
            }
            bi = i
        }
        return answer
    }
}

fun main() {
    val testCase: Array<String> = arrayOf(
        "()(((()())(())()))(())"
    )

    val s = Solution()

    for (case in testCase) {
        println(s.solution(case))
    }
}
