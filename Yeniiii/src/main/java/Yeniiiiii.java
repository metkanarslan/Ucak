import java.util.Scanner;

public class Yeniiiiii {
    public static void main(String[] args) {
        int mesafe,yas,tip;
        double ucretKm=0.10,tutar;
        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafe ne kadar(km cinsinden giriniz) :");
        mesafe = inp.nextInt();
        System.out.print("Yaşınızı Giriniz : ");
        yas = inp.nextInt();
        System.out.print("Yolculuk tipi:\n 1-Tek Yön\n 2-Gidiş-Dönüş\n Tercihiniz : ");
        tip = inp.nextInt();
        if (mesafe>0&&yas>0&&(tip==1||tip==2)){
            tutar=mesafe*ucretKm;
            System.out.println("Toplam Tutar : "+ tutar);
            if (yas<12){
                tutar=tutar/2;
                if(tip==2){
                    tutar = tutar-(tutar*0.2);
                }
                System.out.println("İndirimli Tutar : "+ tutar);
            }else if (yas>=12&&yas<=24){
                tutar = tutar-(tutar*0.1);
                if(tip==2){
                    tutar = tutar-(tutar*0.2);
                }
                System.out.println("İndirimli Tutar : "+ tutar);
            }else if (yas>65){
                tutar = tutar-(tutar*0.3);
                if(tip==2){
                    tutar = tutar-(tutar*0.2);
                }
                System.out.println("İndirimli Tutar : "+ tutar);
            }
        }else{
            System.out.println("Hatalı Giriş Yaptınız!!!");
        }
    }

}
