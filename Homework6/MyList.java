package Homework6;

import java.util.Collection;
import java.util.Comparator;

public interface MyList<E> {

    int enumSize();

    boolean isEmpty();

    boolean contains(Object var1);

    void addLastElement(E var1);

    void remove(Object var1);

    boolean addAllToEnd(Collection<? extends E> var1);

    boolean removeAll(Collection<?> col);

    void addElement(int index, E obj);

    boolean addAll(int index, MyList<? extends E> col);

    E getElement(int index);

    int indexOf(Object obj);

    int lastIndexOf(Object obj);

    E removeAndReturn(int index);

    E setMeaning(int index, E obj);

    void sort(Comparator<? super E> comparator);
}
