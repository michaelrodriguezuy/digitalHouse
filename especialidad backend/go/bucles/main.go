package main

import (
	"fmt"
)

func main() {

	sum:=0

	sum++

	fmt.Println("el valor inicial de sum + 1 =",sum)

	for i:=range 10 {
		fmt.Println(i)		
	}

	sum--
	for i:=0; i<10; i++ {
		sum+=i
	}
	fmt.Println("El valor de sum es: ",sum)

}