public class No<T> {
    public No<T> next = null;
    public T value;

    No(T value){
        this.value = value;
    }

    public No<T> getNext() {
        return next;
    }

    public void setNext(No<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
    
