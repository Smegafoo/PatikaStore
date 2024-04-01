import java.util.HashMap;
import java.util.Map.Entry;

public class Brands {
    private static HashMap<Integer, String> brands;
    public Brands() {
    }
    static{
        brands=new HashMap<>();
        brands.put(1,"Samsung");
        brands.put(2,"Apple");
        brands.put(3,"Huawei");
        brands.put(4,"Casper");
        brands.put(5,"Asus");
        brands.put(6,"HP");
        brands.put(7,"Xiaomi");
        brands.put(8,"Monster");
    }
    public static void getBrandName(){
        for(Entry<Integer,String> brands:brands.entrySet()){
            System.out.println("- "+brands.getValue());
        }

    }
}
