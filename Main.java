
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Calisanlar programina hosgeldiniz");
        String islemler="Islemler\n"
                + "1.Yazilimci islemleri\n"
                + "2. yonetici islemleri\n"
                + "cikis icin Q ya basiniz";
        System.err.println("*************************");
        System.out.println(islemler);
        System.err.println("*************************");
        while(true){
            System.out.println("Islem secimi");
            String islem=scanner.nextLine();
         
            if(islem.equals("q")){
                System.out.println("Programdan cikiliyor");
                break;
            
            }
            else if(islem.equals("1")){
                Yazilimci yazilimci=new Yazilimci("Alisan ", "Celik", 605, "Java");;
                String yazlimciislem="1.Format atmak"
                        + "2.Bilgileri goster"
                        + "Cikma icin q ya basiniz";
                
                
                
                System.out.println(yazlimciislem);
                while(true){
                    System.out.println("Islem seciniz");
                    String y_islem=scanner.nextLine();
                    
                    if (y_islem.equals("q")){
                        System.out.println("Programdan cikiliyor");
                        break;
                }
                
                    else if (y_islem.equals("1")){
                        System.out.println("Isletim sistemi");
                        String isletimsistemi=scanner.nextLine();
                        yazilimci.formatat(isletimsistemi);
                    }
                    else if (y_islem.equals("2")){
                        yazilimci.bilgilerigoster();
                        
                }
                    else{
                        System.out.println("GEcersiz bir islem girmis blunmaktasiniz");
                    }}
            
            }
             else if(islem.equals("2")){
            Yonetici yonetici=new Yonetici("Serbay", "Karacak", 120,101);
            
            String yonetici_islem="Yonetici Islemleri\n"
                    + "1.zam yap\n"
                    + "2. Bilgileri goster\n"
                    + "q ya basiniz cikmak icin\n";
                System.out.println(yonetici_islem);
               
                while (true) {
                    System.out.println("ISlem seciniz");
                     String yon_islem=scanner.nextLine();
                    if(yon_islem.equals("q")){
                        System.out.println("ISlemden cikiliyor");
                        break;
                    }
                    else if (yon_islem.equals("1")){
                        System.out.println("Yoneticim ne kadar zam yapmak istoyorsunuz");
                        int zammiktari=scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamyap(zammiktari);
                    }
                    else if (yon_islem.equals("2")){
                    
                    
                    yonetici.bilgilerigoster();
                    
                    
                    }
                    else{
                        System.out.println("Gecersiz bir islem girmis bulunmaktasiniz");
                    
                    
                    
                    }

                    
                    
                }
            
            
            
            
            }
             else {
                 
              System.out.println("Hatali islem gerceklestirmis bulunmaktasinzi");
            
            }
        
        }

    }
}
