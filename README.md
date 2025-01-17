
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


---
# Java Full Stack Development Notes day2

## 1. **JAR (Java Archive) Format**  
- A **JAR file** (`.jar`) is essentially a **ZIP file** containing Java class files, metadata, and resources (such as images and configuration files).  
- It is used for **packaging and distributing** Java applications or libraries.  
- The JAR format allows **compression**, making Java applications portable and efficient.  

### Example: Creating and Running a JAR File  
1. **Compile the Java Program:**  
   ```sh
   javac MyProgram.java
   ```
2. **Create a JAR File:**  
   ```sh
   jar cvf MyProgram.jar MyProgram.class
   ```
3. **Run the JAR File:**  
   ```sh
   java -jar MyProgram.jar
   ```  

---

## 2. **Naming Conventions in Java**  

### 2.1 **Camel Case**  
- Used for **variables** and **methods**.  
- The first word starts with a lowercase letter, and subsequent words start with uppercase letters.  
- **Example:**  
  ```java
  int studentAge;
  void getStudentDetails() { }
  ```

### 2.2 **Pascal Case**  
- Used for **class names** and **interfaces**.  
- Every word starts with an uppercase letter.  
- **Example:**  
  ```java
  class StudentDetails { }
  interface DataHandler { }
  ```

### 2.3 **Snake Case (Not Common in Java)**  
- Uses underscores between words (e.g., `student_age`).  

### 2.4 **Kebab Case (Not Used in Java)**  
- Uses hyphens (`-`) between words (e.g., `student-age`). Not valid in Java.  

---

## 3. **Java Tools & Components**  

### 3.1 **`javac` (Java Compiler)**  
- Converts Java source code (`.java` files) into bytecode (`.class` files).  

### 3.2 **Java Application Launcher (`java`)**  
- Runs Java applications by executing the bytecode inside the JVM.  
- **Example:**  
  ```sh
  java MyProgram
  ```

### 3.3 **Java Debugger (`jdb`)**  
- A tool used for debugging Java programs by setting breakpoints and monitoring execution.  

### 3.4 **Java Archive (`jar`)**  
- Bundles multiple Java files into a **JAR file** for easy distribution.  

### 3.5 **Java Documentation (`javadoc`)**  
- Generates HTML documentation from Java source code comments.  
- **Example:**  
  ```sh
  javadoc MyProgram.java
  ```

---

## 4. **Common Java Packages**  

### 4.1 **`java.lang`**  
- Automatically imported and contains core classes like `String`, `Math`, `Integer`, and `System`.  

### 4.2 **`java.io`**  
- Handles input and output operations (`File`, `BufferedReader`, `PrintWriter`).  

### 4.3 **`java.util`**  
- Provides utility classes like `ArrayList`, `HashMap`, `Date`, `Collections`.  

### 4.4 **`java.awt`**  
- Used for GUI components (`Button`, `Frame`, `Label`).  

### 4.5 **`java.sql`**  
- Manages database operations (`Connection`, `Statement`, `ResultSet`).  

### 4.6 **`javax.swing`**  
- Provides advanced GUI components (`JButton`, `JFrame`, `JTable`).  

### 4.7 **`java.net`**  
- Supports networking (`Socket`, `URL`, `HttpURLConnection`).  

---

## 5. **Java Keywords and Literals**  

### 5.1 **Java has 53 keywords**, including:  
- `class`, `static`, `public`, `private`, `if`, `else`, `switch`, `for`, `while`, `return`, etc.  

### 5.2 **Java Literals (Fixed Values)**  
- `true`, `false` (Boolean literals).  
- `null` (Represents the absence of a value).  

---

## 6. **Identifiers in Java**  
- Identifiers are **names given to variables, methods, classes, and objects**.  
- **Rules for Identifiers:**  
  - Can contain letters, digits, `_`, and `$`.  
  - Cannot start with a digit.  
  - Cannot be a Java keyword.  
  - Case-sensitive (`Student` and `student` are different).  

**Valid Identifiers:**  
```java
int studentAge;
String _name;
double $salary;
```
**Invalid Identifiers:**  
```java
int 2marks;  // Starts with a number
double class;  // 'class' is a keyword
```

---

## 7. **Data Types in Java**  

### 7.1 **Primitive Data Types** (Stores single values)  
| Type     | Size  | Example     |
|----------|------|-------------|
| `byte`   | 1B  | `byte b = 10;` |
| `short`  | 2B  | `short s = 500;` |
| `int`    | 4B  | `int num = 100;` |
| `long`   | 8B  | `long bigNum = 100000L;` |
| `float`  | 4B  | `float f = 5.75f;` |
| `double` | 8B  | `double d = 99.99;` |
| `char`   | 2B  | `char letter = 'A';` |
| `boolean`| 1B  | `boolean isTrue = true;` |

### 7.2 **Non-Primitive Data Types** (Stores objects)  
- **Examples:** `String`, `Array`, `Class`, `Interface`  
```java
String name = "Java";
int[] numbers = {1, 2, 3};
```

---

## 8. **Wrapper Classes**  

### 8.1 **Why Use Wrapper Classes?**  
- Convert primitive types into objects (`int → Integer`).  
- Provide useful methods (e.g., parsing strings to numbers).  

### 8.2 **Examples of Wrapper Classes**  
```java
// Integer Wrapper Class
Integer num = Integer.valueOf(10);
int n = num.intValue();

// Long Wrapper Class
Long longNum = Long.valueOf(100000L);
long l = longNum.longValue();

// Character Wrapper Class
Character ch = Character.valueOf('A');
char c = ch.charValue();
```

---

## 9. **Java Supports a Unique Coding System**  
- Java supports **Unicode** characters, allowing it to handle different languages and symbols globally.  

---

## 10. **Object Class & Storing Any Value**  

### 10.1 **Object Class in Java**  
- **Every class in Java extends `Object` class** by default.  
- **Any type of value can be stored in an `Object` type variable** (autoboxing).  

### 10.2 **Example: Storing Different Data Types in `Object`**  
```java
public class ObjectExample {
    public static void main(String[] args) {
        Object o1 = 10;
        System.out.println(o1); // Output: 10

        Object o2 = 1.20;
        System.out.println(o2); // Output: 1.20

        Object o3 = 125478524985646451698L;
        System.out.println(o3); // Output: 125478524985646451698

        Object o4 = "dfnd";
        System.out.println(o4); // Output: dfnd
    }
}
```
**Explanation:**  
- `Object` can hold `int`, `double`, `long`, and `String` values.  
- Java uses **autoboxing** to convert primitive types into their wrapper objects automatically.  
