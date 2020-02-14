class Solution {
    fun solution1(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val row: Int = arr1.size
        val col: Int = arr1[0].size

        val answer: Array<IntArray> = Array(row) { IntArray(col) }
        for (i in 0 until row) {
            for (j in 0 until col)
                answer[i][j] = arr1[i][j] + arr2[i][j]
        }

        return answer
    }

    fun solution2(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> =
        Array(arr1.size) { row ->
            IntArray(arr1[0].size) { col ->
                arr1[row][col] + arr2[row][col]
            }
        }
}

fun main() {
    val testCase: Array<Array<Array<IntArray>>> = arrayOf(
        arrayOf(
            arrayOf(intArrayOf(1, 2), intArrayOf(2, 3)),
            arrayOf(intArrayOf(3, 4), intArrayOf(5, 6))
        ),
        arrayOf(
            arrayOf(intArrayOf(1), intArrayOf(2)),
            arrayOf(intArrayOf(3), intArrayOf(4))
        )
    )

    val s = Solution()

    for (case in testCase) {
        val answer = (s.solution2(case[0], case[1]))
        for (i in answer.indices) {
            println(answer[i].contentToString())
        }
        println()
    }
}
