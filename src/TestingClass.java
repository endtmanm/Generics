import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestingClass extends Test {

    @Override
    <T extends Number> List<T> findNumbers(String key, Class<T> numberType) {

        System.out.println(numberType.isInstance(new BigDecimal(15)));
        System.out.println(numberType.isInstance(new Long(15)));

        return new ArrayList<T>();
    }



}