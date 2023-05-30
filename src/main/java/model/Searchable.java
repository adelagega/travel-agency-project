package model;

import java.util.List;
public interface Searchable<T,S,F> {
    List<T> search(S search);
    List<T> filter(F filter);
    List<T> sort();
}
