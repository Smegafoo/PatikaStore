import java.util.Scanner;

public class PatikaStore {
    Brands brands;
    public void EnteringStore(){
        Brands b1=new Brands();
        Scanner in=new Scanner(System.in);
        int selectEnter;
        do{
        System.out.println("Patika ürün yönetim paneli!!\n1)Notebook İşlmemleri" +
                "\n2)Cep Telefonu İşlemleri\n3)Marka Listele\n0)Çıkış Yap");
        selectEnter= in.nextInt();
        while(selectEnter<0 || selectEnter>3){
            System.out.println("Yanlış bir sayı girdiniz lütfen geçerli bir sayı giriniz!!");
            System.out.println("Patika ürün yönetim paneli!!\n1)Notebook İşlmemleri" +
                    "\n2)Cep Telefonu İşlemleri\n3)Marka Listele\n0)Çıkış Yap");
            selectEnter=in.nextInt();

        }

            switch (selectEnter){
                case 1:
                    break;
                case 2:
                    System.out.println("Cep Telefonu");
                    break;
                case 3:
                    int case3Exit;
                        b1.getBrandName();
                        System.out.println("Çıkış yapmak için herhangi bir sayı giriniz");
                        case3Exit=in.nextInt();
                    break;
                case 0:
                    break;
                default:
            }

        }while (selectEnter !=0);

    }
}
