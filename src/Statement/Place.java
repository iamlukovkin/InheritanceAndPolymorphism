package Statement;

abstract public class Place {
    private final String name;
    private double square;

    public Place(String name) {
        this.name = name;
    }

    public double getSquare() {
        return this.square;
    }

    public String getName() {
        return name;
    }

    protected void setSquare(double area) {
        this.square = area;
    }

    abstract public String toString();
    abstract public int hexCode();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Place)) {
            return  false;
        }
        return this != obj;
    }
}
