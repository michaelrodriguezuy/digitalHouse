package main

import (
	"github.com/michaelrodriguez/digitalhouse-backend-go/functions/function"
)

func main() {
	function.Display(10)

	v:= 	function.Add(10, 5)

	function.Display(v)

	function.RepeatString(5, "Hello World")
}
