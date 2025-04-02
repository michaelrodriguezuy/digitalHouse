package vehicles

import "fmt"

//debemos crear una entidad que representa a todas estas estructuras, para poder definir un metodo que sea implementado por todas ellas, como podria ser la entidad vehiculo

type Vehicle interface {
	Distance() float64
}

const (
	CarVehicle = "CAR"
	MotorcycleVehicle = "MOTORCYCLE"
	TruckVehicle = "TRUCK"
)

//funcion que recibe un tipo de vehiculo y un tiempo, y devuelve un vehiculo, auspiciaria como un factory method
func NewVehicle(vehicle string, time int) (Vehicle, error) {
	switch vehicle {
	case CarVehicle:
		return &Car{Time: time}, nil
	case MotorcycleVehicle:
		return &Motorcycle{Time: time}, nil
	case TruckVehicle:
		return &Truck{Time: time}, nil
	}
	return nil, fmt.Errorf("vehicle '%s' not found", vehicle)
}

//definimos las estructuras que representan a los vehiculos

type Car struct {
	Time int
}

func (c *Car) Distance() float64 {
	return 100 * (float64 (c.Time / 60))
}

type Motorcycle struct {
	Time int
}

func (c *Motorcycle) Distance() float64 {
	return 120 * (float64 (c.Time / 60))
}

type Truck struct {
	Time int
}

func (c *Truck) Distance() float64 {
	return 70 * (float64 (c.Time / 60))
}