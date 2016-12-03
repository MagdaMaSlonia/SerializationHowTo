import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationClass {

    public static void main(String[] args) {

        Employee emp = new Employee("Stefan", "Jakistam");

        try {
            FileOutputStream fileout = new FileOutputStream("./emplyee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileout);

            out.writeObject(emp);
            fileout.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
