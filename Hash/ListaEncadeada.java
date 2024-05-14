public class ListaEncadeada<T> {
    public int size = 0;

    public No<Integer> head = null;

    ListaEncadeada(){}

    void add(Integer value){
        size++;

        No<Integer> node = new No<>(value);
        No<Integer> atual = head;
        
        if(head == null){
            head = node;
            return;
        }

        while(atual.getNext() != null){
            atual = atual.getNext();
        }

        atual.setNext(node);
    }

    public boolean Procurar(Integer value){
        No<Integer> atual = head;
        for(int i = 0; i < size; i++){
            if(atual.getValue() == value){
                return true;
            }
            atual = atual.getNext();
        }
        return false;
    }

    public int getSize() {
        return size;
    }
}
