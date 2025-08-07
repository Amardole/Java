package collectionpr;

import java.beans.Introspector;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        numbers.sort(new DecendingOrder());

        System.out.println(numbers);
    }
}
class DecendingOrder implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return -1;
    } //positive return :o2 then o1 comes (Assending Order) , Negative Return: as it is o1 then o2 (dec Order)
}