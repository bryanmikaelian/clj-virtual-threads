# clj-virtual-threads
An experiment with Java21 Virtual Threads and Clojure. Both examples just update an `atom` counter over 100000 threads, comparing the execution time between a virtual thread and a "real" thread.

## Running

Using the Clojure [CLI](https://clojure.org/guides/deps_and_cli), you can run this program like so:

```sh
clj src/main.clj
```

## Results

### M3 Mac
![CleanShot 2024-07-31 at 10 49 58](https://github.com/user-attachments/assets/bdcb6af4-fae5-4fbc-97e6-e0da467f7846)


```
count:  100000
virtual start time (ms):  1722446540075
virtual end time (ms):  1722446540306
virtual elapsed time (ms):  231
count:  100000
real start time (ms):  1722446540311
real end time (ms):  1722446543667
real elapsed time (ms):  3356
```

### Intel Mac
<img width="351" alt="Screen Shot 2024-07-31 at 2 13 07 PM" src="https://github.com/user-attachments/assets/ec551acc-b7b7-4d47-905e-97346ffb6204">

```
count:  100000
virtual start time (ms):  1722449512852
virtual end time (ms):  1722449513318
virtual elapsed time (ms):  466
count:  100000
real start time (ms):  1722449513330
real end time (ms):  1722449520618
real elapsed time (ms):  7288
```
