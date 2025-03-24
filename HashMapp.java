import java.util.HashMap;

public class HashMapp {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("London", "London");
        capitalCities.put("Paris", "Paris");
        capitalCities.put("New York", "New York");
        capitalCities.put("San Francisco", "San Francisco");
        System.out.println(capitalCities);

        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
    }
}