class Solution {
    fun solution(key: Array<IntArray>, lock: Array<IntArray>): Boolean {
        val m: Int = key.size
        val n: Int = lock.size
        var fill: Int = 0
        var count: Int
        var innerBreak: Boolean

        // count Blank of lock
        for (r in lock)
            for (c in r) if (c == 0) fill++

        // keys: List of rotated keys by (0, 90, 180, 270) degrees.
        val keys: MutableList<Array<IntArray>> = mutableListOf(key)
        for (i in 0..2) {
            val newKey: Array<IntArray> = Array(m) { IntArray(m) }
            for (r in 0 until m)
                for (c in 0 until m) newKey[r][c] = keys[i][m - c - 1][r]
            keys.add(newKey)
        }

        // worst is O(4 * n^4)
        for (k in keys) {
            for (i in 0 until m + n - 1) {
                for (j in 0 until m + n - 1) {
                    count = 0
                    innerBreak = false
                    for ((kiPlus, li) in (maxOf(i - m + 1, 0) until minOf(i + 1, n)).withIndex()) {
                        if (innerBreak) break
                        else {
                            for ((kjPlus, lj) in (maxOf(j - m + 1, 0) until minOf(j + 1, n)).withIndex()) {
                                val ki: Int = maxOf(m + kiPlus - i - 1, kiPlus)
                                val kj: Int = maxOf(m + kjPlus - j - 1, kjPlus)
                                val lVal: Int = lock[li][lj]
                                val kVal: Int = k[ki][kj]
                                if (kVal == 1) {
                                    if (lVal == 0) count++
                                    else {
                                        innerBreak = true
                                        break
                                    }
                                }
                            }
                        }
                    }
                    // If didn't broke, compare count to fill.
                    if (!innerBreak && count == fill) return true
                }
            }
        }
        return false
    }
}

fun main() {
    val testCase: Array<Array<Array<IntArray>>> = arrayOf(
        arrayOf(
            arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(1, 0, 0),
                intArrayOf(0, 1, 1)
            ),
            arrayOf(
                intArrayOf(1, 1, 1),
                intArrayOf(1, 1, 0),
                intArrayOf(1, 0, 1)
            )
        ),
        arrayOf(
            arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(1, 0, 1),
                intArrayOf(1, 0, 1)
            ),
            arrayOf(
                intArrayOf(1, 1, 1, 1, 1),
                intArrayOf(1, 0, 0, 1, 1),
                intArrayOf(1, 1, 1, 1, 1),
                intArrayOf(1, 0, 0, 1, 1),
                intArrayOf(1, 1, 1, 1, 1)
            )
        )
    )

    val s = Solution()

    for (case in testCase) {
        println(s.solution(case[0], case[1]))
    }
}
