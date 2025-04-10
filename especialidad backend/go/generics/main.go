package main

import (
	"fmt"

)

func main() {
	// Example usage of the generic function
	ints := []int{1, 2, 3, 4, 5}
	strings := []string{"a", "b", "c"}
	v2 := []float64{1.1, 2.2, 3.3}

	fmt.Println("Sum of ints:", Sum(ints))
	fmt.Println("Sum of strings:", Sum(strings))
	fmt.Println("Sum of float64s:", Sum(v2))

	// Example usage of the generic function with two different types
	anyTypeTwo(1, "hello")
	anyTypeTwo(1.5, "4")
}

func Sum[T int | int32 | int64 | float64 | string](v []T) T {
	var total T
	for _, tV := range v {
		total += tV
	}
	return total
}

func anyTypeTwo[T1 any, T2 any](v1 T1, v2 T2)  {
	fmt.Println("v1:", v1, "v2:", v2)	
	fmt.Printf("Type of v1: %T, v2: %T\n", v1, v2)
		
}

