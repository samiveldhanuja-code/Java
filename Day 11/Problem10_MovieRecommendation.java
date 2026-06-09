import java.util.*;
public class Problem10_MovieRecommendation{
public static void main(String[] args){
ArrayList<String> movies=new ArrayList<>();
movies.add("Avatar"); movies.add("Batman"); movies.add("Avengers");
Collections.sort(movies);
for(String m:movies) System.out.println(m);
}}