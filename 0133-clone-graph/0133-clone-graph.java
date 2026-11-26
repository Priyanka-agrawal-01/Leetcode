class Solution {

    private HashMap<Node, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null)
            return node;

        if (visited.containsKey(node))
            return visited.get(node);

        Node newNode = new Node(node.val);

        visited.put(node, newNode);

        for (Node neighbor : node.neighbors) {
            newNode.neighbors.add(cloneGraph(neighbor));
        }
        return newNode;
    }
}