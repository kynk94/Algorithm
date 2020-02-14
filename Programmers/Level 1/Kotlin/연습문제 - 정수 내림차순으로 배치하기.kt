class Solution {
    fun solution(n: Long): Long = String(n.toString().toCharArray().sortedArrayDescending()).toLong()
}

fun main() {
    val testCase: LongArray = longArrayOf(118372, 13579)

    val s = Solution()

    for (case in testCase) {
        println(s.solution(case))
    }
}