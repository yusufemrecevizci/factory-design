public class Araba implements Arac {
    private String model;
    private String renk;
    private int motorHacmi;

    public Araba( String model, String renk, int motorHacmi) {
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
        return "Araba{" +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motorHacmi=" + motorHacmi +
                '}';
    }
}
