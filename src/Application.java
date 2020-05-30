import java.util.HashMap;

// Implementa o algoritmo Graus de Separação, através de caminhamento
// em largura (BFS) num grafo não dirigido
public class Application {
    public static void main(String[] args) {
        final String FILE_NAME= "caso1_cohen.txt";
        String aux;
        int lineLength = 0;
        int columnLength = 0;

        In arq = new In(FILE_NAME);

        while((aux = arq.readLine()) != null) {
            if(lineLength == 0) lineLength = aux.length();
            columnLength++;
        }
        arq.close();

        char[][] maze = new char[lineLength][columnLength];
        int[] hero = new int[2];
        int[] villain = new int[2];

        arq = new In(FILE_NAME);
        int y=0;

        Graph graph = new Graph(lineLength * columnLength);

        while((aux = arq.readLine()) != null) {
            char[] lineArray = aux.toCharArray();

            for(int x=0; x<lineLength;x++){
                maze[x][y] = lineArray[x];

                if (maze[x][y] == 'A') {
                    hero[0] = x;
                    hero[1] = y;
                }
                if (maze[x][y] == 'B') {
                    villain[0] = x;
                    villain[1] = y;
                }
            }

            y++;
        }

        for(int i = 0; i<columnLength;i++) {
            for(int j = 0; j<lineLength;j++) {
                System.out.print(maze[i][j]);
            }
            System.out.print("\n");
        }

        arq.close();

//        System.out.println("Tamanho da linha: " + lineLength + "\nTamanho da coluna: " + columnLength);
        System.out.println("Posição heroi linha: " + hero[0] + " coluna: " + hero[1]);
        System.out.println("Posição vilao linha: " + villain[0] + " coluna: " + villain[1]);

    }
}