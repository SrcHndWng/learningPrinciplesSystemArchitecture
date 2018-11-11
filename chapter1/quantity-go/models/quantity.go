package models

import "fmt"

const (
	min = 1
	max = 100
)

type Quantity struct {
	value int
}

func NewQuantity(value int) (*Quantity, error) {
	if value < min {
		return nil, fmt.Errorf("value is below %d", min)
	}
	if value > max {
		return nil, fmt.Errorf("value is above %d", max)
	}
	return &Quantity{value: value}, nil
}

func (q *Quantity) Add(other *Quantity) (*Quantity, error) {
	if !q.canAdd(other) {
		return nil, fmt.Errorf("added over %d", max)
	}
	added := q.addValue(other)
	return &Quantity{value: added}, nil
}

func (q *Quantity) Value() int {
	return q.value
}

func (q *Quantity) canAdd(other *Quantity) bool {
	added := q.addValue(other)
	return added <= max
}

func (q *Quantity) addValue(other *Quantity) int {
	return q.value + other.Value()
}
