class Quantity{
    public final int value;
    private static final int MIN = 1;
    private static final int MAX = 100;
    
    public Quantity(int value){
        if(value < MIN){
            throw new IllegalArgumentException("value is below " + MIN);
        }
        if(value > MAX){
            throw new IllegalArgumentException("value is above " + MAX);
        }
        this.value = value;
    }

    public Quantity add(Quantity other){
        if(!canAdd(other)){
            throw new IllegalArgumentException("added over " + MAX);
        }
        int added = addValue(other);
        return new Quantity(added);
    }

    private boolean canAdd(Quantity other){
        int added = addValue(other);
        return added <= MAX;
    }

    private int addValue(Quantity other){
        return this.value + other.value;
    }

    public static void main(String[] args){
        final Quantity before = new Quantity(10);
        final Quantity toAdd = new Quantity(5);
        final Quantity result = before.add(toAdd);
        System.out.println("result value = " + result.value);
    }
}
