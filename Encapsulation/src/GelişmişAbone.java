
public class GelişmişAbone {
    private String isim;
    private  int bakiye = 120;
    private String şehir;
    
    public GelişmişAbone(String isim, int bakiye, String şehir) {
        this.isim = isim;
        
        if (bakiye >= 0 && bakiye <= 120) {
            this.bakiye = bakiye;
        }
        this.şehir = şehir;
    }
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
