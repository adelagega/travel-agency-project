package model;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public interface Searchable<T,S,F> {
    List<T> search(List<T> items, S search);
    List<T> filter(List<T> items, F filter);
    List<T> sort(List<T> items);
}
