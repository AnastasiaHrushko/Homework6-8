package Homework6;

import java.util.Collection;
import java.util.Comparator;

public class MyArrayList implements MyList<String>{

    String[] someArr = new String[10];

    @Override
    public int enumSize() {
        int size = 0;
        for (int i = 0; i < someArr.length; i++) {
            if (someArr[i] != null){
                size++;
            }
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        int size = 0;
        for (int i = 0; i < someArr.length; i++) {
            if (someArr[i] != null){
                size++;
            }
        }
        if (size != 0) {
            return true;
            //System.out.println("в коллекции есть элементы");
        }else {
            return false;
            //System.out.println("в коллекции нет элементов");
        }
    }

    @Override
    public boolean contains(Object var1) {
//        int count = 0;
//        for (int i = 0; i < someArr.length; i++) {
//            if (var1.equals(someArr[i]) == true){
//                count++;
//            }
//            if (count != 0){
//                return true;
//            } else {
//                return false;
//            }
        return true;   /// delete this
    }

    @Override
    public void addLastElement(String var1) {
        for (int i = 0; i < someArr.length; i++) {
            if (someArr[i] == null) {
                someArr[i] = var1;
                break;
            }
        }
        System.out.println(someArr);
    }

    @Override
    public void remove(Object var1) {
        for (int i = 0; i < someArr.length; i++) {
            if (someArr[i].equals(var1) == true) {
                someArr[i] = null;
            }
        }
        System.out.println(someArr);
    }

    @Override
    public boolean addAllToEnd(Collection<? extends String> var1) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> col) {
        return false;
    }

    @Override
    public void addElement(int index, String obj) {
        for (int i = 0; i < someArr.length; i++) {
            if (i == index){
                someArr[i] = obj;
            }
        }
        System.out.println(someArr);
    }

    @Override
    public boolean addAll(int index, MyList<? extends String> col) {
//        for (int i = 0; i < someArr.length; i++) {
//            if (i == index){
//                someArr[i] = col;  //??? HELP
//            }
//            if (someArr.equals(someArr2 == false)){
//                return true;
//            } else {
//                return false;
//            }
//        }
    }

    String someStr = null;
    @Override
    public String getElement(int index) {
        for (int i = 0; i < someArr.length; i++) {
            if (i == index){
                String someStr = someArr[i];
            }
        }
        return someStr;
    }

    @Override
    public int indexOf(Object obj) {
        int coincidence = 0;
        for (int i = 0; i < someArr.length; i++) {
            if (someArr[i].equals(obj) == true) {
                coincidence = i;
            }
        }
        if (coincidence != 0){
            return coincidence;
        } else {
            return -1;
        }
    }

    @Override
    public int lastIndexOf(Object obj) {
            int coincidence = 0;
            for (int i = someArr.length-1; i > 0; i--) {
                if (someArr[i].equals(obj) == true) {
                    coincidence = i;
                }
            }
            if (coincidence != 0){
                return coincidence;
            } else {
                return -1;
            }
    }

    @Override
    public String removeAndReturn(int index) {
        String someStr2 = null;
        for (int i = 0; i < someArr.length; i++) {
            if (i == index) {
                someStr2 = someArr[i];
                someArr[i] = null;
            }
        }
        return someStr2;
    }

    @Override
    public String setMeaning(int index, String obj) {
        return null;
    }

    @Override
    public void sort(Comparator<? super String> comparator) {
//        for (int i = 0; i < someArr.length; i++) {
//            for (int j = 0; j < someArr.length; j++) {
//
//            }
//        }

    }
}
