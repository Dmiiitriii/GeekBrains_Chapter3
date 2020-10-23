package HW_1;

import java.util.Arrays;
import java.util.LinkedList;

public class BoxGen<T> {
    private T obj;
    private String name;

    public BoxGen(T obj, String name) {
        this.obj = obj;
        this.name = name;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }



}
