package collection;

import java.util.Arrays;
import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<>();
        autos.add("Toyota");
        autos.add("Volvo");
        autos.add("BMW");
        autos.add("Lada");
        for (String auto : autos) {
            System.out.println(auto);
        }
    }
}