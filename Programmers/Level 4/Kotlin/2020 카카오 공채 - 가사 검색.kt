class Trie(var count: Int, val child: MutableMap<Char, Trie>? = mutableMapOf())

class Solution {
    fun solution(words: Array<String>, queries: Array<String>): IntArray {
        val wordMap: MutableMap<Int, Trie> = mutableMapOf()
        val wordMapReverse: MutableMap<Int, Trie> = mutableMapOf()

        for (word in words) {
            getMap(wordMap, word)
            getMap(wordMapReverse, word.reversed())
        }

        val answer: MutableList<Int> = mutableListOf()
        for (query in queries) {
            if (query.endsWith('?')) answer.add(searchMap(wordMap, query))
            else answer.add(searchMap(wordMapReverse, query.reversed()))
        }
        return answer.toIntArray()
    }

    private fun getMap(map: MutableMap<Int, Trie>, word: String) {
        val n: Int = word.length
        if (!map.containsKey(n)) map[n] = Trie(count = 0)

        var node: Trie = map[n]!!
        node.count++
        for (c in word) {
            if (!node.child!!.containsKey(c)) node.child!![c] = Trie(count = 0)
            node.child!![c]!!.count++
            node = node.child!![c]!!
        }
    }

    private fun searchMap(map: MutableMap<Int, Trie>, query: String): Int {
        val n: Int = query.length
        if (!map.containsKey(n)) return 0

        var node: Trie = map[n]!!
        for (c in query){
            when{
                c == '?' -> return node.count
                !node.child!!.containsKey(c) -> return 0
            }
            node = node.child!![c]!!
        }
        return 0
    }
}

fun main() {
    val testCase: Array<Array<Array<String>>> = arrayOf(
        arrayOf(
            arrayOf("frodo", "front", "frost", "frozen", "frame", "kakao"),
            arrayOf("fro??", "????o", "fr???", "fro???", "pro?")
        )
    )

    val s = Solution()

    for (case in testCase) {
        println(s.solution(case[0], case[1]).contentToString())
    }
}
