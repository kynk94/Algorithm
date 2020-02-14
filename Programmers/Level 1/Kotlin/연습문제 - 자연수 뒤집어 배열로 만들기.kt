class Solution {
    fun solution1(n: Long): IntArray =
        n.toString().reversed().map { it.toInt() - 48 }.toIntArray()

    // String 을 조작하는 것보다 길이만큼의 IntArray 를 만드는게 훨씬 빠름
    fun solution2(n: Long): IntArray {
        val s: String = n.toString().reversed()
        return IntArray(s.length) { s[it].toInt() - 48 }
    }
}

fun main() {
    val testCase: LongArray = longArrayOf(12345, 13579)

    val s = Solution()

    for (case in testCase) {
        println(s.solution2(case).contentToString())
    }
}