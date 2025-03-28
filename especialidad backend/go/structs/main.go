package main

import (
	"encoding/json"
	"fmt"
	"github.com/michaelrodriguez/digitalhouse-backend-go/structs/commerce"
)

type User struct {
	ID        int    `json:"id"`
	FirstName string `json:"first_name"`
	LastName  string `json:"last_name,omitempty"`
	Age       uint8  `json:"age"`
}

func (u User) Display () {
	v, _ := json.Marshal(u) //Marshal convierte un objeto en un json, una cadena de bytes

	fmt.Println("desde el metodo: ",string(v)) //convierto la cadena de bytes en un string, y lo veo como un json
}

func (u *User) setName(name string) { //para que el metodo pueda modificar el objeto, se le pasa un asterisco, caso contrario modifica solamente la copia del objeto en memoria, en este caso u
	u.FirstName = name
}

func main() {
	user := User{
		ID:        112,
		FirstName: "John",
		//LastName:  "Doe",
		Age:       25,
	}

	fmt.Println(user)

	v, _ := json.Marshal(user) //Marshal convierte un objeto en un json, una cadena de bytes

	//fmt.Println(err)
	//fmt.Println(v)

	fmt.Println("Fuera del metodo: ",string(v)) //convierto la cadena de bytes en un string, y lo veo como un json
	user.Display()

	// user.setName("Pedro")

	p1 := commerce.Product{
				Name:  "Laptop",
				Price: 2000,
				Type: commerce.Type{
					Code:        "LT",
					Description: "Informatica",
				},
				Tags: []string{"laptop", "pc", "informatica"},
				Count: 2,
			}

	p2 := commerce.Product{
				Name:  "Linterna",
				Price: 50,
				Type: commerce.Type{
					Code:        "LN",
					Description: "Herramientas",
				},
				Tags: []string{"linterna", "iluminacion", "herramientas"},
				Count: 3,
			}

			car:= commerce.NewCar(1)
			car.AddProduct(p1, p2)
			fmt.Println("PRODUCTS CAR")
			fmt.Println("Total products: ", len(car.Products))
			fmt.Printf("Total CAR $%.2f\n", car.Total())

}
