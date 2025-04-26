import java.util.Random;
public class MyTestingClass {
    private int id;
    private String name;
    public MyTestingClass(int id, String name) {
        this.id = id;
        this.name = name;
    }




    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + id;
        for (char ch : name.toCharArray()) {
            hash = 31 * hash + ch;
        }
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MyTestingClass)) return false;
        MyTestingClass other = (MyTestingClass) obj;
        return this.id == other.id && this.name.equals(other.name);
    }

    @Override
    public String toString() {
        return "(" + id + ", " + name + ")";
    }
}
