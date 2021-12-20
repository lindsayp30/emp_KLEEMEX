public class SearchDriver {

  public static long testLinSearch(Comparable[] arr, int index){
    long avg = 0;
    for (int i = 0; i < 50; i++) {
      long time = System.currentTimeMillis();
      LinSearch.linSearch(arr, index);
      time = System.currentTimeMillis() - time;
      avg += time;
    }
    avg /= 50;
    return avg;
  }

  public static long testBinSearch(Comparable[] arr, int index){
    long avg = 0;
    for (int i = 0; i < 50; i++) {
      long time = System.currentTimeMillis();
      BinSearch.binSearch(arr, index);
      time = System.currentTimeMillis() - time;
      avg += time;
    }
    avg /= 50;
    return avg;
  }

  public static void main(String[] args){

      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

      Comparable[] Arr1 = new Comparable[10_000_000];
      for (int i = 0; i < 10_000_000; i++) { //create and fills an array with 10,000,000 consecutive integers
          Arr1[i] = i;
      }

      System.out.println("Length of Array: 10,000,000 ");
      System.out.println("Worse Case: ");
      System.out.print("LinSearch (Last Index)... ");

      long avgLin10mil = testLinSearch(Arr1, 9_999_999);
      System.out.println(avgLin10mil);

      System.out.print("BinSearch (Last Index)... ");

      long avgBin10mil = testBinSearch(Arr1, 9_999_999);
      System.out.println(avgBin10mil);

      System.out.println("-----------------------------");

      System.out.println("Best Case: ");
      System.out.print("LinSearch (First Index)... ");

      avgLin10mil = testLinSearch(Arr1, 0);
      System.out.println(avgLin10mil);

      System.out.print("BinSearch (Middle Index)... ");

      avgBin10mil = testBinSearch(Arr1, 5_000_000);
      System.out.println(avgBin10mil);

      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

      Comparable[] Arr2 = new Comparable[25_000_000];
      for (int i = 0; i < 25_000_000; i++) {
          Arr2[i] = i;
      }

      System.out.println("Length of Array: 25,000,000 ");
      System.out.println("Worse Case: ");
      System.out.print("LinSearch (Last Index)... ");

      long avgLin25mil = testLinSearch(Arr2, 24_999_999);
      System.out.println(avgLin25mil);

      System.out.print("BinSearch (Last Index)... ");

      long avgBin25mil = testBinSearch(Arr2, 24_999_999);
      System.out.println(avgBin25mil);

      System.out.println("-----------------------------");

      System.out.println("Best Case: ");
      System.out.print("LinSearch (First Index)... ");

      avgLin10mil = testLinSearch(Arr2, 0);
      System.out.println(avgLin25mil);

      System.out.print("BinSearch (Middle Index)... ");

      avgBin25mil = testBinSearch(Arr2, Arr.length() / 2);
      System.out.println(avgBin25mil);

      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

      Comparable[] Arr3 = new Comparable[50_000_000];
      for (int i = 0; i < 50_000_000; i++) {
          Arr3[i] = i;
      }

      System.out.println("Length of Array: 50,000,000 ");
      System.out.println("Worse Case: ");
      System.out.print("LinSearch (Last Index)... ");

      long avgLin50mil = testLinSearch(Arr3, 49_999_999);
      System.out.println(avgLin50mil);

      System.out.print("BinSearch (Last Index)... ");

      long avgBin50mil = testBinSearch(Arr3, 49_999_999);
      System.out.println(avgBin50mil);

      System.out.println("-----------------------------");

      System.out.println("Best Case: ");
      System.out.print("LinSearch (First Index)... ");

      avgLin50mil = testLinSearch(Arr3, 0);
      System.out.println(avgLin50mil);

      System.out.print("BinSearch (Middle Index)... ");

      avgBin50mil = testBinSearch(Arr3, 25_000_000);
      System.out.println(avgBin50mil);

      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


  }

}
