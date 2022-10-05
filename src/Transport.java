public class Transport {
    String brend;
    String model;
    int productionYear;
    String assemblyСountry;
    String bodyColor;
    double maxSpeed;

    public String getBrend() {
        return brend;
    }


    public String getModel() {
        return model;
    }


    public int getProductionYear() {
        return productionYear;
    }


    public String getAssemblyСountry() {
        return assemblyСountry;
    }


    public String getBodyColor() {
        return bodyColor;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor == null || bodyColor.isEmpty() || bodyColor.isBlank()) {
            bodyColor = " данные записаны некорректно";
        } else {
            this.bodyColor = bodyColor;
        }
    }


    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed <= 0) {
            maxSpeed = 100;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }


}
