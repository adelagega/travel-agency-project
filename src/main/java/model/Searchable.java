package model;

import java.util.List;

public interface Searchable {
    List<Object> search();
    List<Object> filter();
    List<Object> sort();
}
