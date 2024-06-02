import java.util.ArrayList;
import java.util.List;

public class Prime_num {
    public static void main(String[] args) {
        Prime_num p = new Prime_num();
        List<Integer> list = new ArrayList<>();
        list.add(2);

        for (int i = 3; i <= 200; i++) {
            if (p.IsPrime(i)) list.add(i);
        }

        System.out.println(list);
    }
    public boolean IsPrime(int num){
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0) return false;
        }
        return true;
    }
}
