class Solution {
    fun solution1(arr: IntArray, divisor: Int): IntArray {
        var answer = ArrayList<Int>()

        for (e in arr) {
            if (e % divisor == 0) answer.add(e)
        }
        if (answer.isEmpty()) answer.add(-1)

        return answer.toIntArray().sortedArray()
    }

    fun solution2(arr: IntArray, divisor: Int): IntArray {
        val filtered = arr.filter { it % divisor == 0 }

        if (filtered.isEmpty()) return intArrayOf(-1)

        return filtered.toIntArray().sortedArray()
    }
}

fun main() {
    val testCase: Array<List<Any>> = arrayOf(
        listOf(intArrayOf(5, 9, 7, 10), 5),
        listOf(intArrayOf(2, 36, 1, 3), 1),
        listOf(intArrayOf(3, 2, 6), 10)
    )

    val s = Solution()

    var startTime = System.currentTimeMillis()
    for (case in testCase) {
        println(s.solution1(case[0] as IntArray, case[1] as Int).contentToString())
    }
    println("Time: ${System.currentTimeMillis() - startTime} ms")

    startTime = System.currentTimeMillis()
    for (case in testCase) {
        println(s.solution2(case[0] as IntArray, case[1] as Int).contentToString())
    }
    println("Time: ${System.currentTimeMillis() - startTime} ms")
}
