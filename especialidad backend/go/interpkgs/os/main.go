package main

import (
	"fmt"
	"os"
)

func main() {
	file, err := os.Open("test.txt")
	if err != nil {
		fmt.Println("Error opening file:", err)
		os.Exit(1) //finaliza la ejecucion
	}

	fmt.Println("File opened successfully:", file.Name())

	fmt.Println(file)

	v, _ := file.Stat() //retorno un valor y el error, que no me interesa
	fmt.Println("File name:", v.Name())
	fmt.Println("File size:", v.Size())
	fmt.Println("File mode:", v.Mode())
	fmt.Println("File modification time:", v.ModTime())
	fmt.Println("File is directory:", v.IsDir()) // si es un directorio
	fmt.Println("File system:", v.Sys())         // sistema de archivos

	data := make([]byte, 32)
	n, err := file.Read(data) // en n almaceno la cantidad de bytes leidos

	if err != nil {
		fmt.Println("Error opening file:", err)
		os.Exit(1) //finaliza la ejecucion
	}

	fmt.Println("Data read:", data)
	fmt.Println("Bytes read:", n)
	fmt.Println("Data read as string:", string(data[:n])) //imprimo los bytes leidos como string

	// quiero mostrar en byte cierta parte de la cadena

	fmt.Println("Data read as string:", string(data[22:29])) //imprimo los bytes leidos como string
	fmt.Println("Data read as string:", data[22:29])         //imprimo los bytes leidos

	fmt.Println("USER:", os.Getenv("USER")) //imprimo el usuario de la variable de entorno usuario

	dir, _ := os.Getwd() //obtengo el directorio de trabajo actual
	fmt.Println("Current working directory:", dir) //imprimo el directorio de trabajo actual
}
