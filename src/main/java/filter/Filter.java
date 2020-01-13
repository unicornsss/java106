package filter;

import java.util.List;

public interface Filter<T> {

    List<T> execute(List<T> listToFilter);
}
