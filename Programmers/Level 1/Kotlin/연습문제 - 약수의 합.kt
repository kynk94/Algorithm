class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        for (i in 1..n)
            if (n % i == 0) answer += i
        return answer
    }
}

fun main() {
    val testCase: IntArray = intArrayOf(12, 5, 0)

    val s = Solution()

    for (case in testCase) {
        println(s.solution(case))
    }
}
