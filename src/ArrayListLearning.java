import java.util.*;
public class ArrayListLearning {
    public static void main(String[] args) {
        ArrayList<Integer> languages=new ArrayList<>();
        languages.add(1);
        languages.add(6);
        languages.add(9);
        System.out.println(languages);

        languages.add(1,39);
        System.out.println(languages);

        languages.remove(3);
        languages.set(2,78);
        System.out.println(languages);
    }
}
