package function

import (
	"errors"
	"fmt"
)

type Operation int //defino un tipo para ser usado como constante, que representa un tipo de operacion, ya sea suma, resta.. multiplicacion...

const (
	SUM Operation = iota
	SUB
	MUL
	DIV
	TEST
)

func Display(myValue int) {

	fmt.Printf("Type: %T, Value: %d, Address: %v\n", myValue, myValue, &myValue)
}

func Add(a, b int) int {
	return a + b
}

func RepeatString(increment int, value string) {

	for i := range increment {
		fmt.Println(i, value)
	}
}

func Calc(op Operation, x, y float64) (float64, error) {
	switch op {
	case SUM:
		return x + y, nil
	case SUB:
		return x - y, nil
	case MUL:
		return x * y, nil
	case DIV:
		if y != 0 {
			return x / y, nil
		}
		return 0, errors.New("division by zero")
	}

	return 0, errors.New("invalid operation")

}

func Split(v int) (x, y int) {
	x = v * 4 / 10 //multiplico el valor por 4 y luego divido por 10
	y = v % 10     //obtengo el resto de la division por 10
	return
}

func MSum(values ...float64) float64 {
	var sum float64
	for _, v := range values {
		sum += v
	}
	return sum
}

func MOperation(op Operation, values ...float64) (float64, error) {
	if len(values) == 0 { //si no hay valores, retorno 0 y un error
		return 0, errors.New("no values")
	}
	sum := values[0] //el primer valor es el valor inicial

	for _, v := range values[1:] { //recorro los valores desde el segundo al final

		switch op {
		case SUM:
			 sum += v
		case SUB:
			 sum -= v
		case MUL:
			 sum *= v
		case DIV:
			if v != 0 {
				sum /= v
			} 
			return 0, errors.New("division by zero")			
		}
	}
	return sum, nil
}



