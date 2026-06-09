interface FoodOrder{ void processOrder(); }
class Pizza implements FoodOrder{ public void processOrder(){ System.out.println("Pizza ordered"); } }
class Burger implements FoodOrder{ public void processOrder(){ System.out.println("Burger ordered"); } }
class Beverage implements FoodOrder{ public void processOrder(){ System.out.println("Beverage ordered"); } }
public class Problem6_FoodOrdering{
    public static void main(String[] args){
        FoodOrder[] orders={new Pizza(),new Burger(),new Beverage()};
        for(FoodOrder o:orders) o.processOrder();
    }
}