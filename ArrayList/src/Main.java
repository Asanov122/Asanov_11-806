public class Main {
    public Main() {
    }

    public static void main(String[] args) {


        GenericArrayList<String> list = new GenericArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}