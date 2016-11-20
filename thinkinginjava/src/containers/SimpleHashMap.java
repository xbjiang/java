package containers;
import java.util.*;

public class SimpleHashMap<K,V> extends AbstractMap<K,V> {
    private final static int SIZE = 997;
    //@SuppressWarnings("unchecked")
    private LinkedList<MapEntry<K,V>>[] buckets = 
    		new LinkedList[SIZE];
    public V put(K key, V value)
    {
    	V oldValue = null;
    	int index = Math.abs(key.hashCode()) % SIZE; 
    	if (buckets[index] == null)
    		buckets[index] = new LinkedList<MapEntry<K,V>>();
    	LinkedList<MapEntry<K,V>> bucket = buckets[index];
    	ListIterator<MapEntry<K,V>> it = bucket.listIterator();
    	boolean found = false;
    	MapEntry<K,V> pair = new MapEntry<>(key,value);
    	while (it.hasNext()) {
    		MapEntry<K,V> iPair = it.next();
    		if (iPair.getKey().equals(key)) {
    			oldValue = iPair.getValue();
    			it.set(pair);
    			found = true;
    			break;
    		}
    	}
    	if (!found) {
    		bucket.add(pair);	
    	}
    	return oldValue;
    }
    public V get(Object key) {
    	int index = Math.abs(key.hashCode()) % SIZE;
    	if (buckets[index] == null) return null;
    	for (MapEntry<K,V> pair : buckets[index])
    		if (pair.getKey().equals(key))
    			return pair.getValue();
    	return null;
    }
    public Set<Map.Entry<K,V>> entrySet()
    {
    	Set<Map.Entry<K,V>> set = new HashSet<Map.Entry<K,V>>();
    	for (LinkedList<MapEntry<K,V>> bucket : buckets) {
    		if (bucket == null) continue;
    		for (MapEntry<K,V> pair : bucket)
    			set.add(pair);
    	}
    	return set;
    }
    public static void main(String[] args)
    {
    	SimpleHashMap<String, String> map = 
    			new SimpleHashMap<>();
    	map.put("fuck", "you");
    	map.put("ass", "hole");
    	map.put("a piece","of shit");
    	System.out.println(map);
    	System.out.println(map.get("ass"));
    	System.out.println(map.entrySet());
    }
}
