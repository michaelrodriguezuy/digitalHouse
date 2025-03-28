package commerce

type Product struct {
	ID    uint     `json:"id"`
	Name  string   `json:"name"`
	Type  Type     `json:"type"`
	Count uint16   `json:"count"`
	Price float64  `json:"price"`
	Tags  []string `json:"tags"`
}

func (p Product) TotalPrice() float64 {
	return float64(p.Count) * p.Price //esto casteando el valor de count porque es un uint16, y lo convierto a float64
}

type Type struct {
	ID          uint   `json:"id"`
	Code        string `json:"code"`
	Description string `json:"description"`
}

type Car struct {
	ID       uint      `json:"id"`
	UserID   uint      `json:"user_id"`
	Products []Product `json:"products"`
}

func (c *Car) AddProduct(products ...Product) { //recibo un slice de productos
	c.Products = append(c.Products, products...) //agrego los productos al slice de productos
}

// este es para el total del carrito
func (c Car) Total() float64 { //no voy a modificar nada de la estrucutar original por eso no va el *
	var total float64
	for _, p := range c.Products {
		total += p.TotalPrice()
	}
	return total
}

func NewCar(userID uint) Car {
	return Car{UserID: userID}
}
