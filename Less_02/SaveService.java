package Less_02;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveService {
    public void save(List<Animal> animals) {
        try {FileWriter writer = new FileWriter("list.txt", false);
            for (Animal item : animals) {
                writer.write(item.toString() + "\n");
            }
            writer.flush();   
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
          
}
