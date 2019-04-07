package Lists;

import java.util.Collection;

final public class ListTestImmutable extends ListTest {
    @Override
    final public boolean add(Object o) {
        return false;
    }

    @Override
    final public void add(int index, Object element){}

    @Override
    final public Object remove(int index) {
        return null;
    }

    @Override
    final public boolean remove(Object o) {
        return false;
    }

    @Override
    final public void clear() {}

    @Override
    final public Object set(int index, Object element) {
        return null;
    }

    @Override
    final public boolean removeAll(Collection c) {
        return false;
    }
}
