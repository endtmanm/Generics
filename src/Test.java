import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Test {
    void test() {
        List<Long> l = findAll("long", Long.class);
        l.add(15L);

        List<BigDecimal> b = findAll("big", BigDecimal.class);
        b.add(new BigDecimal(15));
    }

    <T> List<T> findAll(String key, Class<T> type) {

        if (Number.class.isAssignableFrom(type)) {
            Class t = type;
            return findNumbers(key, t);
        }
        return null;
    }
    void test2(List l) {
        List<String> l1 = l;
    }

    abstract <TN extends Number> List<TN> findNumbers(String key, Class<TN> numberType);
}

//public abstract class Test2 {
//    void test() {
//        findAll("long", Long.class);
//        findAll("big", BigDecimal.class);
//    }
//
//    List<? extends Number> findAll(String key, Class<? extends Number> type) {
//        if (type == Long.class) {
//            return findLongs(key);
//        }
//        if (type == BigDecimal.class) {
//            return findDecimals(key);
//        }
//
//        return null;
//    }
//
//    protected abstract List<Long> findLongs(String key);
//
//    protected abstract List<BigDecimal> findDecimals(String key);
//
//}

