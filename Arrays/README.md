# Java Arrays

Arrays in Java are objects that store multiple variables of the same type. They are a fundamental part of the language and provide a way to organize data efficiently. Below are some key aspects and features of Java arrays.

## Key Features of Java Arrays:

1. **Fixed Size**: Once an array is created, its size cannot be changed. The size must be specified at the time of creation.
   
2. **Indexed Access**: Elements in an array are accessed using an index, starting from 0 to the length of the array minus one.

3. **Homogeneous Elements**: All elements in an array must be of the same type (e.g., all integers, all strings).

4. **Efficient Storage**: Arrays provide efficient storage and retrieval of data.

## Creating Arrays:

### Declaring and Initializing an Array:

#### Single-Dimensional Array:

```java
int[] numbers = new int[5]; // Declaration with size
int[] primes = {2, 3, 5, 7, 11}; // Declaration with initialization
```

#### Multi-Dimensional Array:

```java
int[][] matrix = new int[3][3]; // 2D array declaration with size
int[][] identityMatrix = {
    {1, 0, 0},
    {0, 1, 0},
    {0, 0, 1}
}; // 2D array declaration with initialization
```
## Commonly Used Methods:

### Getting the Length of an Array:

```java
int length = numbers.length;
```

### Accessing Elements:

```java
int firstPrime = primes[0]; // Accessing the first element
```

### Modifying Elements:

```java
numbers[0] = 42; // Modifying the first element
```
### Iterating Over an Array:

#### Using a For Loop:

```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

#### Using For-Each Loop:

```java
for (int prime : primes) {
    System.out.println(prime);
}
```
## Example Code:

```java
public class ArrayExample {
    public static void main(String[] args) {
        // Single-dimensional array
        int[] numbers = new int[5];
        numbers[0] = 42;
        numbers[1] = 7;
        numbers[2] = 13;
        numbers[3] = 24;
        numbers[4] = 5;
        
        // Print elements using a for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        
        // Print elements using a for-each loop
        System.out.println("Elements in numbers array:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Multi-dimensional array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print 2D array elements
        System.out.println("Matrix elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

## Conclusion

Arrays in Java provide a powerful and efficient way to handle multiple variables of the same type. 
They are a fundamental data structure that allows for indexed access and efficient storage of homogeneous elements. 
Understanding how to declare, initialize, and manipulate arrays is crucial for effective Java programming.
