class FoodItem{
    protected String name;
    FoodItem(String name){ this.name=name; }
    void bill(){ System.out.println("Food Item"); }
}
class Pizza extends FoodItem{
    Pizza(){ super("Pizza"); }
    void bill(){ System.out.println(name+" Bill = 250"); }
}
class Burger extends FoodItem{
    Burger(){ super("Burger"); }
    void bill(){ System.out.println(name+" Bill = 150"); }
}
class Dessert extends FoodItem{
    Dessert(){ super("Dessert"); }
    void bill(){ System.out.println(name+" Bill = 100"); }
}
public class Problem2_FoodDelivery{
    public static void main(String[] args){
        FoodItem[] f={new Pizza(),new Burger(),new Dessert()};
        for(FoodItem x:f) x.bill();
    }
}