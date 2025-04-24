import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, String> table = new MyHashTable<>();

        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            int id = rand.nextInt(10000);
            String name = "Name" + rand.nextInt(10000);
            MyTestingClass key = new MyTestingClass(id, name);
            String value = "Student_" + i;
            table.put(key, value);
        }

        for (int i = 0; i < 11; i++) {
            System.out.println("Bucket " + i + " size: " + table.bucketSize(i));
        }

        System.out.println("Total size: " + table.size());
    }
}
