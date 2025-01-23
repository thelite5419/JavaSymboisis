
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
