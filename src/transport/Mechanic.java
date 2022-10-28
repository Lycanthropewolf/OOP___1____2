package transport;

public class Mechanic<T extends Transport> {
    private String name;
    private String surName;
    private String company;

    public Mechanic(String name, String surName, String company) {
        this.name = name;
        this.surName = surName;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return name+" , "+ surName+" , "+ company;
    }

    public boolean service(T t) {
      return   t.service();
    }
    public void repair(T t){
        t.repair();
    }


}
