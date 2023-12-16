import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;


public class Hashset<E> implements Set<E> {
    private final HashMap<E, Object> map;
    private static final Object v = new Object();

    public Hashset(){
        map = new HashMap<>();
    }

    public Hashset(HashMap<E, Object> map) {
        this.map = map;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return !map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public Object[] toArray() {
        return map.keySet().toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return map.keySet().toArray(a);
    }

    @Override
    public boolean add(E e) {
        return map.put(e, v) == null;
    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o) != null;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean modified = false;
        for (E element : c) {
            if (map.put(element, v) == null) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return map.keySet().removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return map.keySet().retainAll(c);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return map.keySet().containsAll(c);
    }
}
