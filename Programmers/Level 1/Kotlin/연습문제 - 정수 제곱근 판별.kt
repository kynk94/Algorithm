import kotlin.math.floor
import kotlin.math.pow
import kotlin.math.sqrt

class Solution {
    fun solution(n: Long): Long {
        val nSqrt: Double = sqrt(n.toDouble())
        return if (floor(nSqrt) == nSqrt) (nSqrt + 1).pow(2).toLong() else -1
    }
}

fun main() {
    val testCase: LongArray = longArrayOf(121, 3)

    val s = Solution()

    for (case in testCase) {
        println(s.solution(case))
    }
}