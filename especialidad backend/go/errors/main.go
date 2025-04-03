package main

import (
	"errors"
	"fmt"
	"log" //esto va de yapa, lo puse yo pero no esta aun en el curso

	"github.com/michaelrodriguez/digitalhouse-backend-go/errors/mypackage"
)

// customizo un error
type MyCustomError struct {
	Message string
}

// customizo un error
func (m MyCustomError) Error() string {
	return fmt.Sprintf("MyCustomError: %s", m.Message)
}

func main() {
	var err error
	// Simulate an error
	err = errors.New("this is an error")
	fmt.Println("Error:", err)
	// Log the error
	log.Println("Log:", err)

	//err2 := fmt.Errorf("this is another error: %v", err)
	//fmt.Println("Error 2:", err2)
	//fmt.Println("Error 2:", err2.Error())

	//customizo un error
	//err3 := TestError()
	//fmt.Println("Custom Error:", err3)

	//este siempre se ejecuta cuando termina el scope del main, pero tiene que estar antes de cualquier panic u error que pueda ocurrir
	defer func() {
		fmt.Println("Defer: This will always run")
		//si se genero un error lo recupero con recover
		r := recover()
		if r != nil {
			fmt.Println("Recover in ", r)
		}
	}()
	/*
		v:=0
		_ = 5/v //forzo un error
	*/
	//panic("this is a panic") //forzo un panic, esto no se ejecuta

	//llamo a un paquete que tiene un panic
	mypackage.Run() //forzo un panic, esto no se ejecuta

	fmt.Println("Main: Esta es la ultima linea del main")

}

// customizo un error
func TestError() error {
	return MyCustomError{Message: "this is a custom error"}
}
