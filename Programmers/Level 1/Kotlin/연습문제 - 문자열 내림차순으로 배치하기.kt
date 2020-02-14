class Solution {
    // sortedArrayDescending() 보다 sortedDescending() 이 좀 더 빠르다.
    //fun solution(s: String): String = s.toCharArray().sortedDescending().joinToString("")
    //fun solution(s: String): String = s.toCharArray().sortedArrayDescending().joinToString("")

    // String() 함수를 사용하려면 sortedArrayDescending() 을 사용해야 한다.
    fun solution(s: String): String = String(s.toCharArray().sortedArrayDescending())
}

fun main() {
    val testCase: Array<String> = arrayOf(
        "Zbcdefg",
        "vnsAdkw"
    )

    val s = Solution()

    for (case in testCase) {
        println(s.solution(case))
    }
}
