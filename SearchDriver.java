public class SearchDriver {

  public static long testLinSearch(Comparable[] arr, int index){
    long totTime = 0;
    for (int i = 0; i < 500; i++) {
      long time = System.currentTimeMillis();
      LinSearch.linSearch(arr, index);
      time = System.currentTimeMillis() - time;
      totTime += time;
    }
    return totTime;
  }

  public static long testBinSearch(Comparable[] arr, int index){
    long totTime= 0;
    for (int i = 0; i < 500; i++) {
      long time = System.currentTimeMillis();
      BinSearch.binSearch(arr, index);
      time = System.currentTimeMillis() - time;
      totTime += time;
    }
    return totTime;
  }

  public static void main(String[] args){
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("Ignore this trial");
      Comparable[] ArrTrash = new Comparable[10];
      for (int i = 0; i < 10; i++) { //create and fills an array with 100,000 consecutive integers
          ArrTrash[i] = i;
      }

      System.out.println("Length of Array: 10 ");
      System.out.println("Amount of Time it Takes to Run 500 Trials: Worst Case Scenario");
      System.out.print("LinSearch (Target Location: Not in Array)... ");

      long Lin10 = testLinSearch(ArrTrash, 10);
      System.out.println(Lin10);

      System.out.print("BinSearch (Target Location: Not in Array)... ");

      long Bin10 = testBinSearch(ArrTrash, 10);
      System.out.println(Bin10);

      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

      Comparable[] Arr0 = new Comparable[1_000_000];
      for (int i = 0; i < 1_000_000; i++) { //create and fills an array with 100,000 consecutive integers
          Arr0[i] = i;
      }

      System.out.println("Length of Array: 1,000,000 ");
      System.out.println("Amount of Time it Takes to Run 500 Trials: Worst Case Scenario");
      System.out.print("LinSearch (Target Location: Not in Array)... ");

      long Lin100k = testLinSearch(Arr0, 1_000_000);
      System.out.println(Lin100k);

      System.out.print("BinSearch (Target Location: Not in Array)... ");

      long Bin100k = testBinSearch(Arr0, 1_000_000);
      System.out.println(Bin100k);

      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

      Comparable[] Arr1 = new Comparable[10_000_000];
      for (int i = 0; i < 10_000_000; i++) { ////create and fills an array with 10,000,000 consecutive integers
          Arr1[i] = i;
      }

      System.out.println("Length of Array: 10,000,000 ");
      System.out.println("Amount of Time it Takes to Run 500 Trials: Worst Case Scenario");
      System.out.print("LinSearch (Target Location: Not in Array)... ");

      long Lin10mil = testLinSearch(Arr1, 10_000_000);
      System.out.println(Lin10mil);

      System.out.print("BinSearch (Target Location: Not in Array)... ");

      long Bin10mil = testBinSearch(Arr1, 10_000_000);
      System.out.println(Bin10mil);

      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

      Comparable[] Arr2 = new Comparable[25_000_000];
      for (int i = 0; i < 25_000_000; i++) { ////create and fills an array with 25,000,000 consecutive integers
          Arr2[i] = i;
      }

      System.out.println("Length of Array: 25,000,000 ");
      System.out.println("Amount of Time it Takes to Run 500 Trials: Worst Case Scenario");
      System.out.print("LinSearch (Target Location: Not in Array)... ");

      long Lin25mil = testLinSearch(Arr2, 25_000_000);
      System.out.println(Lin25mil);

      System.out.print("BinSearch (Target Location: Not in Array)... ");

      long Bin25mil = testBinSearch(Arr2, 25_000_000);
      System.out.println(Bin25mil);

      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

      Comparable[] Arr3 = new Comparable[50_000_000];
      for (int i = 0; i < 50_000_000; i++) { ////create and fills an array with 50,000,000 consecutive integers
          Arr3[i] = i;
      }

      System.out.println("Length of Array: 50,000,000 ");
      System.out.println("Amount of Time it Takes to Run 500 Trials: Worst Case Scenario");
      System.out.print("LinSearch (Target Location: Not in Array)... ");

      long Lin50mil = testLinSearch(Arr3, 50_000_000);
      System.out.println(Lin50mil);

      System.out.print("BinSearch (Target Location: Not in Array)... ");

      long Bin50mil = testBinSearch(Arr3, 50_000_000);
      System.out.println(Bin50mil);

      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

  }

}
