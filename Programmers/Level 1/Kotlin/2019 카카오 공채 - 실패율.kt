class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        val n: Int = stages.size
        val failRate = FloatArray(N)
        val cleared = IntArray(N + 1)
        for (i in stages)
            cleared[i - 1]++

        var count = n
        for ((idx, e) in cleared.dropLast(1).withIndex()) {
            when (count) {
                0 -> if (e == 0) failRate[idx] = 0f else failRate[idx] = 1f
                else -> failRate[idx] = e.toFloat() / count.toFloat()
            }
            count -= e
        }

        return IntArray(N) { it + 1 }.sortedByDescending { failRate[it - 1] }.toIntArray()
    }
}

fun main() {
    val testCase: Array<List<Any>> = arrayOf(
        listOf(5, intArrayOf(2, 1, 2, 6, 2, 4, 3, 3)),
        listOf(4, intArrayOf(4, 4, 4, 4, 4))
    )

    val s = Solution()

    for (case in testCase) {
        println(s.solution(case[0] as Int, case[1] as IntArray).contentToString())
    }
}
