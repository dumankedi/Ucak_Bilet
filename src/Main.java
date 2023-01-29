import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int mesafe,yolculukTip,yas;
        double total,kmFiyat=0.1,yasIndirim,biletIndirim;
        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe=input.nextInt();
        System.out.print("Yaşınızı Giriniz: ");
        yas=input.nextInt();
        System.out.print("Yolculuk Tipini Giriniz (1=>Tek Yön, 2=> Gidiş Dönüş ): ");
        yolculukTip=input.nextInt();
        total=mesafe*kmFiyat;
        biletIndirim=(total*20)/100;
        if(mesafe>0&&yas>0&&yolculukTip==1||yolculukTip==2){
            if(yas<12){
                if (yolculukTip==2){
                    total-=((total*50)/100)+biletIndirim;
                    System.out.println("Toplam Tutar= "+total+" TL");
                }
                else{
                    total-=(total*50)/100;
                    System.out.println("Toplam Tutar= "+total+" TL");
                }

            } else if (yas>=12&&yas<24) {
                if (yolculukTip==2){
                    total-=((total*10)/100)+biletIndirim;
                    System.out.println("Toplam Tutar= "+total+" TL");
                }
                else{
                    total-=(total*10)/100;
                    System.out.println("Toplam Tutar= "+total+" TL");
                }
            } else if (yas>65) {
                if (yolculukTip==2){
                    total-=((total*30)/100)+biletIndirim;
                    System.out.println("Toplam Tutar= "+total+" TL");
                }
                else{
                    total-=(total*30)/100;
                    System.out.println("Toplam Tutar= "+total+" TL");
                }
            }
            else {
                if (yolculukTip==2){
                    total-=biletIndirim;
                    System.out.println("Toplam Tutar= "+total+" TL");
                }
                else{
                    System.out.println("Toplam Tutar= "+total+" TL");
                }
            }
        }
        else {
            System.out.println("HATA!!!!!!!");
        }
    }
}