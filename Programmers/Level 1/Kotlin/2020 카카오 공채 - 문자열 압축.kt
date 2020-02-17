class Solution {
    fun solution(s: String): Int {
        val len = s.length
        val subs: List<MutableList<String>> =
            (1..len / 2).map { s.chunked(it).toMutableList() }

        var answer: Int = len
        for (tokens in subs) {
            var count: Int = 1
            val createdString = StringBuilder()

            tokens.add("")
            for ((b, c) in tokens.zip(tokens.drop(1))) {
                when {
                    b == c -> count++
                    count == 1 -> createdString.append(b)
                    else -> {
                        createdString.append("$count$b")
                        count = 1
                    }
                }
            }

            if (answer > createdString.length)
                answer = createdString.length
        }
        return answer
    }
}

fun main() {
    val testCase: Array<String> = arrayOf(
        "aabbaccc",
        "ababcdcdababcdcd",
        "abcabcdede",
        "abcabcabcabcdededededede",
        "xababcdcdababcdcd"
    )

    val s = Solution()

    for (case in testCase) {
        println(s.solution(case))
    }
}
