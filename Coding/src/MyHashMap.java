import java.util.HashMap;
import java.util.Map;

class Entity<K,V>{
   final K key;
    V value;
    Entity<K,V> next;

    public Entity(K key, V value, Entity<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class MyHashMap<K,V> {

   private Entity<K,V>[] buckets;
   private static int SIZE=100;
   private int count =0;

    public MyHashMap() {
        this(SIZE);
    }
    public MyHashMap(int size) {
        this.buckets = new Entity[size];
    }

    public void put(K key , V value ){
        Entity<K,V> entry = new Entity<>(key,value,null);
        int location = Math.abs(getHash(key)% SIZE);

        Entity<K,V> exist = buckets[location];
        if(exist == null){
            buckets[location]= entry;
            count++;
        }else {
            while (exist != null) {
                if (exist.key.equals(key)) {
                    exist.value = value;
                    count++;
                }



            if (exist.key.equals(key)) {
                exist.value = value;
            } else {
                exist.next = entry;
                count++;
            }
                exist = exist.next;
            }

        }
    }

    public V get(K key){
        if(key ==null) return buckets[Math.abs(getHash(key))].getValue();
        Entity<K,V> bucket = buckets[Math.abs(getHash(key)% SIZE)];
        while(bucket != null){
            if(bucket.key.equals(key)){
                return bucket.value;
            }
            bucket = bucket.next;


        }
        return null;

    }


    private int getHash(K k){
        return (k!=null)? k.hashCode():0;
    }


    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put(null,"vivek");
        map.put(null,"jadhav");
        MyHashMap<String, String> myMap = new MyHashMap<>();
        myMap.put("USA", "Washington DC");
          myMap.put("USA", "Washington DC");
        myMap.put("Nepal", "Kathmandu");
        myMap.put("India", "New Delhi");
        myMap.put("Australia", "Sydney");
        myMap.put(null, "Sydney");
        myMap.put(null, "jadhav");

        System.out.println(myMap.get(null));
        System.out.println(map.get(null));

    }
}
