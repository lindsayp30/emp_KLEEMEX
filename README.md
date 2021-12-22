# KLEEMEX -- Lindsay Phung, May Qiu, Xinqing Lin (Duckies: Tommy, Perry Jr., Horse)

### Tests Performed
Recording Worst Cases

BinSearch and LinSearch (target not in array)

Each Run 500 Times with Accumulated Time Recorded for the Length of the (500) Trials
- Array Size: 1,000,000
- Array Size: 10,000,000
- Array Size: 25,000,000
- Array Size: 50,000,000

### Results
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Ignore this trial
Length of Array: 10
Amount of Time it Takes to Run 500 Trials: Worse Case Scenario
LinSearch (Target Location: Not in Array)... 1
BinSearch (Target Location: Not in Array)... 1
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Length of Array: 1,000,000
Amount of Time it Takes to Run 500 Trials: Worse Case Scenario
LinSearch (Target Location: Not in Array)... 626
BinSearch (Target Location: Not in Array)... 0
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Length of Array: 10,000,000
Amount of Time it Takes to Run 500 Trials: Worse Case Scenario
LinSearch (Target Location: Not in Array)... 9365
BinSearch (Target Location: Not in Array)... 0
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Length of Array: 25,000,000
Amount of Time it Takes to Run 500 Trials: Worse Case Scenario
LinSearch (Target Location: Not in Array)... 23457
BinSearch (Target Location: Not in Array)... 0
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Length of Array: 50,000,000
Amount of Time it Takes to Run 500 Trials: Worse Case Scenario
LinSearch (Target Location: Not in Array)... 42227
BinSearch (Target Location: Not in Array)... 1
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

### Conclusions
- BinSearch is indeed faster than LinSearch relative to all of the array sizes.
- BinSearch performs Log2(array size) compared to LinSearch, which performs one-by-one. This is why BinSearch takes a significantly less amount of time.
