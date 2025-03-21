package main

import (
	"fmt"
)

func main(){

	map1 := make(map[string]int)
	map1["key1"] = 1
	map1["key2"] = 2
	map1["key3"] = 3

	fmt.Println("map1: ", map1)

	map2 := map[int]string {
		1: "A",
		2: "B",
		3: "C",
	}

	fmt.Println("map2: ", map2)
	fmt.Println("map2[1]: ", map2[1])

	for k:= range map2 {
		fmt.Println("Key: ",k, " - value: ", map2[k])
	}
	
}