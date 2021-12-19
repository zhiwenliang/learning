package main

import (
	"fmt"
	"math"
	"reflect"
	"strings"
)

func main() {
	var a float64
	var b string
	var c reflect.Type
	a = math.Floor(2.75)
	b = strings.Title("head first go")
	c = reflect.TypeOf(a)
	fmt.Println(a, b, c)
}
