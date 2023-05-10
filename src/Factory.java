public class Factory {
    public static Arac getArac(String model, String renk, int motorHacmi) {
        Arac arac;
        if("araba".equalsIgnoreCase(model)) {
            arac = new Araba(model, renk, motorHacmi);
        } else if ("motor".equalsIgnoreCase(model)) {
            arac = new Motor(model, renk, motorHacmi);
        }else {
            throw  new RuntimeException("Geçerli bir model değildir.");
        }
        return arac;


    }
}
