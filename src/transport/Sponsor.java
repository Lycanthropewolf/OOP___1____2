package transport;

import java.util.Objects;

public class Sponsor {
    private String name;
    private double amount;


    public Sponsor(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }


    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }
    public void toSponsorRace(){
        System.out.println(" Спонсор " + getName()+" проспонсировал зааедзд на сумму "+ amount+" рублей");
    }

    @Override
    public String toString() {
        return "Спонсор " + getName()+" Сумма пожертвования - " + getAmount()+" рублей.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sponsor)) return false;
        Sponsor sponsor = (Sponsor) o;
        return Double.compare(sponsor.amount, amount) == 0 && Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount);
    }
}
