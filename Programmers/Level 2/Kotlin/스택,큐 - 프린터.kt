import java.util.*

class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        val queue: Queue<Int> = LinkedList<Int>(priorities.toList())
        var loc: Int = location
        var m: Int? = queue.max()
        var v: Int
        var answer: Int = 0
        while (true) {
            v = queue.poll()
            if (v == m) {
                answer++
                if (loc == 0) break
                else loc--
                m = queue.max()
            } else {
                queue.add(v)
                if (loc == 0) loc = queue.size - 1
                else loc--
            }
        }
        return answer
    }
}

fun main() {
    val testCase: Array<List<Any>> = arrayOf(
        listOf(intArrayOf(2, 1, 3, 2), 2),
        listOf(intArrayOf(1, 1, 9, 1, 1, 1), 0)
    )

    val s = Solution()

    for (case in testCase) {
        println(s.solution(case[0] as IntArray, case[1] as Int))
    }
}
