class Solution {
    fun solution(s: String): String {
        var count: Int = 0
        val answer: StringBuilder = StringBuilder()
        s.forEach { char ->
            if (char != ' ') {
                if (count % 2 == 0) answer.append(char.toUpperCase())
                else answer.append(char.toLowerCase())
                count++
            } else {
                answer.append(char)
                count = 0
            }
        }
        return answer.toString()
    }
}

fun main() {
    val testCase: Array<String> = arrayOf("try hello world", "helter skelter")

    val s = Solution()

    for (case in testCase) {
        println(s.solution(case))
    }
}