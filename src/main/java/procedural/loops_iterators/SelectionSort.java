package procedural.loops_iterators;

public class SelectionSort {

  public static void sort(int[] arr) {
    for (int barrier = 0; barrier < arr.length - 1; barrier++) {
      for (int index = barrier + 1; index < arr.length; index++) {
        if (arr[barrier] > arr[index]) {
          int tmp = arr[index];
          arr[index] = arr[barrier];
          arr[barrier] = tmp;
        }
      }
    }
  }

  public static void sortOptimized(int[] arr) {
    for (int barrier = 0; barrier < arr.length - 1; barrier++) {
      int element = arr[barrier];
      for (int index = barrier + 1; index < arr.length; index++) {
        if (element > arr[index]) {
          int tmp = arr[index];
          arr[index] = arr[barrier];
          arr[barrier] = tmp;
        }
      }
    }
  }
}
