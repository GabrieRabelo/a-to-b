import java.util.HashMap;

// Implementa o algoritmo Graus de Separação, através de caminhamento
// em largura (BFS) num grafo não dirigido
public class Application
{
    public static void main(String[] args)
    {

        In arq = new In("caso1_cohen.txt");
        String aux = "";
        while((aux = arq.readLine()) != null)
        {
            System.out.println(aux);
        }
        arq.close();

    }
}
