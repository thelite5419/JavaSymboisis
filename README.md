
# Java Full Stack Development 
## 1. **Importing Java Libraries**

The `import java.lang.*` statement is used to include all the classes from the `java.lang` package in the program.  
The `java.lang` package is automatically imported in every Java program, so this line is optional.  
It provides essential classes such as `String`, `Math`, `Integer`, and `System`.

---

## 2. **Basic Java Program**

### Code:
```java
import java.lang.*; // Optional import, as java.lang is included by default
class Test1 {
    public static void main(String[] args) {
        System.out.println("Hello World"); // Prints "Hello World" to the console
    }
}
```

### Explanation:
1. **`import java.lang.*`:** Includes all classes from the `java.lang` package.
2. **`class Test1 {}`:** Defines a class named `Test1`. All Java code must be inside a class.
3. **`public static void main(String[] args)`:**  
   - **`public`:** Makes the method accessible from anywhere.  
   - **`static`:** Allows the method to run without creating an object of the class.  
   - **`void`:** Indicates that the method does not return a value.  
   - **`main`:** The entry point of any Java program.  
   - **`String[] args`:** Used to pass command-line arguments to the program.
4. **`System.out.println("Hello World");`:**  
   - `System`: A class in `java.lang` used for system-related functions.  
   - `out`: A static member of the `System` class that represents the standard output stream.  
   - `println`: A method that prints the message to the console and moves to the next line.

---

## 3. **Static vs Non-Static Members**

### 3.1 **Static Members**
- Static members belong to the class and are shared by all objects of the class.
- They are accessed without creating an object of the class.
- Use the `static` keyword to declare static members.

#### Example:
```java
class StaticExample {
    static int counter = 0; // Static variable

    static void displayCount() { // Static method
        System.out.println("Counter: " + counter);
    }
}
public class Main {
    public static void main(String[] args) {
        StaticExample.counter = 5; // Access static variable
        StaticExample.displayCount(); // Access static method
    }
}
```

### 3.2 **Non-Static Members**
- Non-static members belong to individual objects of the class.
- Memory is allocated for non-static members when an object is created.

#### Example:
```java
class NonStaticExample {
    int number = 10; // Non-static variable

    void displayNumber() { // Non-static method
        System.out.println("Number: " + number);
    }
}
public class Main {
    public static void main(String[] args) {
        NonStaticExample obj = new NonStaticExample(); // Create an object
        obj.displayNumber(); // Access non-static method
    }
}
```

---

## 4. **Steps to Create an Object**

To create an object in Java, follow these steps:
1. **Class Definition:** Define the class.
2. **Reference Declaration:** Declare a reference variable to refer to the object.
3. **Object Creation:** Use the `new` keyword to allocate memory for the object.
4. **Constructor Call:** The constructor initializes the object.

### Example:
```java
class Test7 {
    int x; // Non-static member

    Test7() { // Constructor
        x = 10; // Initialize the member
    }
}
public class Main {
    public static void main(String[] args) {
        Test7 t1 = new Test7(); // Step-by-step breakdown:
        // 1. Declare a reference: Test7 t1
        // 2. Allocate memory: new Test7()
        // 3. Initialize object with the constructor

        System.out.println("Value of x: " + t1.x); // Access non-static member
    }
}
```

### Key Points:
- **`Test7 t1;`**: Declares a reference variable of type `Test7`.
- **`new Test7();`**: Allocates memory and calls the constructor.
- **Constructor:** Initializes non-static members and assigns default values (if not explicitly initialized).
