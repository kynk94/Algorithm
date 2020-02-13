class Solution {
    fun solution(a: Int, b: Int): Long {
        var s = a
        var l = b

        if (s > l) l = s.also { s = l }

        var answer: Long = 0L
        for (i in s..l) answer += i

        return answer
    }
}

fun main() {
    val testCase: Array<IntArray> = arrayOf(
        intArrayOf(3, 5),
        intArrayOf(3, 3),
        intArrayOf(5, 3)
    )

    val s = Solution()
    for (case in testCase) {
        println(s.solution(case[0], case[1]))
    }
}
