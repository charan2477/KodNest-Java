public class ArrayEleSearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int search = 4;
        SearchEle as = new SearchEle();
        as.search(arr, search);
    }
}

class SearchEle {
    void search(int ref[], int key) {
        boolean found = false;
        for (int i = 0; i <= ref.length - 1; i++) {
            if (ref[i] == key) {
                found = true;
                break;
            }
        }
        if (found == true) {
            System.out.println("Element is found");
        } else {
            System.out.println("Element is not found");
        }
    }
}
