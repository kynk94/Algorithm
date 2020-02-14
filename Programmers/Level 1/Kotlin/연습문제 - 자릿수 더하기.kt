class Solution {
    // 내장 함수를 쓰는게 제일 빠르다
    fun solution1(n: Int): Int =
        n.toString().sumBy { it.toInt() - 48 }

    fun solution2(n: Int): Int {
        var answer: Int = 0
        n.toString().forEach { answer += it.toInt() - 48 }
        return answer
    }
}

fun main() {
    val testCase: IntArray = intArrayOf(123, 987)

    val s = Solution()

    for (case in testCase) {
        println(s.solution2(case))
    }
}