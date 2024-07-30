# clj-virtual-threads
An experiment with Java21 Virtual Threads and Clojure

## Running

Using the Clojure [CLI](https://clojure.org/guides/deps_and_cli), you can run this program like so:

```sh
clj src/main.clj
```

## Results

```
count:  100000
virtual start time (ms):  1722372051538
virtual end time (ms):  1722372051964
virtual elapsed time (ms):  426
count:  100000
virtual start time (ms):  1722372051973
virtual end time (ms):  1722372056862
virtual elapsed time (ms):  4889
```
