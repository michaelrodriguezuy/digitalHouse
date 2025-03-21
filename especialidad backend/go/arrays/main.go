package main

import (
	"fmt"
	"unsafe"
)

func main() {
	var myIntVar = 30 // es un entero de 64bits por defecto porque mi equipo es de 64bits
	fmt.Printf("type: %T, value: %d, bytes: %d, bits: %d \n", myIntVar, myIntVar, unsafe.Sizeof(myIntVar), unsafe.Sizeof(myIntVar)*8)

	var myArrayVar [4] int // es un array de 4 enteros de 64bits
	fmt.Printf("type: %T, value: %d, bytes: %d, bits: %d \n", myArrayVar, myArrayVar, unsafe.Sizeof(myArrayVar), unsafe.Sizeof(myArrayVar)*8)

	fmt.Println(myArrayVar, " - size: ", len(myArrayVar), " - capacity: ", cap(myArrayVar))
}