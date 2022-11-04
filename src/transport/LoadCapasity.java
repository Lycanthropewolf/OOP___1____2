package transport;

public enum LoadCapasity {
    N1(0,3.5),
    N2(3.5,12),
    N3(12,100);

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    LoadCapasity(double from, double to) {
        this.from = from;
        this.to = to;
    }

    private double from;
    private double to;


}

