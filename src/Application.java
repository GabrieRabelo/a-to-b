// Implementa o algoritmo Graus de Separação, através de caminhamento
// em largura (BFS) num grafo não dirigido
public class Application {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        final String FILE_NAME= "caso6_cohen.txt";

        Maze maze = new Maze(FILE_NAME);

        BreadthFirstPaths path = new BreadthFirstPaths(maze.getGraph(),1);
        System.out.println("Caminho do herói até o vilão: " + path.distTo(2));

        long endTime = System.currentTimeMillis();

        System.out.println("Tempo de execução: " + (endTime-startTime) + "ms");
        System.out.println("Dimensões: " + maze.getWidth() + "x" + maze.getHeight());

//        System.out.println("Posição heroi linha: " + maze.getHero()[0] + " coluna: " + maze.getHero()[1]);
//        System.out.println("Posição vilao linha: " + maze.getVillain()[0] + " coluna: " + maze.getVillain()[1]);

    }
}