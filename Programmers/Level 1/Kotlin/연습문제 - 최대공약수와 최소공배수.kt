class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var a: Int = n
        var b: Int = m

        while (b != 0)
            a = b.also { b = a % b }

        return intArrayOf(a, n * m / a)
    }
}

fun main() {
    val testCase: Array<IntArray> = arrayOf(
        intArrayOf(3, 12),
        intArrayOf(2, 5)
    )

    val s = Solution()

    for (case in testCase) {
        println(s.solution(case[0], case[1]).contentToString())
    }
}