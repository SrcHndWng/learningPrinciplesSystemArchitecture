package main

import (
	"log"

	"./models"
)

func main() {
	before, err := models.NewQuantity(10)
	if err != nil {
		log.Fatal(err)
	}
	toAdd, err := models.NewQuantity(5)
	if err != nil {
		log.Fatal(err)
	}
	result, err := before.Add(toAdd)
	if err != nil {
		log.Fatal(err)
	}
	log.Printf("result value = %d\n", result.Value())
}
