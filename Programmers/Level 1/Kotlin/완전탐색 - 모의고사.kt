class Solution {
    private val pattern: List<IntArray> = listOf(
        intArrayOf(1, 2, 3, 4, 5),
        intArrayOf(2, 1, 2, 3, 2, 4, 2, 5),
        intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
    )

    fun solution(answers: IntArray): IntArray {
        var answer: IntArray = intArrayOf(0, 0, 0)

        for ((idx, e) in answers.withIndex()) {
            for (p in 0 until 3) {
                if (e == pattern[p][idx % pattern[p].size])
                    answer[p]++
            }
        }

        var result: ArrayList<Int> = ArrayList<Int>()
        val maxVal: Int = answer.max()!!

        for ((idx, e) in answer.withIndex()) {
            if (e == maxVal) result.add(idx + 1)
        }

        return result.toIntArray()
    }
}

fun main() {
    val testCase: List<IntArray> = listOf(
        intArrayOf(1, 2, 3, 4, 5),
        intArrayOf(1, 3, 2, 4, 2)
    )

    val s = Solution()
    for (case in testCase) {
        println(s.solution(case).contentToString())
    }
}
