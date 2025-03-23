package function

import (
	"fmt"
)

func Display(myValue int) {

	fmt.Printf("Type: %T, Value: %d, Address: %v\n", myValue, myValue, &myValue)
}

func Add (a, b int) int {
	return a + b
}

func RepeatString(increment int, value string)  {
	
	for i:= range  increment {
		fmt.Println(i, value)
	}
	
}
