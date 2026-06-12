import java.util.*;
public class Five {
    public static void main(String[] args) {
        List<String> history = new ArrayList<>();
        history.add("google.com");
        history.add("youtube.com");
        history.add("github.com");
        for(String site : history) System.out.println(site);
    }
}