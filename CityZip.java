public class CityZip {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<Integer, String>();
        m.put(60606, "Chicago");
        m.put(63121, "St. Louis");
        m.put(10001, "New York City");
        for(Map.Entry m1 : m.entrySet()){
            System.out.println(m1.getKey()+" "+m1.getValue());
        }
    }
}
