package main

import (
	"fmt"
)

func main(){

	// myArrayVar := [4] int {1, 2, 3, 4}

	mySliceVar := [] int {}

	fmt.Println("slice inicial: ", mySliceVar, " - len: ", len(mySliceVar))


	mySliceVar = append(mySliceVar, 1, 2, 3, 92, 6, 9)
	fmt.Println("slice recargado: ", mySliceVar, " - len: ", len(mySliceVar))

	//imprimir por rangos

	fmt.Println(mySliceVar[1:6]) // el valor luego de los dos puntos es exclusivo, es decir, no se imprime

	fmt.Println(mySliceVar[:6]) // imprime desde el inicio hasta el indice 6
	fmt.Println(mySliceVar[2:]) // imprime desde el indice 2 hasta el final

	

}