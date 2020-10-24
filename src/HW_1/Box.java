package HW_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruits> {

    private List<T> inbox;

    public Box() {
        this.inbox = new ArrayList<>();
    }
    public Box(List<T> fruits) {
        this.inbox = new ArrayList(Arrays.asList(fruits));
    }


}
