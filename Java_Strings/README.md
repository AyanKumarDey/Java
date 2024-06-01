# Java Strings

Strings in Java are objects that represent sequences of characters. The `String` class is part of the `java.lang` package and provides various methods for manipulating and handling strings. Below are some key aspects and features of Java strings.

## Key Features of Java Strings:

1. **Immutable**: Strings in Java are immutable, meaning once a string is created, its value cannot be changed. Any modification to a string creates a new string object.
   
2. **String Pool**: Java optimizes memory usage by storing string literals in a common pool. If two string literals have the same value, they will reference the same object in the string pool.

3. **Rich API**: The `String` class provides a wide range of methods for string manipulation, including comparison, searching, substring extraction, and more.

4. **Supported by Operators**: Java allows string concatenation using the `+` operator and supports the `==` operator for reference comparison.

## Creating Strings:

```java
String str1 = "Hello, World!";
```
## Commonly Used Methods:

### Length of a String:

```java
int length = str1.length();
```
### Character at a Specific Index:

```java
char ch = str1.charAt(0); // 'H'
```
### Substring:

```java
String subStr = str1.substring(7, 12); // "World"
```
### String Comparison:

#### Equals:

```java
boolean isEqual = str1.equals(str2);
```
#### Equals Ignoring Case:

```java
boolean isEqualIgnoreCase = str1.equalsIgnoreCase("hello, world!");
```
### Concatenation:

```java
String str3 = str1.concat(" How are you?");
```
## Example Code with methods in String:-

```java
import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = new String("Hello, World!");

        // Length of the string
        int length = str1.length();
        System.out.println("Length: " + length);

        // Character at index 0
        char ch = str1.charAt(0);
        System.out.println("Character at index 0: " + ch);

        // Substring from index 7 to 12
        String subStr = str1.substring(7, 12);
        System.out.println("Substring: " + subStr);

        // String comparison
        boolean isEqual = str1.equals(str2);
        System.out.println("Are str1 and str2 equal? " + isEqual);

        // Concatenation
        String str3 = str1.concat(" How are you?");
        System.out.println("Concatenated string: " + str3);

        // String replacement
        String replacedStr = str1.replace("World", "Java");
        System.out.println("Replaced string: " + replacedStr);

        // Splitting the string
        String[] words = str1.split(", ");
        System.out.println("Split words: " + Arrays.toString(words));

        // Convert to upper and lower case
        String upperStr = str1.toUpperCase();
        String lowerStr = str1.toLowerCase();
        System.out.println("Uppercase string: " + upperStr);
        System.out.println("Lowercase string: " + lowerStr);

        // Trim whitespace
        String trimmedStr = str1.trim();
        System.out.println("Trimmed string: " + trimmedStr);
    }
}
```

## Conclusion

Strings in Java are a powerful and flexible way to handle text. With the String class's immutability and rich set of methods, developers can efficiently manipulate and process strings. Understanding these methods and their uses is crucial for effective Java programming.
