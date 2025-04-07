package main

import (
	"fmt"
	"log"
	"os"
	"time"
)

func main() {
	// log.Println("Hello, World!")

	// log.Fatal("Fatal error occurred")
	// log.Panic("Panic error occurred")

	date := time.Now()
	file, err := os.Create(fmt.Sprintf("%d.log", date.UnixNano()))
	if err != nil {
		log.Panic(err.Error())
	}

	v := true

	//con esto puedo crear mi propio logger
	mylog := log.New(file, "success: ", log.LstdFlags|log.Lshortfile)
	mylog.Println("Hello, World!")
	mylog.Println("Hello, World2!")
	mylog.Println("Hello, World3!")
	mylog.Println("Hello, World4!")

	if v {
		mylog.Println("Hello, World5!")
	}
	
	mylog.SetPrefix("errors: ")	
	mylog.Println("Hello, World!")
	mylog.Println("Hello, World2!")
	mylog.Println("Hello, World3!")
	mylog.Println("Hello, World4!")
}
