package Lists;

import java.util.*;
import java.util.function.UnaryOperator;

public class ListTest implements List {
    private int size;
    private Object[] objectList = new Object[5];


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (indexOf(o) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean add(Object o) {
        if (size < objectList.length) {
            objectList[size] = o;
            size++;
            return true;
        } else return false;
    }

    @Override
    public void add(int index, Object element) {
        if (index < objectList.length && index >= 0) {
            objectList[index] = element;
        }
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (objectList[i].equals(o)) return i;
        }
        return -1;
    }

    @Override
    public Object remove(int index) {
        if (index >= size) {
            return null;
        }
        for (int i = index; index < size - 1; index++) {
            objectList[index] = objectList[index + 1];
        }
        objectList[size] = null;
        size--;
        return null;
    }

    @Override
    public boolean remove(Object o) {
        int temp = indexOf(o);
        if (temp < 0) {
            return false;
        }
        remove(temp);
        return true;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            objectList[i] = null;
        }
    }

    @Override
    public Object get(int index) {
        return objectList[index];
    }

    @Override
    public Object set(int index, Object element) {
        Object temp = objectList[index];
        objectList[index] = element;
        return temp;
    }


    @Override
    public int lastIndexOf(Object o) {
        for (int i = size-1; i >= 0; i--) {
            if (objectList[i].equals(o)) return i;
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public void replaceAll(UnaryOperator operator) {

    }

    @Override
    public void sort(Comparator c) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }


    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }
}
