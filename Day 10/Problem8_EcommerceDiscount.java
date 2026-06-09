class Product{
    double discount(){ return 0; }
}
class Electronics extends Product{
    double discount(){ return 10; }
}
class Clothing extends Product{
    double discount(){ return 20; }
}
class Grocery extends Product{
    double discount(){ return 5; }
}
public class Problem8_EcommerceDiscount{
    public static void main(String[] args){
        Product[] p={new Electronics(),new Clothing(),new Grocery()};
        for(Product x:p) System.out.println("Discount: "+x.discount()+"%");
    }
}