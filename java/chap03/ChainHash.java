public class ChainHash<K, V> {
    class Node<K, V> {
        private K key;
        private V data;
        private Node<K, V> next;
    }

    Node(K key, V data, Node<K、V> next) {
        this.key = key;
        this.data = data;
        this.next = next;
    }

    private int size;
    private Node<K, V>[] table;

    public ChainHash(int capacity) {
        try{
            table = new Node[capacity];
            this.size = capacity;
        } catch (OutOfMemoryError) {
            this.zise = 0;
        }
    }

    public int hashValue(Object key) {
        return key.hashCode() % size;
    }

    K getKey() {
        return key;
    }

    V getValue() {
        return data;
    }

    public int hashCode() {
        return key.hashCode();
    }
}
