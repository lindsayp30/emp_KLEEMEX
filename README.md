# KLEEMEX -- Lindsay Phung, May Qiu, Xinqing Lin (Duckies: Tommy, Perry Jr., Horse)

### Tests Performed
Recording Worst Cases

BinSearch and LinSearch (last index for each)

Each Run 500 Times with Accumulated Time Recorded for the Length of the (500) Trials
- Array Size: 10,000,000
- Array Size: 25,000,000
- Array Size: 50,000,000

### Results
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Ignore this trial
Length of Array: 10
Amount of Time it Takes to Run 500 Trials: Worse Case Scenario
LinSearch (Last Index)... 1
BinSearch (Last Index)... 1
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Length of Array: 1,000,000
Amount of Time it Takes to Run 500 Trials: Worse Case Scenario
LinSearch (Last Index)... 575
BinSearch (Last Index)... 0
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Length of Array: 10,000,000
Amount of Time it Takes to Run 500 Trials: Worse Case Scenario
LinSearch (Last Index)... 7860
BinSearch (Last Index)... 0
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Length of Array: 25,000,000
Amount of Time it Takes to Run 500 Trials: Worse Case Scenario
LinSearch (Last Index)... 21408
BinSearch (Last Index)... 0
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Length of Array: 50,000,000
Amount of Time it Takes to Run 500 Trials: Worse Case Scenario
LinSearch (Last Index)... 41526
BinSearch (Last Index)... 0
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

### Conclusions
- BinSearch is indeed faster than LinSearch relative to all of the array sizes.
- Upon discovering that the first test utilizing BinSearch yields a ms greater than 0 while preceeding test cases with greater sized arrays yield a ms of 0, we think that this is due to a sort of initial processing. As David Chen has commented on Piazza, this may be just the program initially loading the class. The time spent would explain how there is a ms greater than 0 for all first test runs.  
