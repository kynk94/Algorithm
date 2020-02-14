class Solution {
    fun solution1(strings: Array<String>, n: Int): Array<String> {
        return strings.sortedArray().sortedWith(compareBy { it[n] }).toTypedArray()
    }

    fun solution2(strings: Array<String>, n: Int): Array<String> {
        return strings.also { string ->
            string.sort()
            string.sortBy { string[n] }
        }
    }
}

fun main() {
    val testCase: Array<List<Any>> = arrayOf(
        listOf(arrayOf("sun", "bed", "car"), 1),
        listOf(arrayOf("abce", "abcd", "cdx"), 2)
    )

    val s = Solution()

    var startTime = System.nanoTime()
    for (case in testCase) {
        @Suppress("UNCHECKED_CAST")
        println(s.solution1(case[0] as Array<String>, case[1] as Int).contentToString())
    }
    println("Time: ${(System.nanoTime() - startTime) / 1000} us")

    startTime = System.nanoTime()
    for (case in testCase) {
        @Suppress("UNCHECKED_CAST")
        println(s.solution2(case[0] as Array<String>, case[1] as Int).contentToString())
    }
    println("Time: ${(System.nanoTime() - startTime) / 1000} us")
}
