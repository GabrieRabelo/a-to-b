import java.util.HashMap;

// Implementa o algoritmo Graus de Separação, através de caminhamento
// em largura (BFS) num grafo não dirigido
public class Application {
    public static void main(String[] args) {
        final String FILE_NAME= "caso1_cohen.txt";
        String aux;
        int lineLength = 0;
        int columnLength = 0;

        //primeira leitura do arquivo
        In arq = new In(FILE_NAME);

        while((aux = arq.readLine()) != null) {
            if(lineLength == 0) lineLength = aux.length();
            columnLength++;
        }

        arq.close();

        char[][] maze = new char[lineLength][columnLength];

        //segunda leitura do arquivo
        arq = new In(FILE_NAME);
        int linePos;

        /*while((aux = arq.readLine()) != null) {
            String[] lineArray = aux.split("");
            for(int i=0; i<lineLength;i++){
                maze[i][]= lineArray[i].toCharArray();
            }
        }*/

        arq.close();

        System.out.println("Tamanho da linha: " + lineLength + "\n Tamanho da coluna: " + columnLength);

    }
}
