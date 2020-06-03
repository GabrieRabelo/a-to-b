// Implementa o algoritmo Graus de Separação, através de caminhamento
// em largura (BFS) num grafo não dirigido
public class Application {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        final String FILE_NAME= "caso1_cohen.txt";

        Maze maze = new Maze(FILE_NAME);

        maze.printMaze();

        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime + "ms");
        System.out.println("Largura: " + maze.getWidth() + "\nAltura: " + maze.getHeigth());
        System.out.println("Posição heroi linha: " + maze.getHero()[0] + " coluna: " + maze.getHero()[1]);
        System.out.println("Posição vilao linha: " + maze.getVillain()[0] + " coluna: " + maze.getVillain()[1]);

    }
}