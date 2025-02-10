
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

--- 


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


---

# Java Full Stack Development Notes Day5

## **1. If-Else and Else-If Statements**  
Conditional statements allow the program to execute a block of code based on certain conditions.

### **1.1 If-Else Statement**  
- **Syntax:**  
```java
if (condition) {
    // Code executes if condition is true
} else {
    // Code executes if condition is false
}
```
- **Example:**  
```java
public class IfElseExample {
    public static void main(String[] args) {
        int age = 18;

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
```
- **Output:**  
```
You are eligible to vote.
```

---

### **1.2 Else-If Ladder**  
- **Used when there are multiple conditions to check.**  
- **Syntax:**  
```java
if (condition1) {
    // Code for condition1
} else if (condition2) {
    // Code for condition2
} else {
    // Code if all conditions fail
}
```
- **Example:**  
```java
public class ElseIfExample {
    public static void main(String[] args) {
        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}
```
- **Output:**  
```
Grade: B
```

---

## **2. Ternary Operator (`?:`)**  
The ternary operator is a **shorter** way to write `if-else` statements.

### **2.1 Syntax:**  
```java
variable = (condition) ? true_value : false_value;
```

### **2.2 Example:**  
```java
public class TernaryExample {
    public static void main(String[] args) {
        int num = 10;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
```
- **Output:**  
```
Even
```

---

## **3. Nested Ternary Operator**  
Ternary operators can be **nested** to check multiple conditions.

### **Example: Finding the Largest of Three Numbers**  
```java
public class NestedTernaryExample {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        String largest = (a > b && a > c) ? (a + " is largest") 
                     : (b > c) ? (b + " is largest") 
                               : (c + " is largest");

        System.out.println(largest);
    }
}
```
- **Output:**  
```
25 is largest
```

---

## **4. Switch Case Statement**  
- **Used when there are multiple conditions based on a single variable.**  
- **In Java, switch can work with:**  
  - `byte`, `short`, `int`, `char`, `String`, `enum`

### **4.1 Syntax:**  
```java
switch (expression) {
    case value1:
        // Code for value1
        break;
    case value2:
        // Code for value2
        break;
    default:
        // Code if no case matches
}
```

### **4.2 Example:**  
```java
import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day number (1-3): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day number");
        }

        sc.close();
    }
}
```
- **Input:**  
```
2
```
- **Output:**  
```
Tuesday
```

📌 **Note:**  
- `break;` **stops execution** after a case is matched.  
- `default:` executes when no case matches.  
- **In Java, `String` is allowed in switch cases, but in C/C++ it is not.**

---

## **5. Date Calculation in Java**  

Java provides the `LocalDate` and `Period` classes to work with dates.

### **5.1 Example: Calculating Age from Birthdate**  
```java
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birthdate (yyyy-MM-dd): ");
        String s = sc.next(); // Read date as string

        LocalDate birthDate = LocalDate.parse(s); // Convert to LocalDate
        LocalDate currentDate = LocalDate.now(); // Get today's date

        Period age = Period.between(birthDate, currentDate); // Calculate difference

        System.out.println("You are " + age.getYears() + " years, " 
                           + age.getMonths() + " months, and " 
                           + age.getDays() + " days old.");

        sc.close();
    }
}
```
- **Input:**  
```
2000-05-20
```
- **Output:**  
```
You are 24 years, 7 months, and 28 days old.
```

📌 **Explanation:**  
- `LocalDate.parse(s)` converts a string date (`yyyy-MM-dd`) into a `LocalDate` object.  
- `LocalDate.now()` gives today's date.  
- `Period.between(birthDate, currentDate)` calculates the difference in **years, months, and days**.  


---

# Java Full Stack Development Notes Day6
## **For Loop in Java with `break` and `continue`**  

The `for` loop is used when the number of iterations is known. The loop consists of three parts:  
1. **Initialization** (Executes once before the loop starts)  
2. **Condition** (Checks before each iteration)  
3. **Increment/Decrement** (Updates loop control variable)  

---

## **1. Syntax of `for` Loop**  
```java
for (initialization; condition; update) {
    // Code to execute in each iteration
}
```

### **Example: Basic For Loop**  
```java
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }
    }
}
```
**Output:**  
```
Iteration: 1  
Iteration: 2  
Iteration: 3  
Iteration: 4  
Iteration: 5  
```

---

## **2. Using `break` in a `for` Loop**  
- The `break` statement **terminates** the loop immediately when executed.  

### **Example: Stopping Loop at a Certain Condition**  
```java
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Loop breaks at i = " + i);
                break; // Stops the loop when i == 6
            }
            System.out.println("i = " + i);
        }
    }
}
```
**Output:**  
```
i = 1  
i = 2  
i = 3  
i = 4  
i = 5  
Loop breaks at i = 6  
```
📌 **Explanation:** The loop stops when `i == 6`, skipping the rest of the iterations.

---

## **3. Using `continue` in a `for` Loop**  
- The `continue` statement **skips** the current iteration and moves to the next one.

### **Example: Skipping a Specific Value**  
```java
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Skipping i = " + i);
                continue; // Skips printing 5 and moves to next iteration
            }
            System.out.println("i = " + i);
        }
    }
}
```
**Output:**  
```
i = 1  
i = 2  
i = 3  
i = 4  
Skipping i = 5  
i = 6  
i = 7  
i = 8  
i = 9  
i = 10  
```
📌 **Explanation:** When `i == 5`, `continue` is executed, skipping the rest of the code for that iteration.

---

## **4. Using `break` and `continue` Together**
### **Example: Print Only Even Numbers, Stop at 8**
```java
public class BreakContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue; // Skip odd numbers
            }
            if (i == 8) {
                System.out.println("Stopping at i = " + i);
                break; // Stop the loop at 8
            }
            System.out.println("Even number: " + i);
        }
    }
}
```
**Output:**  
```
Even number: 2  
Even number: 4  
Even number: 6  
Stopping at i = 8  
```
📌 **Explanation:**  
- **`continue`** skips odd numbers.  
- **`break`** stops the loop when `i == 8`.  

---

# Java Full Stack Development Notes day7
# **Arrays in Java**  

Arrays in Java are used to store multiple values of the same type in a **single variable**. They are **dynamically allocated** in the heap memory and provide **fast access** to elements using an index.  

---

## **1. Declaring Arrays in Java**  
There are multiple ways to declare arrays in Java:  

```java
int[] a;  // Preferred way
int a[];  // Allowed but less readable
int a[], b[], c[], x;  // a, b, c are arrays but x is a normal integer
```
📌 **Note:** Only `a, b, c` are arrays, `x` is just an integer.

---

## **2. Creating and Initializing Arrays**  

### **a) Allocating Memory for an Array**
```java
int a[] = new int[5];  // Array of size 5, default values are 0
```
📌 This will create an array of **size 5** where each element is initialized to `0`.  

**Incorrect Example (Compilation Error):**  
```java
int a[] = new int[];  // ❌ Error: Size must be specified
```

### **b) Initializing with Values**
```java
int a[] = {10, 20, 30};  // Direct initialization
int a[] = new int[]{10, 20, 30};  // Another correct way
```

### **c) Dynamic Array Size**
```java
int x = 5;
int a[] = new int[x];  // Allowed: x determines array size at runtime
```

---

## **3. Accessing Array Elements**  
Array elements are accessed using their **index**, starting from `0`.

### **Example: Accessing and Printing an Array**
```java
public class ArrayExample {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50}; 
        
        System.out.println("Array elements:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]); // Accessing each element
        }
    }
}
```
**Output:**  
```
Array elements:
10  
20  
30  
40  
50  
```

---

## **4. Using `for-each` Loop (Enhanced for Loop)**  
The `for-each` loop simplifies iteration over arrays.

### **Example: Using `for-each` Loop**
```java
public class ForEachExample {
    public static void main(String[] args) {
        int numbers[] = {5, 10, 15, 20, 25};
        
        System.out.println("Using for-each loop:");
        for (int num : numbers) {  // num takes values from numbers[]
            System.out.println(num);
        }
    }
}
```
**Output:**  
```
Using for-each loop:
5  
10  
15  
20  
25  
```
📌 **Advantages of `for-each` loop:**  
- No need for index management (`i` variable).  
- Best for reading array values (not modifying them).  

---

## **5. Converting Array to String (`Arrays.toString()`)**
```java
import java.util.Arrays;
public class ArrayToString {
    public static void main(String[] args) {
        int[] b = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(b));  // Converts array to string
    }
}
```
**Output:**  
```
[1, 2, 3, 4, 5]
```

---

## **6. Getting the Length of an Array**
```java
public class ArrayLengthExample {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        
        System.out.println("Length of array: " + a.length);
        
        System.out.println("Array elements using length:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
```
**Output:**  
```
Length of array: 5
Array elements using length:
10  
20  
30  
40  
50  
```
📌 **Key Point:** `a.length` returns the **total number of elements** in the array.

---

## **7. How Arrays are Stored in Memory (Heap vs Stack)**
### **Memory Allocation of Arrays in Java**
- Arrays in Java are **stored in heap memory**, which is dynamically allocated.
- The **array reference variable** is stored in **stack memory**.

### **Example of Heap Memory Allocation**
```java
public class ArrayMemory {
    public static void main(String[] args) {
        int[] arr = new int[3];  // Array is stored in Heap
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        
        System.out.println("First Element: " + arr[0]);
    }
}
```
📌 **Explanation:**  
- The reference `arr` is stored in **stack memory**.  
- The actual array `{10, 20, 30}` is stored in **heap memory**.  

### **Visualization of Memory**
| **Stack Memory (Stores Reference)** | **Heap Memory (Stores Data)** |
|------------------------------------|------------------------------|
| `arr` (points to heap memory) | `{10, 20, 30}` |

---

# Java Full Stack Development Notes day8
# **Multidimensional Arrays in Java**  

A **multidimensional array** is an array that contains other arrays as elements. The most common type is the **2D array**, but Java also supports **3D arrays** and **jagged arrays** (arrays with varying column sizes).  

---

## **1. Declaring Multidimensional Arrays**  

There are multiple ways to declare a **2D array**:  

```java
int a[][];       // Preferred way
int [][]a;       // Also valid
int [][][] a;    // 3D array
```

---

## **2. Initializing a 2D Array**  

### **a) Direct Initialization**
```java
int a[][] = {{1, 2, 3}, {4, 5, 6}};  // 2x3 matrix
```

### **b) Using `new` Keyword**
```java
int[][] b = new int[2][3];  // 2 rows, 3 columns
```

### **c) Assigning Values via Loop**
```java
import java.util.Scanner;

public class MultiArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c[][] = new int[2][3];  // 2 rows, 3 columns

        System.out.println("Enter elements:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = sc.nextInt();  // Taking input from user
            }
        }

        System.out.println("2D Array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```
📌 **Example Input:**
```
1 2 3
4 5 6
```
📌 **Output:**
```
2D Array:
1 2 3  
4 5 6  
```

---

## **3. Printing a Multidimensional Array using `Arrays.deepToString()`**
Instead of manually iterating over the array, we can use the `Arrays.deepToString()` method to print the entire 2D array easily.

```java
import java.util.Arrays;

public class DeepToStringExample {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        
        System.out.println(Arrays.deepToString(a));
    }
}
```
📌 **Output:**  
```
[[1, 2, 3], [4, 5, 6]]
```

---

## **4. Jagged Arrays (Irregular Columns)**
A **jagged array** is an array where **rows have different numbers of columns**.  

### **a) Initializing a Jagged Array**
```java
int a[][] = {
    {1, 2},  
    {3},  
    {4, 5, 6}  
};
```

### **b) Creating a Jagged Array Dynamically**
```java
int b[][] = new int[3][];  // 3 rows, columns will be defined later
b[0] = new int[2];  // Row 0 has 2 columns
b[1] = new int[4];  // Row 1 has 4 columns
b[2] = new int[6];  // Row 2 has 6 columns
```

### **c) Taking Input for a Jagged Array**
```java
import java.util.Scanner;

public class JaggedArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int b[][] = new int[3][];
        b[0] = new int[2];  // 2 columns in row 0
        b[1] = new int[4];  // 4 columns in row 1
        b[2] = new int[6];  // 6 columns in row 2

        System.out.println("Enter elements for jagged array:");

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = sc.nextInt();  // Taking input
            }
        }

        System.out.println("Jagged Array:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```
📌 **Example Input:**
```
1 2
3 4 5 6
7 8 9 10 11 12
```
📌 **Output:**
```
Jagged Array:
1 2  
3 4 5 6  
7 8 9 10 11 12  
```

---

## **5. Summary Table**
| **Concept** | **Syntax / Example** |
|------------|----------------------|
| **Declaring a 2D Array** | `int[][] a;` or `int a[][];` |
| **Initializing a 2D Array** | `int a[][] = {{1,2,3}, {4,5,6}};` |
| **Allocating Memory** | `int[][] b = new int[2][3];` |
| **Accessing Elements** | `a[i][j]` |
| **Printing using Loop** | `for(i=0; i < a.length; i++)` |
| **Printing using `deepToString()`** | `System.out.println(Arrays.deepToString(a));` |
| **Jagged Array Declaration** | `int[][] a = new int[3][];` |
| **Jagged Array Initialization** | `a[0] = new int[2];` |
| **Jagged Array Input** | `for (j=0; j < a[i].length; j++)` |

---

## **6. Key Takeaways**
✔ **Multidimensional arrays** allow you to store data in a grid-like format.  
✔ **Jagged arrays** have variable-length rows, making them memory efficient.  
✔ **`Arrays.deepToString()`** is useful for printing complex arrays.  
✔ **Nested loops** help in iterating over 2D and jagged arrays.  

🚀 **Now you are ready to work with multidimensional arrays in Java!**


---

# Java Full Stack Development Notes Day9
# **Java String Class Overview**  

In Java, the **`String`** class is a **final** and **immutable** class that represents a sequence of characters. It is defined as:  

```java
public final class String extends Object implements CharSequence, Serializable
```

This means:  
✔ **It cannot be inherited.**  
✔ **It extends `Object`.**  
✔ **Implements `CharSequence` & `Serializable`.**  

---

## **1. Ways to Create a String in Java**  

### **1️⃣ Using String Literals (Stored in String Constant Pool)**
```java
String s1 = "aher";
String s2 = "aher";  // Same reference as s1 (stored in SCP)
```
🔹 **Memory Optimization:** If `"aher"` already exists in the **String Constant Pool (SCP)**, the reference will be reused.  

### **2️⃣ Using `new` Keyword (Stored in Heap Memory)**
```java
String s3 = new String("aniket");  // Creates a new object in Heap
String s4 = new String(s3);        // Creates another copy in Heap
```
🔹 Unlike literals, these **are stored separately in Heap memory**, even if the content is the same.  

### **3️⃣ Using a Character Array**
```java
char ch[] = {'a', 'b', 'c', 'd', 'e'};
String s5 = new String(ch);       // "abcde"
String s6 = new String(ch, 2, 3); // "cde" (Starting from index 2, length 3)
```

### **4️⃣ Using a Byte Array (ASCII Representation)**
```java
byte b[] = {101, 102, 103, 105};
String s7 = new String(b);       // "efgi"
String s8 = new String(b, 2, 2); // "gi"
```

### **5️⃣ Converting `StringBuilder` & `StringBuffer` to `String`**
```java
StringBuilder sb = new StringBuilder("amwy");
String s9 = new String(sb);  // Converts StringBuilder to String

StringBuffer sh = new StringBuffer("hekk");
String s10 = new String(sh);  // Converts StringBuffer to String
```

---

## **2. String Pool (Memory Optimization in Java)**
🔹 **String Constant Pool (SCP)** optimizes memory by storing only **one instance** of a string literal.  
🔹 If the string already exists, Java **reuses the reference** instead of creating a new object.  

📌 **Example:**
```java
String s1 = "karad";
String s2 = "karad";

if (s1 == s2) {
    System.out.println("Both have the same memory location");
}
```
✅ **Output:** `"Both have the same memory location"`  
➡ **Reason:** Both `s1` and `s2` point to the **same memory location in SCP**.

---

## **3. String Comparison Methods**
| **Method** | **Compares** | **Returns** |
|------------|-------------|-------------|
| `==` | Memory reference | `true` if same reference |
| `.equals()` | Content | `true` if same content |
| `.compareTo()` | Lexicographically | `0` if equal, `>0` or `<0` otherwise |

📌 **Example:**
```java
String s1 = "aher";
String s2 = "aher";
String s3 = new String("aher");

System.out.println(s1 == s2);        // true (Same SCP reference)
System.out.println(s1 == s3);        // false (Different memory locations)
System.out.println(s1.equals(s3));   // true (Same content)
System.out.println(s1.compareTo(s3));// 0 (Same lexicographic order)
```

---

## **4. String Methods (Non-Static)**
| **Method** | **Description** |
|------------|----------------|
| `toUpperCase()` | Converts to uppercase |
| `toLowerCase()` | Converts to lowercase |
| `length()` | Returns string length |
| `replace("a", "b")` | Replaces characters |
| `trim()` | Removes spaces from start & end |
| `substring(2,5)` | Extracts substring |
| `charAt(3)` | Returns character at index 3 |
| `indexOf('a')` | First occurrence index |
| `lastIndexOf('a')` | Last occurrence index |
| `equals("str")` | Checks content equality |
| `equalsIgnoreCase("STR")` | Ignores case difference |
| `compareToIgnoreCase("STR")` | Compares ignoring case |

📌 **Example:**
```java
String s = "  Hello World  ";
System.out.println(s.trim());       // "Hello World"
System.out.println(s.toUpperCase()); // "  HELLO WORLD  "
System.out.println(s.substring(2,7));// "Hello"
System.out.println(s.charAt(4));     // 'o'
```

---

## **5. String is Immutable in Java**
🔹 **Strings are immutable**, meaning their value **cannot be changed** after creation.  
🔹 Any modification **creates a new String object** instead of modifying the original.  

📌 **Example:**
```java
String s1 = "hello";
s1.toUpperCase();
System.out.println(s1); // Still "hello" (not modified)
```
✅ **Reason:** The `.toUpperCase()` method **returns a new string**, but we didn't store it.

---

## **6. Using `System.exit(0)`**
📌 **Terminates the entire program immediately.**
```java
System.out.println("Before Exit");
System.exit(0); // Program stops here
System.out.println("This will never execute");
```

---
![Image Alt Text](https://github.com/thelite5419/JavaSymboisis/blob/main/stringStoring.png)


# **String Storage in Java**  

## **Overview**  
This diagram illustrates how **Java stores strings** in memory, particularly focusing on the **Heap**, **String Constant Pool**, and the **Stack**.  

## **Key Concepts**  
1. **Heap Memory**  
   - When using `new String("aher")`, a new object is explicitly created in the heap.  
   - This leads to two memory allocations:  
     - One in the heap.  
     - One in the **String Constant Pool** (if it doesn’t already exist).  

2. **String Constant Pool (SCP)**  
   - Strings in Java are stored in a special memory area called the **String Constant Pool** to optimize memory usage.  
   - If a string already exists in the pool, Java **does not create a new object** but returns a reference to the existing one.  

3. **Stack Memory**  
   - Stores local variables and references to objects in the heap or SCP.  
   - In the diagram, `s3` and `s4` point to the **same string reference** in the SCP, while `s1` points to a separately allocated object in the heap.  

## **Example Code**  
```java
public class StringMemory {
    public static void main(String[] args) {
        String s1 = new String("aher"); // Creates a new object in the heap
        String s2 = "aher"; // Allocates in SCP
        String s3 = "karad"; // Stored in SCP
        String s4 = "karad"; // Points to the same SCP reference as s3

        System.out.println(s1 == s2); // false (Different memory locations)
        System.out.println(s3 == s4); // true (Same reference from SCP)
    }
}
```

---
# Java Full Stack Development Notes Day10
# Java String Handling Guide

## 1. String vs StringBuffer vs StringBuilder
### Key Differences:
| Feature          | String          | StringBuffer       | StringBuilder      |
|------------------|-----------------|--------------------|--------------------|
| **Mutability**   | Immutable       | Mutable            | Mutable            |
| **Thread Safety**| Not Applicable  | Thread-safe (Synchronized) | Not Thread-safe   |
| **Performance**  | Slow for modifications | Faster than String | Fastest            |
| **Use Case**     | Fixed values    | Multi-threaded env | Single-threaded env |

---

## 2. StringBuffer in Depth
### Basic Usage:
```java
StringBuffer sb1 = new StringBuffer("amol");
StringBuffer sb2 = new StringBuffer();  // Initial capacity = 16

System.out.println(sb1);  // Output: amol
System.out.println(sb2);  // Output: (empty string)
```

### Conversion from String:
```java
String s = "hello";
StringBuffer s3 = new StringBuffer(s);  // Converts String to StringBuffer
```

### Key Methods:
1. **append()** - Adds to the end:
```java
sb2.append(s3);  // sb2 becomes "hello"
```

2. **insert()** - Adds at specific position:
```java
sb1.insert(3, "ch");  
// Original: "a m o l" (indices 0-3)
// Output: "amochl" (inserts at index 3)
```

3. **capacity()** - Returns current storage size:
```java
StringBuffer sb = new StringBuffer();  // Default capacity = 16
sb.append("12345678901234567");  // 17 characters
System.out.println(sb.capacity());  // Output: 34 (16*2 + 2)
```

---

## 3. Memory Management
### Capacity Growth Formula:
- When buffer is full: `New Capacity = (Current Capacity * 2) + 2`
- Example:
  - Initial: 16
  - First expansion: 16*2+2 = 34
  - Second expansion: 34*2+2 = 70

### Trim Example:
```java
StringBuffer sb4 = new StringBuffer(1000);
sb4.append("Hello");
sb4.trimToSize();  // Reduces capacity to actual length (5)
System.out.println(sb4.capacity());  // Output: 5
```

### Other Methods:
```java
sb4.delete(0,4);  // Removes characters from index 0-3 (modifies original)
sb4.reverse();    // Reverses the sequence (original modified)
```

---

## 4. StringBuilder
### Key Points:
- **Not thread-safe** (opposite of what was mentioned earlier)
- **Faster** than StringBuffer in single-threaded environments
- **Same methods** as StringBuffer but without synchronization

---

## 5. StringTokenizer
### Basic Usage:
```java
String s = "dr. daulatrao aher college of Engineering";
StringTokenizer st = new StringTokenizer(s);  // Default delimiter: space

while(st.hasMoreTokens()) {
    System.out.println(st.nextToken());  
}
// Outputs 5 tokens separated by spaces
```

### Key Features:
- Splits strings into tokens
- Default delimiter: whitespace
- Alternative delimiters can be specified
- Legacy class (Consider using String.split() for new code)

---

# Java Full Stack Development Notes Day11
## Java Constructors and `this` Keyword Guide

## 1. Constructor Types with Examples

### 1.1 Default Constructor
```java
public class Student {
    // Default constructor (no arguments)
    public Student() {
        System.out.println("Default constructor called");
    }
}
```

### 1.2 Parameterized Constructor
```java
public class Student {
    String name;
    int age;
    
    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;  // Using 'this' to resolve naming conflict
        this.age = age;
    }
}
```

### 1.3 Copy Constructor
```java
public class Student {
    String name;
    int age;
    
    // Copy constructor
    public Student(Student original) {
        this.name = original.name;
        this.age = original.age;
    }
}
```

---

## 2. `this` Keyword Explained

### 2.1 Basic Usage
Used to refer to current class instance variables:
```java
public class Car {
    String model;
    
    public Car(String model) {
        this.model = model;  // Differentiates instance var from parameter
    }
}
```

### 2.2 Calling Constructors with `this()`
Used to call one constructor from another:
```java
public class Rectangle {
    int width, height;
    
    // Default constructor
    public Rectangle() {
        this(10, 20);  // Calls parameterized constructor
    }
    
    // Parameterized constructor
    public Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }
}
```

### 2.3 Passing `this` as Parameter
Used to pass current object to methods:
```java
public class Employee {
    void display() {
        Printer.printDetails(this);  // Passes current object
    }
}

class Printer {
    static void printDetails(Employee emp) {
        // Process employee details
    }
}
```

---

## 3. Singleton Pattern Clarification
**Private constructor ≠ Singleton**, but used in singleton implementation:
```java
public class Singleton {
    private static Singleton instance;
    
    // Private constructor prevents external instantiation
    private Singleton() {}
    
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

---

## Key Differences Table

| Constructor Type       | Purpose                                 | Example Use Case              |
|------------------------|-----------------------------------------|-------------------------------|
| Default Constructor    | Initializes with default values         | Object creation without params |
| Parameterized Constructor | Initializes with specific values      | Custom object initialization  |
| Copy Constructor        | Creates copy of existing object        | Object cloning                |
| Private Constructor     | Restrict object creation               | Singleton pattern             |

---

## Memory Tip
- **`this`** always refers to current object instance
- Constructor chaining (`this()`) must be **first statement** in constructor
- Copy constructors create **shallow copies** by default (for deep copies, you need manual implementation)

---

# Java Full Stack Development Notes Day12
## Java Concepts Guide: Recursion & Object Handling

## 1. Recursion Types with Examples

### 1.1 Direct Recursion
A method directly calling itself:

**Factorial Example:**
```java
public static int factorial(int n) {
    if(n == 0) return 1;  // Base case
    return n * factorial(n-1);  // Direct recursive call
}
```

### 1.2 Indirect Recursion
Methods calling each other in a cycle:

**Even-Odd Checker:**
```java
public static boolean isEven(int n) {
    if(n == 0) return true;
    return isOdd(n-1);  // Indirect call
}

public static boolean isOdd(int n) {
    if(n == 0) return false;
    return isEven(n-1);  // Indirect call
}
```

### 1.3 QuickSort Example (Direct Recursion)
```java
void quickSort(int[] arr, int low, int high) {
    if(low < high) {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi-1);  // Direct recursive call
        quickSort(arr, pi+1, high); // Direct recursive call
    }
}
```

---

## 2. Object Handling in Methods

### 2.1 Passing Objects to Methods
Objects are passed by **reference** (memory address is copied):

```java
class Student {
    String name;
    double grade;
    
    void boostGrade() {
        this.grade += 0.5;
    }
}

public class Main {
    public static void upgradeStudent(Student s) {
        s.boostGrade();  // Modifies original object
        s = new Student();  // Doesn't affect original reference
    }
    
    public static void main(String[] args) {
        Student st = new Student();
        st.grade = 3.5;
        upgradeStudent(st);
        System.out.println(st.grade);  // Output: 4.0
    }
}
```

### 2.2 Returning Objects from Methods
Methods can create/return objects:

```java
class Calculator {
    int value;
    
    Calculator add(Calculator other) {
        Calculator result = new Calculator();
        result.value = this.value + other.value;
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.value = 5;
        
        Calculator c2 = new Calculator();
        c2.value = 3;
        
        Calculator sum = c1.add(c2);
        System.out.println(sum.value);  // Output: 8
    }
}
```

---

## Key Concepts Summary

| Concept                 | Key Points                                                                 |
|-------------------------|----------------------------------------------------------------------------|
| **Direct Recursion**    | Method calls itself directly                                              |
| **Indirect Recursion**  | Methods call each other in a cycle                                        |
| **Object Passing**      | - Passed by reference<br>- Modifications affect original object           |
| **Object Returning**    | - Can return new/modified objects<br>- Supports method chaining           |
| **Memory Management**   | - Object parameters copy references, not objects<br>- Primitives copy values |

---

## Memory Diagram: Object Passing

```
Main Memory:
[Stack]                 [Heap]
st (reference)  -->   Student {grade: 4.0}
s (reference copy) --> (initially same as st)
```

---

## When to Use What?

1. **Recursion**:
   - Tree/graph traversals
   - Divide-and-conquer algorithms
   - Problems with recursive definitions

2. **Object Handling**:
   - Modify existing objects in methods
   - Create factory methods
   - Implement fluent interfaces


---


# Java Full Stack Development Notes Day13
## 1. `final` Keyword
### Key Rules:
| Context         | Behavior                                | Example                          |
|-----------------|-----------------------------------------|----------------------------------|
| **Variable**    | Value cannot be changed after assignment | `final int MAX = 100;`           |
| **Static Final**| Must initialize at declaration or static block | `static final double PI = 3.14;` |
| **Method**      | Cannot be overridden in subclasses      | `public final void display() { }`|
| **Class**       | Cannot be inherited                     | `final class SecureData { }`     |

### Initialization Examples:
```java
class Example {
    final int A;        // Initialized in constructor
    static final int B; // Initialized in static block
    
    public Example() {
        A = 10;
    }
    
    static {
        B = 20;
    }
}
```

---

## 2. Call By Value vs Reference
### Key Differences:
|                      | Call by Value                         | Call by Reference                 |
|----------------------|---------------------------------------|------------------------------------|
| **Data Types**       | Primitive types                       | Objects                            |
| **Memory Handling**  | Copy of value passed                  | Copy of reference passed           |
| **Modification**     | Changes affect only copy              | Changes affect original object     |
| **Example**          | `int x = 5; modify(x);`               | `Student s = new Student(); modify(s);` |

### Example Code:
```java
void modifyPrimitive(int val) {  // Call by value
    val = 20;  // Original remains unchanged
}

void modifyObject(Student s) {   // Call by reference value
    s.setName("John");  // Original object modified
}
```

---

## 3. Garbage Collection
### Key Mechanisms:
1. **Automatic Memory Management**
   - JVM destroys objects with **zero references**
   - No explicit destructors in Java
   - Runs in background via daemon thread

2. **String Pool Behavior**
   ```java
   String s1 = "Hello";  // In string pool
   String s2 = new String("Hello");  // In heap
   ```
   - Pool strings persist until JVM exits
   - Heap strings become eligible for GC when unreferenced

3. **Manual Suggestions (Not Guaranteed):**
   ```java
   System.gc();      // Hint to JVM
   Runtime.getRuntime().gc();  // Alternative
   ```

---

## 4. Memory Management Examples

### StringBuffer Capacity Growth:
```java
StringBuffer sb = new StringBuffer();  // Initial capacity 16
sb.append("A".repeat(17));             // New capacity: (16*2)+2 = 34
sb.append("B".repeat(35));             // New capacity: (34*2)+2 = 70
```

### Garbage Collection Demo:
```java
void createGarbage() {
    for(int i=0; i<1000; i++) {
        new Student();  // Eligible for GC immediately
    }
}
```

---


## Common Misconceptions Clarified

| Incorrect Statement              | Correct Explanation                  |
|-----------------------------------|---------------------------------------|
| "Java has call by reference"      | Java passes object reference values  |
| "final variables need constant initializers" | Can initialize in constructor |
| "GC immediately destroys objects" | Collection time is non-deterministic |
| "StringBuffer is faster than StringBuilder" | Only in multi-threaded contexts |


---

# Java Full Stack Development Notes Day14
## 1. Swing – Using `addActionListener` with a Lambda Expression

When creating a Swing GUI, you often need to respond to user actions (like clicking a button). Instead of writing an anonymous inner class, you can use a lambda expression for brevity. The lambda function provides the implementation for the event’s action.

**Example:**
```java
import javax.swing.*;

public class SwingLambdaExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Lambda Example");
        JButton button = new JButton("Click Me!");

        // Using lambda expression to handle button clicks
        button.addActionListener(e -> {
            System.out.println("Button was clicked!");
        });

        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```
**Explanation:**  
- The lambda `(e -> { ... })` is the concise implementation of the `ActionListener` interface.
- When the button is clicked, the code inside the lambda prints a message.

---

## 2. Polymorphism in Java

Polymorphism lets one interface be used for a general class of actions. There are two main types:

### 2.1 Compile-Time Polymorphism (Method Overloading)

In compile-time polymorphism, methods have the same name but different parameter lists. The method to invoke is determined at compile time.

**Example:**
```java
class Calculator {
    // Method overloading: different parameter types
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum (int): " + calc.add(5, 10));           // 15
        System.out.println("Sum (double): " + calc.add(5.5, 10.5));      // 16.0
    }
}
```
**Explanation:**  
- Two `add` methods are defined with different parameter types.
- The compiler decides which method to call based on the arguments.

### 2.2 Runtime Polymorphism (Method Overriding and Upcasting)

Runtime polymorphism is achieved by method overriding where a subclass provides its own implementation of a method declared in its superclass. The decision is made at runtime, often with upcasting.

**Example:**
```java
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        // Upcasting: Dog object referenced as an Animal
        Animal myAnimal = new Dog();  
        myAnimal.sound();  // Calls Dog's overridden sound() method
    }
}
```
**Explanation:**  
- `Dog` overrides the `sound()` method.
- The reference is of type `Animal`, but the actual object is a `Dog` (upcasting), so at runtime, Dog’s version of `sound()` is called.

---

## 3. Abstract Classes, Concrete Classes, and Interfaces

### 3.1 Abstract Classes
- **Abstract classes** cannot be instantiated.
- They may contain both abstract methods (declared but not implemented) and concrete methods (fully implemented).

**Example:**
```java
abstract class Shape {
    // Abstract method (no implementation)
    abstract void draw();
    
    // Concrete method
    public void display() {
        System.out.println("Displaying shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Shape shape = new Circle(); // Upcasting
        shape.draw();      // "Drawing circle"
        shape.display();   // "Displaying shape"
    }
}
```

### 3.2 Interfaces
- All methods declared in an **interface** are implicitly `public` and `abstract` (no need to declare these keywords).
- Interfaces can extend one another using the `extends` keyword.
- If a class implements an interface, it must provide implementations for all methods.

**Example:**
```java
interface Drawable {
    void draw(); // implicitly public and abstract
}

interface Colorable extends Drawable {
    void color(String color); // additional method in extended interface
}

class Square implements Colorable {
    @Override
    public void draw() {
        System.out.println("Drawing square");
    }
    
    @Override
    public void color(String color) {
        System.out.println("Coloring square with " + color);
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.draw();        // "Drawing square"
        sq.color("red");  // "Coloring square with red"
    }
}
```

### 3.3 Differences: Final Class, Abstract Class, and Interface

- **Final Class:**  
  - Cannot be extended (subclassed).  
  - Example: `public final class String { ... }`

  **Example:**
  ```java
  final class FinalClass {
      public void display() {
          System.out.println("This is a final class");
      }
  }
  
  // Cannot extend FinalClass:
  // class SubClass extends FinalClass {} // This would cause a compile-time error.
  ```

- **Abstract Class:**  
  - May contain abstract methods and concrete methods.
  - Cannot be instantiated.
  - Supports inheritance (only one class can extend an abstract class).

- **Interface:**  
  - Contains abstract methods (by default) and constants.
  - A class can implement multiple interfaces.
  - Methods in an interface are implicitly `public` and `abstract` (unless they are static or default).


