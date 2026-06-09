interface Sellable{ double getPrice(); }
class ECommerceProduct implements Sellable{
    private double productPrice;
    ECommerceProduct(double productPrice){ this.productPrice=productPrice; }
    public double getPrice(){ return productPrice; }
}
public class Problem14_ECommerceProduct{
    public static void main(String[] args){
        ECommerceProduct p=new ECommerceProduct(999.99);
        System.out.println("Price: "+p.getPrice());
    }
}