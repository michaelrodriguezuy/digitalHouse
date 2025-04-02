package main

import (
	"fmt"
)

func main() {
	var i int
	var iP *int

	i = 34
	iP = &i //almaceno la direccion de memoria de i en iP

	//fmt.Println(&i) //imprimo la direccion de memoria de i
	//fmt.Println(iP) //imprimo la direccion de memoria de iP
	//fmt.Println(i) //imprimo el valor de i	
	//fmt.Println(*iP) //imprimo el valor de iP, que es la direccion de memoria de i

	*iP += 100 //modifico el valor de i a traves de iP, que es la direccion de memoria de i
	fmt.Println(i) //imprimo el valor de i, que ahora es 100
	fmt.Println(iP) //imprimo la direccion de memoria de iP
}