import java.util.*;
class Product{String name;double price;Product(String n,double p){name=n;price=p;}}
public class Problem7_ProductInventory{
public static void main(String[] args){
ArrayList<Product> list=new ArrayList<>();
list.add(new Product("Mouse",500)); list.add(new Product("Keyboard",1000));
list.sort((a,b)->Double.compare(a.price,b.price));
for(Product p:list) System.out.println(p.name+" "+p.price);
}}