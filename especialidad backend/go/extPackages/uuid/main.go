package main

import (
	"fmt"
	"github.com/google/uuid"
)

func main() {
	uid1 := uuid.New() //me devuelve un objeto del tipo UUID
	// uid1 := uuid.New().String //me devuelve un string del objeto
	// uid1 := uuid.NewString() //me devuelve un string del objeto

	fmt.Println("UUID 1:", uid1)
}