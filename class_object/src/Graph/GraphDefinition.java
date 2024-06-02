package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GraphDefinition {
}

//对于单个点的定义，包含点的值、点的入边条数、出边条数
class Node{
    public int value;
    public int in;
    public int out;
    public ArrayList<Node> nexts;
    public ArrayList<Edge> edges;

    public Node(int value){
        this.value = value;
        in = 0;
        out = 0;
        nexts = new ArrayList<Node>();
        edges = new ArrayList<Edge>();
    }
}

class Edge{

}

class Graph{
    public HashMap<Integer, Node> nodes;
    public HashSet<Edge> edges;

    public Graph(){
        nodes = new HashMap<Integer, Node>();
        edges = new HashSet<Edge>();
    }
}

