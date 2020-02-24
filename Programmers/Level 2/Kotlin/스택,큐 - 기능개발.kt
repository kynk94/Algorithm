import kotlin.math.ceil

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val publishes: MutableList<MutableList<Int>> = mutableListOf()
        var day: Int
        for ((p, s) in progresses.zip(speeds)) {
            day = ceil((100 - p).toFloat() / s).toInt()
            if (publishes.size == 0 || publishes.last()[0] < day)
                publishes.add(mutableListOf(day, 1))
            else
                publishes.last()[1]++
        }
        return IntArray(publishes.size) { publishes[it][1] }
    }
}

fun main() {
    val testCase: Array<List<Any>> = arrayOf(
        listOf(intArrayOf(93, 30, 55), intArrayOf(1, 30, 5))
    )

    val s = Solution()

    for (case in testCase) {
        println(s.solution(case[0] as IntArray, case[1] as IntArray).contentToString())
    }
}
