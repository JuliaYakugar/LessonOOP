package Less_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VendingMachine {
    
    private List<Product> prod_list;

    public VendingMachine(List<Product> prod_list) {
        this.prod_list = prod_list;
    }

    public VendingMachine() {
        this(new ArrayList<Product>(Arrays.asList(new Product("rock", 1))));
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        prod_list.forEach(i -> result.append(i.toString() + "\n"));
        return result.toString();
    }

    public List<Product> findByName (String name) {
        List<Product> result = new ArrayList<>();
        prod_list.forEach(i -> {
            if (i.getName().equals(name))
                result.add(i);
        });
        return result;
    }

    public List<Product> findPrice (double p1, double p2) {
        List<Product> result = new ArrayList<>();
        prod_list.forEach(i -> {
            if (i.getPrice() <=  p2 && i.getPrice() >= p1)
                result.add(i);
        });
        return result;
    }
}
