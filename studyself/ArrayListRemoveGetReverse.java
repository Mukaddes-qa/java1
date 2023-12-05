package studyself;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveGetReverse {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("UnitedStates");
        names.add("Europe");
        names.add("Turke");
        names.add("m");
        names.add("Asia");
        System.out.println("Before-" + names);
        withMethods(names);
    }

    public static void withMethods(List<String> names) {
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() < 2) {
                names.remove(i);
            }
            if (names.get(i).length() > 10) {
                names.set(i, names.get(i).substring(0, 10));
            }
            if (names.get(i).length() == 5) {
                String rev = "";
                for (int j = names.get(i).length() - 1; j >= 0; j--) {
                    rev += names.get(i).charAt(j);
                }
                names.set(i, rev);
            }
        }
        System.out.println("After-" + names);
    }
}
