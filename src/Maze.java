public class Maze {
    private int[][] maze;
    private int width, heigth;
    private final int[] hero = new int[2];
    private final int[] villain = new int[2];
    private Graph graph;

    public Maze(String filename){
        In arq = new In(filename);
        String aux = "";

        while((aux = arq.readLine()) != null) {
            if(width == 0) width = aux.length();
            heigth++;
        }
        arq.close();

        maze = new int[width][heigth];

        arq = new In(filename);

        int y=0;
        int count = 3;
        while((aux = arq.readLine()) != null) {
            char[] lineArray = aux.toCharArray();
            for(int x = 0; x< width; x++){
                switch (lineArray[x]) {
                    case '#':
                        maze[y][x]=0;
                        break;
                    case '.':
                        maze[y][x]=count;
                        count++;
                        break;
                    case 'A':
                        maze[y][x]=1;
                        hero[0] = x;
                        hero[1] = y;
                        break;
                    case 'B':
                        maze[y][x]=2;
                        villain[0] = x;
                        villain[1] = y;
                        break;
                }
            }
            y++;
        }
        arq.close();

        createGraph();
    }

    public void createGraph() {
        graph = new Graph(width*heigth);

        for(int y = 1; y<width-1;y++){
            for(int x = 1; x<heigth;x++){
                if(maze[y][x] != 0) {
                    if(maze[y][x+1] != 0) {
                        graph.addEdge(maze[y][x], maze[y][x+1]);
                    }
                    if(maze[y+1][x] != 0) {
                        graph.addEdge(maze[y+1][x], maze[y][x]);
                    }
                }
            }
        }
    }

    public void printMaze() {
        for(int i = 0; i< heigth; i++) {
            for(int j = 0; j<width;j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.print("\n");
        }

    }

    public int[] getHero() {
        return hero;
    }

    public int[] getVillain() {
        return villain;
    }

    public int getWidth(){
        return width;
    }

    public int getHeigth(){
        return heigth;
    }

    public Graph getGraph() {
        return graph;
    }
}
