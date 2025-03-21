package main

import (
	"fmt"
)

func main(){

	yearsOld := 20
	/*
	if yearsOld < 18 {
		fmt.Println("Eres menor de edad")
	} else if yearsOld == 18 {
		fmt.Println("Apenas eres mayor de edad")
	} else {
		fmt.Println("Eres mayor de edad")
	}
	*/


	switch yearsOld {
	case 18:
		fmt.Println("Apenas eres mayor de edad")
	case 19:
		fmt.Println("Eres mayor de edad")
		case 17:
		fmt.Println("Eres menor de edad")
	default:
		fmt.Println("Eres un adulto")	
	}
}