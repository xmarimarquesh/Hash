public class Hash {
    private ListaEncadeada<Integer>[] list;
    private int size = 0;

    Hash(int size){
        this.size = size;
        list = (ListaEncadeada[])(new Object[size]);

        for(int i = 0; i < list.length; i++){
            list[i] = new ListaEncadeada<Integer>();
        }
    }

    boolean add(Integer value){
        int indice = value % size;

        if(list[indice].Procurar(value)){
            return true;
        }

        list[indice].add(value);

        System.out.println("LISTA:");
        for(int i = 0; i< size; i++){
            System.out.println(list[i].getValue());
        }
        return false;
    }


}
