package main

import (
	"fmt"	
	"github.com/michaelrodriguez/digitalhouse-backend-go/interface/vehicles"
)

func main() {
	/*
	Display("Hello World")
	Display(10)
	*/

	vArray := []string{"CAR", "MOTORCYCLE", "TRUCK", "BICYCLE", "SCOOTER", "TRUCK", "CAR"}

	var d float64
	for _, v := range vArray {
		fmt.Printf("Vehicle: %s\n", v)
		vehicle, err := vehicles.NewVehicle(v, 120) // 120 minutes
		if err != nil {
			fmt.Println(err)
			fmt.Println()
			continue
		}
		distance := vehicle.Distance()
		fmt.Printf("Distance: %.2f\n", distance)
		
		fmt.Println()
		d += distance
	}
	fmt.Println("Total distance: ", d)
}

func Display(value interface{}) {
	fmt.Println("Value: ", value)
}