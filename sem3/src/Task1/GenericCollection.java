package Task1;

import java.util.ArrayList;
import java.util.List;

public class GenericCollection <T>  {
    private final List<T> arrayList;
    MyIteratorz myIteratorz;

    public GenericCollection(List<T> list) {
        arrayList = list;
        myIteratorz = new MyIteratorz();
    }

    public GenericCollection() {
        arrayList = new ArrayList<>();
        myIteratorz = new MyIteratorz();
    }

    public void forEachPrint() {
        while (myIteratorz.hasNext())
            System.out.print(myIteratorz.next() + "| ");
    }

    public void add(T t) {
        arrayList.add(t);
    }

    public void remove(T t) {
        arrayList.remove(t);
    }

    public List<T> getArrayList() {
        return arrayList;
    }

    public void print() {
        for (T t : arrayList)
            System.out.print(t + " | ");
        System.out.println();
    }


}
