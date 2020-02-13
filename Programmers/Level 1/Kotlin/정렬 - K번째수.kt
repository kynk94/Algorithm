class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer: ArrayList<Int> = ArrayList<Int>()
        for (command in commands) {
            val newArray: IntArray = array.sliceArray(command[0] - 1 until command[1]).sortedArray()
            answer.add(newArray[command[2] - 1])
        }
        return answer.toIntArray()
    }
}

fun main() {
    val array: IntArray = intArrayOf(1, 5, 2, 6, 3, 7, 4)
    val commands: Array<IntArray> = arrayOf(
        intArrayOf(2, 5, 3),
        intArrayOf(4, 4, 1),
        intArrayOf(1, 7, 3)
    )

    println(Solution().solution(array, commands).contentToString())
}
