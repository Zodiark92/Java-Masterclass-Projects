import java.util.ArrayList;
import java.util.List;

public class Layer <T extends Mappable> {

    private List<T> mappedElements = new ArrayList<>();

    public void addElement(T element) {
        mappedElements.add(element);
        System.out.println("Element to map added to the list: \n" + element);
    }

    public void renderLayer() {
        for (T element : mappedElements) {
            element.render();
        }
    }

}
