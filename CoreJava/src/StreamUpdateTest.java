//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Stream;
//
//public class StreamUpdateTest {
//
//    /**
//     * i want to test if the collection get updated whiie being streamed
//     * works or not
//     */
//
//
//    public static void main(String[] args) {
//        StreamUpdateTest streamUpdateTest = new StreamUpdateTest();
//        synchronized<String> random = Arrays.asList("vo","vo","vo","vo","vo","vo");
//       Runnable one = new Runnable() {
//           @Override
//           public void run() {
//               for (int i = 0; i < 10; i++) {
//                   streamUpdateTest.remove(random, i);
//               }
//           }
//       };
//
//        Runnable two = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//
//                   streamUpdateTest.addToList(random);
//                }
//            }
//        };
//
//       // new Thread(one).start();
//        new Thread(two).start();
//
//        Stream.of(random).forEach(System.out::println);
//
//    }
//
//    public void remove(List<String> list,int i){
//
//        Stream.of(list).map(a->a.remove(i));
//        Stream.of(list).forEach(System.out::print);
//
//    }
//    public void addToList(List<String> list){
//        list.add("ja");
//       // Stream.of(list).forEach(System.out::print);
//    }
//}
