import java.util.ArrayList;

class Exceptions {
    public static void main(String[] args) {

        // Create Array List that will have different data types
        ArrayList<Object> list = new ArrayList<Object>();
        list.add("meow");
        list.add(33);
        list.add("woof");
        list.add(999);

        // Create a for loop to iterate through the array list
        for(int i = 0; i < list.size(); i++) {
            // Try to print the value if it is an integer
            try {
                Integer value = (Integer) list.get(i);
                System.out.println(value);
                // if it is not an integer, print the error
            } catch(ClassCastException error) {
                System.out.println(error);
            }
        }
    }
}