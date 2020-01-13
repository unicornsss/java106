package filter;

import java.util.List;

public class FilterUtil {

    public static <T extends Filter> void executeFilterChain(List<T> filters, List listToFilter) {
        filters.forEach(filter -> {
            filter.execute(listToFilter);
        });
    }
}
