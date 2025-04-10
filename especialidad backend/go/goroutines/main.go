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

	myFirstChannel := make(chan string)

	go myProceessWithChannel("C", myFirstChannel) //al ser un goroutine no se espera a que termine los procesos anteriores, sino que se ejecuta en paralelo

	//de esta forma se ejecuta el proceso C y se le pasa un canal para que me retorne el resultado, este se queda esperando a que se le asigne un valor al canal, como pasa en la linea 47
	result := <-myFirstChannel
	fmt.Println("Result from channel 'myFirstChannel': ", result)
	
	close(myFirstChannel)	


	channelA := make(chan string)
	channelB := make(chan string)

	go myProceessWithChannel("D", channelA)
	go myOtherProceessWithChannel("E", channelB)

	resultA := <-channelA
	fmt.Println("Result from channel 'channel A': ", resultA)

	resultB := <-channelB
	fmt.Println("Result from channel 'channel B': ", resultB)

	close(channelA)
	close(channelB)
}

func myProcess(p string) {
	// Simulate some processing
	for i := 0; i < 10; i++ {
		i++
		time.Sleep(150 * time.Millisecond) // le forzo un delay
		fmt.Printf("Processing: %s - num: %d\n", p, i)
	}
}

func myProceessWithChannel(p string, c chan string) {
	// Simulate some processing
	for i := 0; i < 20; i++ {
		i++
		time.Sleep(150 * time.Millisecond) // le forzo un delay
		fmt.Printf("Processing channel 1: %s - num: %d\n", p, i)
	}
	c <- "ok!"
	

}
func myOtherProceessWithChannel(p string, c chan string) {
	// Simulate some processing
	for i := 0; i < 5; i++ {
		i++
		time.Sleep(150 * time.Millisecond) // le forzo un delay
		fmt.Printf("Processing channel 2: %s - num: %d\n", p, i)
	}
	c <- "ok!"
	

}