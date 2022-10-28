package transport;

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
}
