package main

import (
	"fmt"

	"github.com/michaelrodriguez/digitalhouse-backend-go/functions/function"
)

func main() {

	/*
	function.Display(10)

	v:= 	function.Add(10, 5)

	function.Display(v)

	function.RepeatString(5, "Hello World")

	value, err := function.Calc(function.TEST, 10.50, 40)
	
	fmt.Println("Result: ", value, " - Error: ", err)

	x, y := function.Split(100)
	fmt.Println("X: ", x, " - Y: ", y)

	fmt.Println("La suma de sus numeros es: ",function.MSum(10, 20, 30, 40, 50, 1))
*/


//fmt.Println(function.MOperation(function.SUM))


factOpFunc := function.FactoryOperation(function.DIV)

fmt.Println(factOpFunc(10, 0))

	}
