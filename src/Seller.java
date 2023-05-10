public class Seller {

    public static void main(String[] args){
        Arac araba = Factory.getArac("araba", "kırmızı", 1600);

        Arac ahmetDemir = Factory.getArac("motor", "siyah", 1000);

        System.out.println("Arabanın özellikleri: ");
        System.out.println(araba);
        System.out.println("Motorun özellikleri");
        System.out.println(ahmetDemir);
    }
}
