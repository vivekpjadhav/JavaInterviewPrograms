import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FlattenMapObject {

    static Map<String, Object>   flattenDictionary(Map<String, Object> dict) {
      Map<String, Object> result = new HashMap<>();


        dict.entrySet().stream().map(a-> {
            String key = a.getKey();
            String value = "";
            if(a.getValue() instanceof Map){
                    Map mapObj = flattenDictionary((Map<String, Object>) a.getValue());
                    for (Object subKey : mapObj.keySet()){
                        String newKey = key +"."+ subKey;
                        result.put(newKey, a.getValue());

                    }

            }else{
                result.put(a.getKey(), (String) a.getValue());
            }

            return null;
        }).collect(Collectors.counting());
        return result;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Map<String, Object> dict = new HashMap<String, Object>();
        dict.put("key1", "1");
        Map<String, Object> c = new HashMap<String, Object>();
        c.put("d", "3"); c.put("e", "1");
        Map<String, Object> key2 = new HashMap<String, Object>();
        key2.put("a", "2"); key2.put("b", "3"); key2.put("c", c);
        dict.put("key2", key2);

        System.out.println(flattenDictionary(dict));

        /**
         * Input looks like this:
         * {
         'Key1': '1',
         'Key2': {
         'a' : '2',
         'b' : '3',
         'c' : {
         'd' : '3',
         'e' : '1'
         }
         }
         }

         Output should look like this:
         {
         'Key1': '1',
         'Key2.a': '2',
         'Key2.b' : '3',
         'Key2.c.d' : '3',
         'Key2.c.e' : '1'
         }

         **/
    }
}
