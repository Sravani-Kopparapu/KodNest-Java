
class ArraySearch {

    void search(int[] ref, int key) {
        boolean found = false;
        for (int i = 0; i <= ref.length - 1; i++) {
            if (ref[i] == key) {
                System.out.println("Element forund at index: " + i);
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.println("Element not found");
        }
    }
}

class ArraySearchDemo {

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        ArraySearch as = new ArraySearch();
        as.search(a, 60);
    }
}
