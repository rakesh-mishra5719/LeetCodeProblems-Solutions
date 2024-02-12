import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class RandomizedSet {
    Set<Integer> s;

    public RandomizedSet() {
        s = new HashSet<>();
    }

    public boolean insert(int val) {
        if (s.contains(val)) {
            return false;
        } else {
            s.add(val);
            return true;
        }
    }

    public boolean remove(int val) {
        if (s.contains(val)) {
            s.remove(val);
            return true;
        } else
            return false;
    }

    public int getRandom() {
        List<Integer> list = new ArrayList<Integer>(s);
        int r = (int) (Math.random() * s.size());
        return list.get(r);
    }
}


public class InsertDeleteGetRandom {
    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        boolean param_1 = obj.insert(5);
        boolean param_2 = obj.remove(2);
        int param_3 = obj.getRandom();
        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);

    }
}
