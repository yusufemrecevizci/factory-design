public class Motor implements Arac {
    private String model;
    private String renk;
    private int motorHacmi;

    public Motor(String model, String renk, int motorHacmi) {
        this.model = model;
        this.renk = renk;
        this.motorHacmi = motorHacmi;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getRenk() {
        return renk;
    }

    @Override
    public int getMotorHacmi() {
        return motorHacmi;
    }


    @Override
    public String toString() {
        return "Motor{" +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motorHacmi=" + motorHacmi +
                '}';
    }
}
