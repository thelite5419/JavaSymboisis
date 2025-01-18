
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

---

# Java Full Stack Development Notes  Day3

## **1. Types of Variables in Java**  

Java has three types of variables:  
1. **Static Variables (Class Variables)**  
2. **Instance Variables (Object Variables)**  
3. **Local Variables (Method/Block Variables)**  

---

### **1.1 Static Variables**  
- Declared using the `static` keyword inside a class.  
- Shared among all objects of the class (single copy for the entire class).  
- Memory is allocated only once, at class loading time.  
- Can be accessed using `ClassName.variableName`.  

#### **Example:**
```java
class StaticExample {
    static int count = 0; // Static variable

    StaticExample() {
        count++; // Increments for every object
    }

    void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();

        obj1.displayCount(); // Output: 2
        obj2.displayCount(); // Output: 2 (Same value for all objects)
    }
}
```
📌 **Note:** All objects share the same value of the static variable.  

---

### **1.2 Instance Variables**  
- Declared without `static`, inside a class but outside methods.  
- Each object gets its own copy of the instance variable.  
- Memory is allocated when an object is created and deallocated when the object is destroyed.  

#### **Example:**
```java
class InstanceExample {
    int number = 10; // Instance variable

    void displayNumber() {
        System.out.println("Number: " + number);
    }
}

public class Main {
    public static void main(String[] args) {
        InstanceExample obj1 = new InstanceExample();
        InstanceExample obj2 = new InstanceExample();

        obj1.number = 20; // Changes value only for obj1

        obj1.displayNumber(); // Output: 20
        obj2.displayNumber(); // Output: 10
    }
}
```
📌 **Note:** Each object has its own copy of instance variables.  

---

### **1.3 Local Variables**  
- Declared inside a method or a block.  
- Limited scope (cannot be accessed outside the block).  
- Must be initialized before use.  

#### **Example:**
```java
class LocalExample {
    void display() {
        int x = 50; // Local variable
        System.out.println("Local variable: " + x);
    }
}

public class Main {
    public static void main(String[] args) {
        LocalExample obj = new LocalExample();
        obj.display(); // Output: Local variable: 50
    }
}
```
📌 **Note:** The local variable `x` exists only within the `display()` method.  

---

## **2. Widening and Narrowing in Java**  

### **2.1 Widening (Automatic Type Conversion)**
- Small data types can be stored in larger data types **automatically**.  
- No explicit typecasting needed.  

#### **Conversion Order:**  
📌 `byte → short → int → long → float → double`  
📌 `char → int → float → double`  

#### **Example:**
```java
int num = 100;
double d = num; // Implicit conversion (int to double)
System.out.println(d); // Output: 100.0
```

---

### **2.2 Narrowing (Explicit Type Casting)**
- Large data types **must** be manually converted into smaller ones.  
- Requires **explicit typecasting** using `(datatype)`.  

#### **Example:**
```java
double d = 12.54;
float f = (float) d; // Explicit conversion
System.out.println(f); // Output: 12.54
```

---

## **3. Variable Scope in Java**  
- **Outer block variables** can be redeclared inside an inner block.  
- **Local variables take precedence** over outer variables inside the block.  

#### **Example:**
```java
class ScopeExample {
    int x = 10; // Instance variable

    void show() {
        int x = 20; // Local variable (higher priority)
        System.out.println(x); // Output: 20 (Local variable)
    }
}

public class Main {
    public static void main(String[] args) {
        ScopeExample obj = new ScopeExample();
        obj.show();
    }
}
```
📌 **Note:** Local variable `x` inside `show()` method overrides the instance variable.  

---

## **4. Operators in Java**  

### **4.1 Unary Operators**  
- Operates on a single operand.  
- **Examples:** `+`, `-`, `++`, `--`, `!`  

```java
int a = 5;
System.out.println(+a);  // Output: 5
System.out.println(-a);  // Output: -5
System.out.println(++a); // Output: 6 (Pre-increment)
System.out.println(a++); // Output: 6 (Post-increment)
System.out.println(!true); // Output: false
```

---

### **4.2 Binary Operators**  
- Operates on two operands.  
- **Categories:**  
  - **Arithmetic:** `+`, `-`, `*`, `/`, `%`  
  - **Logical:** `&&`, `||`, `!`  
  - **Bitwise:** `&`, `|`, `^`, `~`, `<<`, `>>`  

#### **Example:**
```java
int a = 10, b = 5;
System.out.println(a + b); // Output: 15
System.out.println(a & b); // Bitwise AND: Output 0
```

---

### **4.3 Ternary Operator (`?:`)**  
- Short-hand for `if-else`.  
- **Syntax:** `condition ? true_value : false_value;`  

#### **Example:**
```java
int age = 18;
String result = (age >= 18) ? "Adult" : "Minor";
System.out.println(result); // Output: Adult
```

---

## **5. Bitwise Operations in Java**  
- Used for manipulating individual bits of a number.  
- `&` (AND), `|` (OR), `^` (XOR), `~` (NOT).  

### **Using `Integer.toBinaryString()` to Convert to Binary**  
```java
System.out.println(Integer.toBinaryString(10)); // Output: 1010
System.out.println(Integer.toBinaryString(5));  // Output: 101
System.out.println(Integer.toBinaryString(10 & 5)); // Output: 0
```

**Explanation:**  
- `10 (1010)`  
- `5  (0101)`  
- `10 & 5` results in `0000` (Bitwise AND).  

---

# Java Full Stack Development Notes Day4
## **Reading Input in Java Using Different Methods**  

Java provides multiple ways to take input from the user. Below are examples using **Scanner, InputStreamReader with BufferedReader**, and `System.in.read()` for reading a **character**.  

---

### **1. Using Scanner Class**
The `Scanner` class is a simple way to take input in Java.

#### **Reading a String**
```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.next();  // Reads until space
        System.out.println("You entered: " + s);

        sc.close();
    }
}
```
📌 **`next()` reads only one word (stops at space).**  

#### **Reading a Character**
```java
import java.util.Scanner;

public class CharInputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); // Extracts the first character
        System.out.println("You entered: " + ch);

        sc.close();
    }
}
```
📌 **`charAt(0)` extracts the first character from the entered string.**  


### Accepting Characters with Scanner in Java

To accept a character in Java using the Scanner class, you can use the `next().charAt(0)` method. Here's how you can implement it:

1. **Import the Scanner class**:
   ```java
   import java.util.Scanner;
   ```

2. **Create a Scanner object**:
   ```java
   Scanner scanner = new Scanner(System.in);
   ```

3. **Prompt the user for input and read the character**:
   ```java
   System.out.print("Enter a character: ");
   char input = scanner.next().charAt(0);
   ```

4. **Close the scanner**:
   ```java
   scanner.close();
   ```

Here is a complete example:

```java
import java.util.Scanner;

public class CharInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);

        System.out.println("You entered: " + input);

        scanner.close();
    }
}
```

This code prompts the user to enter a character, reads the input as a string using `next()`, and then extracts the first character of the string using `charAt(0)`. The character is then printed to the console.

---

### **2. Using InputStreamReader and BufferedReader**
BufferedReader allows reading an entire line or a word efficiently.

#### **Example: Reading a String Using BufferedReader**
```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string: ");
        String s = br.readLine(); // Reads an entire line including spaces
        System.out.println("You entered: " + s);
    }
}
```
📌 **`readLine()` reads the full line (including spaces) until Enter is pressed.**  

---

### **3. Difference Between `next()` and `nextLine()`**
- `next()` → Reads **only one word** (stops at space).  
- `nextLine()` → Reads **the entire line** including spaces.  

#### **Example:**
```java
import java.util.Scanner;

public class ScannerDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string using next(): ");
        String s1 = sc.next(); // Reads until space
        System.out.println("Using next(): " + s1);

        sc.nextLine(); // Clear the buffer

        System.out.print("Enter a string using nextLine(): ");
        String s2 = sc.nextLine(); // Reads entire line
        System.out.println("Using nextLine(): " + s2);

        sc.close();
    }
}
```
📌 **Always use `sc.nextLine()` after `sc.next()` to clear the buffer.**  

---

### **4. Reading a Character Using `System.in.read()`**
This method reads a **single byte** (ASCII value) and must be typecast to `char`.

#### **Example:**
```java
import java.io.IOException;

public class ReadCharacter {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter a character: ");
        char ch2 = (char) System.in.read(); // Reads only one character
        System.out.println("You entered: " + ch2);
    }
}
```
📌 **This method reads one character but also captures the Enter key (`\n`).**  

---

### **Summary of Input Methods**
| **Method**                 | **Reads**                | **Stops at**       |
|----------------------------|-------------------------|--------------------|
| `Scanner.next()`           | One word (String)       | Space             |
| `Scanner.nextLine()`       | Full line (String)      | Enter key         |
| `Scanner.next().charAt(0)` | First character (char)  | -                 |
| `BufferedReader.readLine()`| Full line (String)      | Enter key         |
| `System.in.read()`         | Single character (ASCII)| Enter key         |
