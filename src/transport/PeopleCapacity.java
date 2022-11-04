package transport;

public enum PeopleCapacity {
    VERY_SMALL(0d,10d),
    SMALL(10d,25d),
    MIDDLE(40d,50d),
    BIG(60d,80d),
    VERY_BIG(100d,120d);

    public Double getFrom() {
        return from;
    }

    public Double getTo() {
        return to;
    }

    PeopleCapacity(Double from, Double to) {
        this.from = from;
        this.to = to;
    }

    private  Double from;
    private Double to;
}
