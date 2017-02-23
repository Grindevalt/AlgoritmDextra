import com.andersenlab.vladbadilovskii.Dejkstra;
import com.andersenlab.vladbadilovskii.Edge;
import com.andersenlab.vladbadilovskii.Graph;
import com.andersenlab.vladbadilovskii.Vertex;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Vlad Badilovskii on 23.02.2017.
 */
public class Test {
    private List<Vertex> nodes;
    private List<Edge> edges;

    @org.junit.Test
    public void testExcute() {
        nodes = new ArrayList<Vertex>();
        edges = new ArrayList<Edge>();
        for (int i = 0; i < 11; i++) {
            Vertex location = new Vertex("Node_" + i, "Node_" + i);
            nodes.add(location);
        }

        addLane("Edge_0", 1, 2, 70);
        addLane("Edge_1", 1, 3, 140);
        addLane("Edge_2", 1, 4, 120);
        addLane("Edge_3", 2, 5, 130);
        addLane("Edge_4", 3, 4, 80);
        addLane("Edge_5", 3, 6, 100);
        addLane("Edge_6", 4, 5, 140);
        addLane("Edge_7", 4, 6, 100);
        addLane("Edge_8", 4, 8, 150);
        addLane("Edge_9", 5, 7, 150);
        addLane("Edge_10", 6, 7, 170);
        addLane("Edge_11", 6, 8, 70);
        addLane("Edge_12", 7, 8, 90);

        // Lets check from location Loc_1 to Loc_10
        Graph graph = new Graph(nodes, edges);
        Dejkstra dijkstra = new Dejkstra(graph);
        dijkstra.execute(nodes.get(0));
        LinkedList<Vertex> path = dijkstra.getPath(nodes.get(8));

        assertNotNull(path);
        assertTrue(path.size() > 0);

        for (Vertex vertex : path) {
            System.out.println(vertex);
        }

    }

    private void addLane(String laneId, int sourceLocNo, int destLocNo,
                         int duration) {
        Edge lane = new Edge(laneId, nodes.get(sourceLocNo), nodes.get(destLocNo), duration);
        edges.add(lane);
    }

    public static void main(String[] args) throws IOException {

    }
}


