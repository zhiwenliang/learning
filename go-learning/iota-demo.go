package main

import "fmt"

func main() {
	const (
		a = iota
		b
		c = "test"
		d
	)
	fmt.Println("a =", a, ", b =", b, ", c =", c, ", d =", d)
}
