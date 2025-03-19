package main

import (
	"fmt"
	"strconv"
)

func main() {

	// Declaración de variables
	var myIntVar int
	myIntVar = 42
	fmt.Println("Mi variable es ", myIntVar)

	var myUintVar uint // uint es un tipo de dato que solo acepta valores positivos
	myUintVar = 12
	fmt.Println("Mi variable UI es ", myUintVar)

	var myStringVar string
	myStringVar = "Hola mundo"
	fmt.Println("Mi variable string es ", myStringVar)

	var myBooleanVar bool
	myBooleanVar = true
	fmt.Println("Mi variable boolean es ", myBooleanVar)

	fmt.Println("Mi variable address es ", &myBooleanVar)

	// Declaración corta, solo se puede usar dentro de una función, declaro y asigno
	myIntVar2 := 33
	fmt.Println("Mi variable es ", myIntVar2)

	myStringVar2 := "Hola mundo"
	fmt.Println("Mi variable string es ", myStringVar2)

	// Constantes
	const myConstVar = 3.1416
	fmt.Println("Mi variable constante es ", myConstVar)


	//scopes
	{
		myIntVarScopes := 22
		fmt.Println("Mi variable scope es: ", myIntVarScopes)
	}
	//fmt.Println("Mi variable scope es: ", myIntVarScopes)

	// Strings
	var myStringVar3 string = "test1234"

	fmt.Printf("El valor de myStringVar3 es: %s \n", myStringVar3)

	//convirtiendo a String
	{
		floatVar := 3.1416
		fmt.Printf("type: %T, value: %v \n", floatVar, floatVar) // %v es para cualquier tipo de dato
		fmt.Printf("type: %T, value: %f \n", floatVar, floatVar) // %f es para float

		floatStrVar := fmt.Sprintf("%.2f", floatVar) // convierte a string, es mas personalizable
		fmt.Printf("type: %T, value: %s \n", floatStrVar, floatStrVar)

		//otra forma de convertir a string
		intVar3 := 423 // int
		intStringVar2 := strconv.Itoa(intVar3) // convierte a string
		fmt.Printf("type: %T, value: %s \n", intStringVar2, intStringVar2)
	}


}
