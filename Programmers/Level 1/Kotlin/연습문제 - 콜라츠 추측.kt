class Solution {
    fun solution(num: Int): Int {
        var n: Long = num.toLong()
        var count: Int = 0

        while (count < 500) {
            when {
                n == 1L -> return count
                n % 2 == 0L -> n /= 2
                else -> n = 3 * n + 1
            }
            count++
        }

        return -1
    }
}

fun main() {
    val testCase: Array<Int> = arrayOf(2, 6, 16, 626331)

    val s = Solution()

    for (case in testCase) {
        println(s.solution(case))
    }
}