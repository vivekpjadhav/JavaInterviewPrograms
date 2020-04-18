import java.util.*;

public class SmallestCommonRegion {

    static String findSmallestRegion(List<List<String>> regions, String region1, String region2) {
        Map<String,String> map = new HashMap<>();
        for (List<String> a : regions) {
            for (int i = 1; i < a.size() ; i++) {
                map.put(a.get(i),a.get(0));
            }
        }
        System.out.println(map.entrySet());
        Set<String> set = new HashSet<>();
        while(true) {
             if(region1.equals(map.get(region2)))
                 return region1;

            if(region2.equals(map.get(region1)))
                return region2;
            if (region1.equals(region2))
                return region1;

            region1= (map.get(region1)!=null)?map.get(region1):region1;
            region2= (map.get(region2)!=null)?map.get(region2):region2;
        }

    }

    public static void main(String[] args) {

        List<List<String>> R = new ArrayList<>();
        R.add(Arrays.asList("Earth", "North America", "South America"));
        R.add(Arrays.asList("North America", "United States", "Canada"));
        R.add(Arrays.asList("United States", "New York", "Boston"));
        R.add(Arrays.asList("Canada", "Ontario", "Quebec"));
        R.add(Arrays.asList("South America", "Brazil"));
        String region1 = "Canada";
        String region2 = "Quebec";
        System.out.println(findSmallestRegion(R, region1, region2));
    }

    static class RGraph {
        String region;
        List<RGraph> sub;

        public RGraph(String region) {
            this.region = region;
            sub = new ArrayList<>();
        }

        @Override
        public String toString() {
            return "RGraph{" +
                    "region='" + region + '\'' +
                    ", sub=" + sub +
                    '}';
        }
    }
}
