package main

import (
	"fmt"
	"bufio"
	"os"
)

var stdIn = bufio.NewScanner(os.Stdin)

func main(){
	fmt.Println("要素数：")
	var num int = nextInt()
	x := [num]int{}

	fmt.Println("昇順に入力してください。")

	fmt.Println("x[0]: ")
	x[0] = nextInt()

	for i := 1; i < nnum; i++ {
		for x[i] < x[i - 1] {
			println("x[" + i + "]:")
			x[i] = nextInt()
		}
	}

	print("探す値：")
	ky := nextInt()
	idx := binSearch(x, num, ky)

	if idx == -1 {
		println("その値の要素は存在しません。")
	}
	if idx > -1 {
		fmt.Println("その値はx[" + idx + "]にあります。")
	}
}

func nextInt() int {
	    stdIn.Scan()
    i, e := strconv.Atoi(sc.Text())
    if e != nil {
        panic(e)
    }

    return i
}

func binSearch(a []int, n int, key int) int {
	pl := 0
	pr := n - 1

	for pl <= pr {
		var pc int = (pl + pr) / 2

		if a[pc] == key {
			return pc;
		}
		if a[pc] < key {
			pl := pc + 1
		}
		if a[pc] > key {
			pr := pc - 1
		}
	}

	return -1
}
