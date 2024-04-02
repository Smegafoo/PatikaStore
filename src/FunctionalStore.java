import java.util.*;

public class FunctionalStore {

    Scanner in=new Scanner(System.in);
    public TreeSet<NoteBook> noteBook=new TreeSet<>(new Comparator<NoteBook>() {
        @Override
        public int compare(NoteBook o1, NoteBook o2) {
            return o1.getProductID()-o2.getProductID();
        }
    });
    public TreeSet<MobilePhone> mobilePhone=new TreeSet<>(new Comparator<MobilePhone>() {
        @Override
        public int compare(MobilePhone o1, MobilePhone o2) {
            return o1.getProductID()-o2.getProductID();
        }
    });
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
        System.out.println("Silmek istediğiniz markanın ismini söyleyin:");
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

    }






    public ArrayList<MobilePhone> mpList(){
        ArrayList<MobilePhone> phones = new ArrayList<>();
        phones.add(new MobilePhone(01,4000,40,5000,"Galaxy A51","Samsung",128,6.1,8,4000,"Sarı"));
        phones.add(new MobilePhone(02,3500,30,10000,"Redmi Note 12","Xiaomi",256,6.3,6,3500,"Beyaz"));
        phones.add(new MobilePhone(03,4500,25,3000,"Iphone 15","Apple",128,5.4,8,4000,"Siyah"));
        phones.add(new MobilePhone(04,2500,50,1000,"Via 5","Casper",64,6.2,4,3000,"Lacivert"));
        phones.add(new MobilePhone(05,3500,20,15000,"Mate 52","Huawei",128,5.8,8,3500,"Gri"));
        return phones;
    }
    public void printMobilePhones(ArrayList<MobilePhone> m1){
        for(MobilePhone mp1:m1){
            System.out.println(mp1.getProductName()+mp1.getBrandsName()+mp1.getProductPrice());
        }
    }
    public void ProductList(){
        System.out.println("Hangi ürünleri listelemek istiyorusunuz!!\n1)Telefonlar\n2)Notebooklar");
        int selectProduct=in.nextInt();
        switch (selectProduct){
            case 1:
                printMobilePhones(mpList());
                break;
            case 2:
                break;
        }
    }

}
