## Explanation and complexity

  I am taking every node till the penultimate node (count of this process is n-1, where n is length of array)
 and get the minimum node value after current node value in array, namely checking with every node value started
 from next of current node value till the end (time complexity of this process is O(n)).
  So we get (n-1)n complexity steps: (n-1)n = n²-n ~ n² => The time complexity is O(n²).
##  TIME COMPLEXITY IS ALWAYS: O(n²), also when array is sorted.
##  I am doing changes in current array, so i don't use additional memory, only temp variable.
