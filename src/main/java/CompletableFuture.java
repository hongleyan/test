import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CompletableFuture {
    public static void main(String[] args) {
//        List<Employee> emps = Arrays.asList(
//                new Employee(101, "Z3", 19, 9999.99),
//                new Employee(102, "L4", 20, 7777.77),
//                new Employee(103, "W5", 35, 6666.66),
//                new Employee(104, "Tom", 44, 1111.11),
//                new Employee(105, "Jerry", 60, 4444.44)
//        );
//
//
//        Collections.sort(emps, (e1, e2) -> {
//            if (e1.getAge() == e2.getAge()) {
//                return e1.getName().compareTo(e2.getName());
//            } else {
//                return Integer.compare(e1.getAge(), e2.getAge());
//            }
//        });
//
//        for (Employee emp : emps) {
//            System.out.println(emp);
//        }
//


//
//
//        Consumer<Integer> consumer = (x) -> System.out.println("消费型接口" + x);
//        //test
//        consumer.accept(100);


        List<Integer> list = new ArrayList<>();
        List<Integer> integers = Arrays.asList(1, 2, 3);
        list.addAll(integers);
        //Supplier<T>
        Supplier<Integer> supplier = () -> (int) (Math.random() * 10);
        list.add(supplier.get());
        System.out.println(supplier);
        for (Integer integer : list) {
            System.out.println(integer);
        }


        String oldStr = "abc123456xyz";
        Function<String, String> function = (s) -> s.substring(1, s.length() - 1);
        //test
        System.out.println(function.apply(oldStr));


        Integer age = 34;
        Predicate<Integer> predicate = (i) -> i >= 35;
        if (predicate.test(age)){
            System.out.println("你该退休了");
        } else {
            System.out.println("我觉得还OK啦");
        }

    }
}


@Data
@NoArgsConstructor
@AllArgsConstructor
class Employee {
    private Integer id;
    private String name;
    private Integer age;
    private Double salary;
}
