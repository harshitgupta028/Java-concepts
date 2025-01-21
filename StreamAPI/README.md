# Stream API

Introduced in Java 8.
Streams are not a data structure its a pipeline on which we can perform certain operations

## Stream Creation

We can create the stream from various sources.

1. From Collections
2. From Arrays
3. Using Stream API methods
4. Infinite Stream

## Intermediate Operations

There are certain intermediate operations which can filter or transform stream

1. `filter`: Filter element based on a condition.
2. `map`: Transform element into another form.
3. `flatMap`: Flatten nested condition into a single stream.
4. `distinct`: Removes duplicates.
5. `sorted`: Sort elements.
6. `limit` and `skip`: Controll the size of a stream.

## Terminal Operations

These are the operations which are applied after the intermediate operations to consume or collect the result of streams

1. `collect`: Gather elements into a collection (e.g.: `List`, `Set`, `Map`)
2. `forEach`: performs the action on each element.
3. `reduce`: Aggreate the elements into a single value.
4. `count`: Count the number of elements.
5. `toArray`: Convert the stream to an array.
6. `anyMatch`, `allMatch` and `noneMatch`: Used to check if a given predicate matches any, all, or none of the elements in a stream

## Stream API coding questions

1. Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
3. How to find duplicate elements in a given integers list in java using Stream functions?
4. Given the list of integers, find the first element of the list using Stream functions?
5. Given a list of integers, find the total number of elements present in the list using Stream functions?
6. Given a list of integers, find the maximum value element present in it using Stream functions?
7. Given a String, find the first non-repeated character in it using Stream functions?
8. Given a String, find the first repeated character in it using Stream functions?
9. Given a list of integers, sort all the values present in it using Stream functions?
10. Given a list of integers, sort all the values present in it in descending order using Stream functions?
11. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
12. How will you get the current date and time using Java 8 Date and Time API?
13. Write a Java 8 program to concatenate two Streams?
14. Java 8 program to perform cube on list elements and filter numbers greater than 50.
15. Write a Java 8 program to sort an array and then convert the sorted array into Stream?
16. How to use map to convert object into Uppercase in Java 8?
17. How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
18. How to count each element/word from the String ArrayList in Java8?
19. How to find only duplicate elements with its count from the String ArrayList in Java8?
20. How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
21. Write a Program to find the Maximum element in an array?
22. Write a program to print the count of each character in a String?
