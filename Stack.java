** 📚 Stack Data Structure**
🔹 1. What is a Stack?
A Stack is a linear data structure that follows the
LIFO – Last In, First Out principle.

📖 Analogy:
A stack of books — the book placed last is the first one removed.

🧩 Core Characteristics

Data Representation

Can store homogeneous or heterogeneous data

Access Restrictions

Only the top element is accessible

No random access (unlike arrays)

Efficiency

Ideal for backtracking, recursion, parsing, and reversal problems

⚙️ Stack Operations
Operation	Description	Time Complexity
Push	Adds an element to the top	O(1)
Pop	Removes the top element	O(1)
Peek	Returns top element	O(1)
isEmpty	Checks if stack is empty	O(1)
isFull	Checks if stack is full (array-based)	O(1)

✅ Stack operations are highly efficient due to constant time complexity.

🖼️ Visual Representation
   ┌─────────┐
   │   30    │  ← Top
   ├─────────┤
   │   20    │
   ├─────────┤
   │   10    │
   └─────────┘


📌 LIFO Principle:
Last element added → First element removed

You can also include an image in GitHub:

![Stack Data Structure](https://upload.wikimedia.org/wikipedia/commons/b/b4/Lifo_stack.png)

🚀 Practical Applications of Stack
🔁 Function Calls

Uses call stack

Tracks:

Function execution order

Local variables

Return addresses

✍️ Text Editors

Undo / Redo operations

Each action is pushed onto a stack

🌐 Web Browsers

Back / Forward navigation

Each visited page stored in stack

🧮 Parsing & Expression Evaluation

Balanced parentheses () { } [ ]

Binary expression evaluation

Syntax checking in compilers

🧠 Memory Management

Stack memory allocation for:

Method calls

Local variables
