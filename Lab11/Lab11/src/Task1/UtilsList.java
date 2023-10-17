package Task1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface UtilsList {
    static void showDuplicates(List<?> lista) {
        Set<Object> uniqueElements = new HashSet<>();
        List<Object> duplicateElements = new ArrayList<>();

        for (Object element : lista
             ) {
            if (!uniqueElements.add(element)) {
                duplicateElements.add(element);
            }
        }
        System.out.println("Duplicate elements: " + duplicateElements);
    }

    static <T> void deleteDuplicates(List<T> lista) {
        Set<T> uniqueElements = new HashSet<>(lista);
        lista.clear();
        lista.addAll(uniqueElements);
    }
}
