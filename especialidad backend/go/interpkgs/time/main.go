package main

import (
	"fmt"
	"time"
)

func main() {

	p := fmt.Println

	now := time.Now()
	p("Current Time in UTC: ", now.UTC())
	p("Current Time in Local: ", now.Local())

	DateCustom := time.Date(1983, 8, 30, 14, 34, 0, 0, time.UTC)
	p("Time: ", DateCustom)
	p("Year: ", DateCustom.Year())
	p("Suma de dias: ", DateCustom.AddDate(0, 0, 10))
	p("Suma de horas: ", DateCustom.Add(10*time.Hour))
	p("Suma de meses: ", DateCustom.AddDate(0, 10, 0))

	p("DateCustom es anterior que now: ", DateCustom.Before(now))
	p("DateCustom es posterior que now: ", DateCustom.After(now))
	p("DateCustom es igual que now: ", DateCustom.Equal(now))
	p("DateCustom es el mismo dia que now: ", DateCustom.YearDay() == now.YearDay())

	dif := now.Sub(DateCustom)
	p("Diferencia entre DateCustom y now: ", dif)
	p("Diferencia en horas: ", dif.Hours())
	p("Diferencia en dias: ", dif.Hours()/24)
	p("Diferencia en meses: ", dif.Hours()/24/30)
	p("Diferencia en años: ", dif.Hours()/24/365)

	//al estilo, "tengo 41 años, 2 meses, 3 dias y 4 horas", pero todo en la misma linea
	p("Diferencia exacta de tiempo de mi nacimiento 30/08/1983: ", int(dif.Hours()/24/365), " años, ", int(dif.Hours()/24/30)-int(dif.Hours()/24/365)*12, " meses, ", int(dif.Hours()/24)-int(dif.Hours()/24/30)*30, " dias y ", int(dif.Hours())%24, " horas")

	//Diferencia exacta de tiempo de mi nacimiento 30/08/1983:  41  años,  14  meses,  13  dias y  4  horas - ESTO ME MUESTRA LA TERMINAL, PERO NO PUEDE SER QUE TENGA 14 MESES, NO?
	//que esta mal en la operacion

}
