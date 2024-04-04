import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FunctionalStore {

    //Brands İşlemleri-------------------------------------------------------------------------------------

    static ArrayList<Brands> BrandList;
    static{
        BrandList=new ArrayList<>();
        BrandList.add(new Brands(1,"Samsung"));
        BrandList.add(new Brands(2,"Lenovo"));
        BrandList.add(new Brands(3,"Apple"));
        BrandList.add(new Brands(4,"Huawei"));
        BrandList.add(new Brands(5,"Casper"));
        BrandList.add(new Brands(6,"Asus"));
        BrandList.add(new Brands(7,"HP"));
        BrandList.add(new Brands(8,"Xiaomi"));
        BrandList.add(new Brands(9,"Monster"));
        Collections.sort(BrandList);
    }
    public static void getBrandName(){
        for(Brands b1:BrandList){
            System.out.println("-"+b1.getName());
        }
    }
    public static void addBrand(){
        Scanner in=new Scanner(System.in);
        System.out.println("Marka ID sini giriniz");
        int addBrandID=in.nextInt();
        in.nextLine();
        System.out.println("Marka adını giriniz");
        String addBrandName=in.nextLine();
        BrandList.add(new Brands(addBrandID,addBrandName));
        Collections.sort(BrandList);
    }
    public static void removeBrand(){
        Scanner in=new Scanner(System.in);
        System.out.println("Silmek istediğiniz markanın ismini yazın:");
        String removeBrand=in.nextLine();
        boolean found = false;
        for(int i=0;i<BrandList.size();i++){
            if(BrandList.get(i).getName().equals(removeBrand)){
                BrandList.remove(BrandList.get(i));
                found=true;
                System.out.println("İşlem başarı ile gerçekleştirildi");
            }
        }
        if(!found){
            System.out.println("Sistemde olmayan bir sayı girdiniz lütfen tekrar deneyiniz!!");
        }
        Collections.sort(BrandList);
    }



//Mobile Phone işlemleri-----------------------------------------------------------------------------

    static ArrayList<MobilePhone>mpList;
    static{
        mpList=new ArrayList<>();
        mpList.add(new MobilePhone(1,4000,40,5000,"Galaxy A51     ","Samsung",128,6.1,8,4000,"Sarı    "));
        mpList.add(new MobilePhone(2,3500,30,10000,"Redmi Note 12 ","Xiaomi",256,6.3,6,3500,"Beyaz   "));
        mpList.add(new MobilePhone(3,4500,25,3000,"Iphone 15     ","Apple",128,5.4,8,4000,"Siyah   "));
        mpList.add(new MobilePhone(4,2500,50,1000,"Via 5         ","Casper",64,6.2,4,3000,"Lacivert"));
        mpList.add(new MobilePhone(5,3500,20,15000,"Mate 52       ","Huawei",128,5.8,8,3500,"Gri     "));
        Collections.sort(mpList);
    }
    public void printMobilePhones(){
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID  |  Name\t\t\t\t|  Marka\t|  Fiyat \t  |  Depolama\t|  Ekran\t|  Pil\t\t|  Ram\t  |  Renk\t   |");
        System.out.println("|------------------------------------------------------------------------------------------------------------------|");
        for(MobilePhone mp:mpList){
            System.out.printf("| %-4d|  %-19s|  %-9s|  %-11d|  %-11d|  %-9.1f|  %-9d|  %-7d|  %-10s|\n",
                    mp.getProductID(), mp.getProductName(), mp.getBrandsName(), mp.getProductPrice(),
                    mp.getProductStorage(), mp.getProductSize(), mp.getPhoneSupplyPower(), mp.getRam(),
                    mp.getPhoneColor());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
    }
    public void addMobilePhone(){
        Scanner in=new Scanner(System.in);
        System.out.println("Telefonun ID sini giriniz:");
        int mpID=in.nextInt();
        in.nextLine();
        System.out.println("Girmek istediğiniz telefonun adını giriniz:");
        String mpName=in.nextLine();

        String mpBrandName = null;
        boolean found2 = false;
        do{
            System.out.println("Bir marka giriniz:");
            mpBrandName=in.nextLine();
            for(int i=0;i<BrandList.size();i++){
                if(BrandList.get(i).getName().equals(mpBrandName)){
                    System.out.println("işlem başarı ile gerçekleştirilmiştir");
                    found2=true;
                }
            }
            if(!found2){
                System.out.println("Sistemde olmayan bir marka girdiniz !!");
                System.out.println("Sistemdeki markalar aşşağıda ki gibidir!!");
                for(Brands bl:BrandList){
                    System.out.println("-"+bl.getName());
                }
            }
        }while(!found2);

        int mpPrice;
        do{
            System.out.println("Telefonun fiyatını giriniz:");
            mpPrice=in.nextInt();
            if(mpPrice<0){
                System.out.println("Telefonun fiyatı 0 dan küçük bir değer alamaz !!");

            }
        }while (mpPrice<0);


        int selectMPStorage;
        int mpStorage=0;
        do{
            System.out.println("Telefonun hafızasını giriniz:\n1)64GB,\n2)128GB,\n3)256GB");
            selectMPStorage=in.nextInt();

            if(selectMPStorage<1 || selectMPStorage>3){
                System.out.println("Yanlış bir sayı girdiniz lütfen tekrar deneyiniz!!");
            }
            switch (selectMPStorage){
                case 1:
                    mpStorage=64;
                    break;
                case 2:
                    mpStorage=128;
                    break;
                case 3:
                    mpStorage=256;
                    break;
            }
        }while(selectMPStorage<1 || selectMPStorage>3);

        System.out.println("Telefonun ekran büyüklüğünü giriniz(Virgül kullanınız!!):");
        double mpSize=in.nextDouble();
        int selectMPRam;
        int mpRam=0;
        do{
            System.out.println("Telefonun Ramini seçiniz:\n1)4GB\n2)6GB\n3)8GB\n4)Kendim Gireceğim(Sizden veri girişi beklenir)");
            selectMPRam=in.nextInt();

            switch (selectMPRam){
                case 1:
                    mpRam=4;
                    break;
                case 2:
                    mpRam=6;
                    break;
                case 3:
                    mpRam=8;
                    break;
                case 4:
                    do{System.out.println("Telefonun Ramini giriniz");
                        mpRam=in.nextInt();
                        if(mpRam<0){
                            System.out.println("Telefonun Rami 0 dan küçük bir değer alamaz !!");
                        }
                    }while(mpRam<0);

            }
        }while(selectMPRam<1 || selectMPRam>4);

        int mpBattery;
        do{
            System.out.println("Telefonun Pil gücünü giriniz");
            mpBattery=in.nextInt();
            in.nextLine();
            if(mpBattery<0){
                System.out.println("Pil gücü 0 dan küçük bir değer alamaz !!");
            }
        }while(mpBattery<0);

        System.out.println("Telefonun rengini giriniz:");
        String mpColor=in.nextLine();

        int mpDiscount;
        do{
            System.out.println("Telefonda uygulanacak indirim oranını giriniz");
            mpDiscount=in.nextInt();
            if(mpDiscount<0 || mpDiscount>100){
                System.out.println("İndirim oranı 0 ila 100 arasında olmalıdır");
            }
        }while(mpDiscount<0 || mpDiscount>100);
        int mpStock;
        do{
            System.out.println("Telefonu stok miktarını giriniz");
            mpStock=in.nextInt();
            if(mpStock<0){
                System.out.println("Ürünün stoğu 0 dan küçük bir değer alamaz !!");
            }

        }while(mpStock<0);



        mpList.add(new MobilePhone(mpID,mpPrice,mpDiscount,mpStock,mpName,mpBrandName,mpStorage,mpSize,mpRam,mpBattery,mpColor));
        Collections.sort(mpList);
    }

    public void removeMobilePhone(){
        Scanner in=new Scanner(System.in);
        System.out.println("Silmek istediğiniz telefonun ID sini giriniz");
        int removeMP=in.nextInt();
        boolean found = false;
        for(int i=0;i<mpList.size();i++){
            if(mpList.get(i).getProductID()==removeMP){
                mpList.remove(mpList.get(i));
                found =true;
                System.out.println("İşlem başarı ile gerçekleştirildi");
            }
        }
        if(found!=true){
            System.out.println("Girdiğiniz ID de bir telefon numarası yok");
            Collections.sort(mpList);
        }

    }




    //NoteBook işlemleri-------------------------------------------------------------

    static ArrayList<NoteBook> nbList;
    static{
        nbList=new ArrayList<>();
        nbList.add(new NoteBook(1,4000,40,5000,"Matebook 14","Huawei",512,14.2,16));
        nbList.add(new NoteBook(2,4500,30,4000,"V14 IGL","Lenovo",256,15.4,8));
        nbList.add(new NoteBook(3,3500,25,4000,"Tuf Gaming","Asus",512,17.3,32));
    }

    public void printNoteBooks(){
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("| ID  |  Name\t\t\t\t|  Marka\t|  Fiyat \t  |  Depolama\t|  Ekran\t|  Ram\t  |");
        System.out.println("|-----------------------------------------------------------------------------------------|");
        for(NoteBook nb1: nbList){
            System.out.printf("| %-4d|  %-19s|  %-9s|  %-11d|  %-11d|  %-9.1f|  %-7d|  \n",
                    nb1.getProductID(), nb1.getProductName(),nb1.getBrandsName(), nb1.getProductPrice(), nb1.getProductStorage(), nb1.getProductSize()
                    , nb1.getRam());

        }
        System.out.println("-------------------------------------------------------------------------------------------");

    }

    public void addNoteBook(){
        Scanner in=new Scanner(System.in);
        System.out.println("Notebookun ID sini giriniz");
        int nbID=in.nextInt();
        in.nextLine();
        System.out.println("Notebookun adını giriniz");
        String nbName=in.nextLine();

        String nbBrandName = null;
        boolean found2 = false;
        do{
            System.out.println("Bir marka giriniz:");
            nbBrandName=in.nextLine();
            System.out.println(nbBrandName);
            for(int i=0;i<BrandList.size();i++){
                if(BrandList.get(i).getName().equals(nbBrandName)){
                    System.out.println("işlem başarı ile gerçekleştirilmiştir");
                    found2=true;
                }
            }
            if(!found2){
                System.out.println("Sistemde olmayan bir marka girdiniz !!");
                System.out.println("Sistemdeki markalar aşşağıda ki gibidir!!");
                for(Brands bl:BrandList){
                    System.out.println("-"+bl.getName());
                }
            }
        }while(!found2);


        int nbPrice=0;
        do{
            System.out.println("Notebookun fiyatını giriniz:");
            nbPrice=in.nextInt();
            if(nbPrice<0){
                System.out.println("Fiyat sıfırın altında olamaz!!");
            }
        }while(nbPrice<0);

        System.out.println("Notebookun depolama alanını giriniz:\n1)128\n2)256\n3)512\n4)Kendim Gireceğim(Sizden veri girişi beklenir)");
        int selectnbStorage= in.nextInt();
        int nbStorage=0;
        switch (selectnbStorage){
            case 1:
                nbStorage=128;
                break;
            case 2:
                nbStorage=256;
                break;
            case 3:
                nbStorage=512;
                break;
            case 4:
                do{
                    System.out.println("Notebookun depolama alanını giriniz:");
                    nbStorage=in.nextInt();
                    if(nbStorage<0){
                        System.out.println("Depolama alanı sıfırdan küçük bir değer alamaz!!");
                    }

                }while(nbStorage<0);
                break;

        }

        System.out.println("Ekran boyutunu giriniz (Virgül kullanınız)");
        double nbSize=in.nextDouble();
        int nbRam=0;
        int selectnbRam;
        do{
            System.out.println("Notebookun ramini seçiniz:\n1)8\n2)16\n3)32\n4)Kendim gireceğim(Sizden veri girişi istenir)");
            selectnbRam=in.nextInt();
            switch (selectnbRam){
                case 1:
                    nbRam=8;
                    break;
                case 2:
                    nbRam=16;
                    break;
                case 3:
                    nbRam=32;
                    break;
                case 4:
                    do{
                        System.out.println("Notebookun Ramini giriniz:");
                        nbRam= in.nextInt();
                        if(nbRam<0){
                            System.out.println("Notebookun rami o dan küçük bir değer alamaz!!");
                        }

                    }while(nbRam<0);

            }
        }while(selectnbRam<1 || selectnbRam>4);

        int nbDiscountRate;
        do{
            System.out.println("Notebookun indirim oranını seçiniz:");
            nbDiscountRate=in.nextInt();
            if(nbDiscountRate<0 || nbDiscountRate>100){
                System.out.println("İndirim oranı 0 ila 100 arası bir değer almalıdır!!");
            }
        }while(nbDiscountRate<0 || nbDiscountRate>100);

        int nbStock;
        do {
            System.out.println("Stok miktarını giriniz:");
            nbStock=in.nextInt();
            if(nbStock<0){
                System.out.println("Stok miktarı sıfırdan küçük olamaz!!");
            }

        }while(nbStock<0);

        nbList.add(new NoteBook(nbID,nbPrice,nbDiscountRate,nbStock,nbName,nbBrandName,nbStorage,nbSize,nbRam));
    }


    public void removeNotebook(){
        Scanner in=new Scanner(System.in);
        int nbremovedID=0;
        boolean found=false;
        do{
            System.out.println("Silmek istediğiniz notebookun ID sini giriniz:");
            nbremovedID=in.nextInt();
            for (int i=0; i<nbList.size();i++){
                if(nbList.get(i).getProductID()==nbremovedID){
                    nbList.remove(i);
                    System.out.println("İşlem başarı ile gerçekleştirilmiştir!!");
                    found=true;
                }
            }
            if(found !=true){
                System.out.println("Girdiğiniz ID sistemde bulunmamaktadır!!");
            }

        }while(!found);
    }

}
