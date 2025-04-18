package main

import (
	"context"
	"fmt"
	"time"
)

func main() {
	ctx := context.Background() //esto nos permite crear un contexto vacio
	ctx = context.WithValue(ctx, "key", "Hola mundo!") //esto nos permite agregar un valor al contexto

	fmt.Println(ctx.Value("key")) //esto nos permite obtener el valor del contexto

	ctx2, cancel := context.WithTimeout(context.Background(), 5*time.Second) //esto nos permite crear un nuevo contexto con un timeout

	defer cancel() //esto nos permite cancelar el contexto cuando ya no lo necesitemos
	//fmt.Println("Context with timeout:", ctx2)
	
	select {
	case <-ctx.Done(): //esto nos permite esperar a que el contexto se cancele
		fmt.Println("Context cancelled:", ctx.Err())
	case <-ctx2.Done(): //esto nos permite esperar a que el contexto se cancele
		fmt.Println("Context with timeout cancelled:", ctx2.Err())
	}

}