import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationClass {

    public static void main(String[] args) {

        Employee emp = null;

        try {
            FileInputStream inputFile = new FileInputStream("./emplyee.txt");
            ObjectInputStream input = new ObjectInputStream(inputFile);
            emp = (Employee) input.readObject();

            inputFile.close();
            input.close();

        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
            e.printStackTrace();
        }

        System.out.println("Deserialized object: ");
        System.out.println("Employee: " + emp.getName() + " " + emp.getSurname() + " ID" + emp.getId());

    }
}
