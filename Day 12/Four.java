import java.util.*;
public class Four {
    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();
        cart.add("Laptop"); cart.add("Mouse"); cart.add("Keyboard");
        cart.set(1,"Wireless Mouse");
        cart.remove("Keyboard");
        System.out.println(cart);
    }
}