# clj-virtual-threads
An experiment with Java21 Virtual Threads and Clojure. Both examples just update an `atom` counter.

## Running

Using the Clojure [CLI](https://clojure.org/guides/deps_and_cli), you can run this program like so:

```sh
clj src/main.clj
```

## Results

I ran this on my current laptop with these specs
![CleanShot 2024-07-31 at 10 49 58](https://github.com/user-attachments/assets/bdcb6af4-fae5-4fbc-97e6-e0da467f7846)


```
count:  100000
virtual start time (ms):  1722372051538
virtual end time (ms):  1722372051964
virtual elapsed time (ms):  426
count:  100000
real start time (ms):  1722372051973
real end time (ms):  1722372056862
real elapsed time (ms):  4889
```
