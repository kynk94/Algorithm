class Solution {
    fun solution1(arr: IntArray): IntArray {
        if (arr.size == 1)
            return intArrayOf(-1)

        val answer: MutableList<Int> = arr.toMutableList()
        answer.remove(arr.min()!!)
        return answer.toIntArray()
    }

    // filter 함수는 상당히 느리다...
    fun solution2(arr: IntArray): IntArray {
        if (arr.size == 1)
            return intArrayOf(-1)

        return arr.filter { it != arr.min() }.toIntArray()
    }
}

fun main() {
    val testCase: Array<IntArray> = arrayOf(
        intArrayOf(4, 3, 2, 1),
        intArrayOf(10)
    )

    val s = Solution()

    for (case in testCase) {
        println(s.solution1(case).contentToString())
    }
}