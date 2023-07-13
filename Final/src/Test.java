import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,2,3,4,5,5);
	List<Object> sqr = list.stream().map(e->e*e).collect(Collectors.toList());
	System.out.println(sqr);
}
}
