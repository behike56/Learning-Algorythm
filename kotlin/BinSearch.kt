
class BinSearch {
    fun main() {
        print(要素数:)
        val num: Int = readLine()
        val x: IntArray(num)

        println("昇順に入力してください。")

        print("x[0]: ")
        x[0] = readLine()

    }

    fun binSearch(a: IntArray, n: Int, key: Int) Int {
        var pl: Int = 0
        var pr: Int = n - 1

        do {
            var pc: Int = (pl + pr) / 2
            if (a[pc] == key) return pc
            if (a[pc] < key)
                pl = pc + 1
            if (a[pc] > key)
                pr = pc + 1
        } while (pl <= pr)

        return -1
    }
}