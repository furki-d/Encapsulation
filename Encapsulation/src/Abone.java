//doğalgaz abonesi
public class Abone {
    public String isim;
    public int bakiye;
    public String şehir;
    
    public void doğalgaz_kullan(int miktar) {
        if (this.bakiye - miktar < 0) {
            System.out.println("Yeterli Bakiye Yok.");
        }
        else {
            this.bakiye -= miktar;
            
            if (this.bakiye <= 0) {
                System.out.println("Bakiyeniz bitmiştir, lütfen en yakın abone merkezine giderek kredi yükleyin"
                + "Kredi Limiti = 120 tl" 
                );
                
            }
            else {
                System.out.println("Yeni Bakiye = " + bakiye);
            }
        }
    }
    public void bakiye_öğren() {
        System.out.println("Bakiye = " + bakiye);
    } 
}
