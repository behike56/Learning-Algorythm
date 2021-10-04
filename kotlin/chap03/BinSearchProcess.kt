fun searchIdx(a: IntArray, n: Int, key: Int, idx: IntArray): Int {

    var index = 0
    for (i in 0 until n) {
        if (a[i] == key) {
            idx[index] = i
            index++
        }
    }
    return idx.size
}