package main

import (
	"fmt"
	"time"
)

func main() {
	//de esta forma primero se ejecuta el proceso A y luego el B
	//myProcess("A")
	//myProcess("B")

	//de esta forma se ejecutan los dos procesos al mismo tiempo
	//y para poder visualizar en consola le pongo un sleep
	go myProcess("A")
	go myProcess("B")

	time.Sleep(3 * time.Second) //esto es para que el main no termine antes de que terminen los goroutines, cuando este tiempo termine el main se cierra
	//si no le pongo el sleep el main se cierra antes de que terminen los goroutines
}

func myProcess(p string) {
	// Simulate some processing
	for i := 0; i < 10; i++ {
		i++
		time.Sleep(150 * time.Millisecond) // le forzo un delay
		fmt.Printf("Processing: %s - num: %d\n", p, i)
	}
}
