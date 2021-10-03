class BinSearch {
    fun main() {
        print("要素数:")
        val num: Int = readLine()?.toInt() ?: 0
        val x: IntArray(num)

        println("昇順に入力してください。")

        print("x[0]: ")
        x[0] = readLine()?.toInt() ?: 0

        for (i in 0 until num) {
            do {
                print("x[" + i + "]: ")
                x[i] = readLine()?.toInt() ?: 0
            } while (x[i] < x[i - 1])
        }

        print("探す値：")
        val ky: Int = readLine()?.toInt() ?: 0
        val idx: Int = binSearch(x, num, ky)

        if (idx == -1)
            print("その値の要素は存在しません。")
        else
            print("その値はx[" + idx + "]にあります。")
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