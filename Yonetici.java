
public class Yonetici extends Calisan{
    private String sorumlukisisayisi;

    public Yonetici(String ad, String soyad, int id,int sorumlukisisauisi) {
        super(ad, soyad, id);
        this.sorumlukisisayisi=sorumlukisisayisi;
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster(); 
        System.out.println("Sorumlu oldugu kisi sayisi"+sorumlukisisayisi);
//To change body of generated methods, choose Tools | Templates.
    }
    
    public void zamyap(int zammiktari){
        System.out.println(getAd()+"calisanlara "+zammiktari+" kadar zam yapiyor");
    
    
    }
    
        
}
