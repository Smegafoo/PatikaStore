import java.util.Scanner;

public class PatikaStore {
    MobilePhone mp1;
    Brands brands;
    public void EnteringStore(){
        FunctionalStore fs1=new FunctionalStore();
        Scanner in=new Scanner(System.in);
        int selectEnter;
        do{
        System.out.println("Patika ürün yönetim paneli!!\n1)Notebook İşlemleri" +
                "\n2)Cep Telefonu İşlemleri\n3)Marka İşlemleri\n0)Çıkış Yap");
        selectEnter= in.nextInt();
        while(selectEnter<0 || selectEnter>3){
            System.out.println("Yanlış bir sayı girdiniz lütfen geçerli bir sayı giriniz!!");
            System.out.println("Patika ürün yönetim paneli!!\n1)Notebook İşlemmleri" +
                    "\n2)Cep Telefonu İşlemleri\n3)Marka Listele\n0)Çıkış Yap");
            selectEnter=in.nextInt();

        }

            switch (selectEnter){
                case 1:
                    break;
                case 2:
                    MobilePhoneCenter();
                    break;
                case 3:
                    BrandCenter();
                    break;
                case 0:
                    break;
                default:
            }

        }while (selectEnter !=0);

    }
    public void BrandCenter(){
        Scanner in=new Scanner(System.in);
        FunctionalStore fs2=new FunctionalStore();
        int selectBrandCenter = 1;
        while (selectBrandCenter!=0){
            System.out.println("Ne yapmak istiyorsunuz:\n1)Markaları Listele\n2)Marka Ekle\n3)Marka Sil\n0)Çıkış");
            selectBrandCenter=in.nextInt();
            switch (selectBrandCenter){
                case 1:
                    fs2.getBrandName();
                    break;
                case 2:
                    fs2.addBrand();
                    break;
                case 3:
                    fs2.removeBrand();
                    break;
                case 0:
                    break;
            }
        }
    }

    public void MobilePhoneCenter(){
        Scanner in=new Scanner(System.in);
        FunctionalStore fs3=new FunctionalStore();
        int selectmpCenter=1;
        while(selectmpCenter!=0){
            System.out.println("Ne yapmak istiyorsunuz:\n1)Cep telefonlarını göster\n2)Cep telefonu ekle\n3)Cep telefonu sil\n0)Çıkış");
            selectmpCenter=in.nextInt();
            switch (selectmpCenter){
                case 1:
                    fs3.printMobilePhones();
                    break;
                case 2:
                    fs3.addMobilePhone();
                    break;
                case 3:
                    fs3.removeMobilePhone();
                    break;
                case 0:
                    break;
            }
        }

    }
}
