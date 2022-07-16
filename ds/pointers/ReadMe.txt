Pointers

Lab / Assignment

Folder: ds/pointers

Instructions

Note: this assignment should be completed on paper with pen or pencil.

part 1

Using the code for Node.java in this directory, trace through the following code segment one line at a time. As you trace through the code, draw a diagram of the cells and pointers that result.

Node n1 = new Node(5);
Node n2 = new Node(10);
n1.setNext(n2);
n2.setNext(new Node(15));
n2 = new Node(20);
Node n3 = new Node(25,n2);

When done, compare your diagram to the rest of your breakout room.

Part 2

Copy over your diagram from part 1 and continue to modify it by tracing through these lines of code:

n2.setNext(n1);
n1=n3;

Once again, share the diagram with your room.

Part 3

Given this diagram:


There already exists a Node variable P which points to (refers to) the node with the 5 in its data.

Write a code fragment to:

1. Create a new Node variable set it to point to the node with the 10 in it.
2. Create a new Node variable and instantiate it to a new Node with a value of 30.
3. Write the code to insert this new Node between the 10 and the 15

Submission

Scan or take a photo of your work and upload to your ds/Pointers folder/directory. Name the file pointers.png, pointers,pdf, pointers.gif, or pointers.jpg depending on the file format.



