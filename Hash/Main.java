import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String caminhoArquivo = "../txt/desafio1.txt";
        
        try {
            File arquivo = new File(caminhoArquivo);

            FileReader leitor = new FileReader(arquivo);

            BufferedReader bufferedReader = new BufferedReader(leitor);

            String linha;

            while ((linha = bufferedReader.readLine()) != null) {

                String[] partes = linha.split("> ");

                if (partes.length == 2) { 

                    int index = Integer.parseInt(partes[0].trim());

                    String[] numerosStr = partes[1].split(",\\s*");
                    
                    Integer[] numeros = new Integer[numerosStr.length];

                    for (int i = 0; i < numerosStr.length; i++) {
                        numeros[i] = Integer.parseInt(numerosStr[i]);
                    }
                    
                    Map mapa = new Map(numeros, index);
                    Hash hash = new Hash(mapa.pai);
                }


            }
            bufferedReader.close();
            leitor.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

