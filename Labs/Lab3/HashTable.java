import java.util.LinkedList;
import java.util.Objects;

public class HashTable<K, V> {
    private static final int DEFAULT_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    private LinkedList<Entry<K, V>>[] table = (LinkedList<Entry<K, V>>[]) new LinkedList[DEFAULT_CAPACITY];

    private int size = 0;

    private static class Entry<K, V> {
        K key;
        V value;
        Entry(K k, V v) { key = k; value = v; }
    }

    private int indexFor(K key) {
        return (Objects.hashCode(key) & 0x7fffffff) % table.length;
    }

    // Добавляет пару key->value или обновляет существующую
    public void put(K key, V value) {
        int idx = indexFor(key);
        if (table[idx] == null) table[idx] = new LinkedList<>();
        for (Entry<K, V> e : table[idx]) {
            if (Objects.equals(e.key, key)) {
                e.value = value;
                return;
            }
        }
        table[idx].add(new Entry<>(key, value));
        size++;
    }

    // Возвращает значение по ключу или null, если нет
    public V get(K key) {
        LinkedList<Entry<K, V>> bucket = table[indexFor(key)];
        if (bucket == null) return null;
        for (Entry<K, V> e : bucket) {
            if (Objects.equals(e.key, key)) return e.value;
        }
        return null;
    }

    // Удаляет запись по ключу и возвращает старое значение или null
    public V remove(K key) {
        int idx = indexFor(key);
        LinkedList<Entry<K, V>> bucket = table[idx];
        if (bucket == null) return null;
        var it = bucket.iterator();
        while (it.hasNext()) {
            Entry<K, V> e = it.next();
            if (Objects.equals(e.key, key)) {
                V old = e.value;
                it.remove();
                size--;
                if (bucket.isEmpty()) table[idx] = null;
                return old;
            }
        }
        return null;
    }

    public int size() { return size; }

    public boolean isEmpty() { return size == 0; }

    public static void main(String[] args) {
        HashTable<String, Integer> ht = new HashTable<>();
        ht.put("one", 1);
        ht.put("two", 2);
        System.out.println(ht.get("one"));      // 1
        ht.put("two", 22);
        System.out.println(ht.get("two"));      // 22
        System.out.println(ht.remove("one"));   // 1
        System.out.println(ht.size());          // 1
        System.out.println(ht.isEmpty());       // false
    }
}
