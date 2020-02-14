class Solution {
    fun solution(s: String): Boolean {
        s.length.also { len ->
            if (len !=4 && len != 6) return false
        }

        s.forEach {
            if (!it.isDigit()) return false
        }

        return true
    }
}

fun main() {
    val testCase: Array<String> = arrayOf(
        "a234",
        "1234",
        "12d4g"
    )

    val s = Solution()

    for (case in testCase) {
        println(s.solution(case))
    }
}
