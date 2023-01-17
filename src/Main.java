public class Main {
    public static void main(String[] args) {
        ArrayL a = new ArrayL();
        a.add(1);
        a.add(3);
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
    }
}
class ArrayL {
    private int size;
    private Object[] elements;

    ArrayL() {
        size = 0;
        elements = new Object[10];
    }

    public void add(Object element) {
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size++] = element;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    public int size() {
        return size;
    }
}