# ShapeSort
orionn99
SN: 216305377
TA: kmridul@yorku.ca
Sec: 3311 F Sec A

## Introduction
The goal of shapesort is to be able to sort an arbitrary randomly generated list of shapes with different attributes by size. By all means, this is a simple task however the task of implementing this Using OOD with each shape as its class proved more difficult than expected.
The Principles that I will be using to carry out this design are test-driven development as well as iterative development. 

Since the goal of this project is simple I chose the Iterative method of development since the project is generally of low complexity and also test-driven development.
Classes Are Structured in order of increasing Complexity Regarding the Shape Method 

----
##  Iteration 1  First Working Version
The initial iterative design branch ``` working-trash ``` consisted of a main My_Panel Method which would include its quicksort method. Instead of a Generic Shape class instead of on this iteration. I instead started writing in Java the same way I would in Python. 

Under this first iteration here are some of the things I reasoned.

- Every Square is a Rectangle so therefore the Square class is not needed or should be a subclass of a rectangle. 
- My_Panel currently contains the sorting method It should not contain the quicksort function.
- Circles and Rectangles need both direct and Object-Oriented ways of comparing to each other one way of doing this is implementing direct comparison as in this iteration however this approach is not scaleable.
- There is a need for a Shape Class that would contain generic attributes common in every shape. Each Shape needs its Constructor.
- compareto Needs an OOD method of generic comparison as a replacement for My_Panel method compare(Object a , Object b ).
-  ```MyPanel.java , MyCircle.java , MyRectangle.java ```
![Iteration One ](https://or9.ca/images/lab3r1.png)
Included is a rough UML diagram for the initial iteration of ShapeSort.

## Iteration 2 Modular OOP Oriented Iteration of ShapeSort

The second branch of my project included in this description is ``` working-modular ```. Within this iteration, I was able to accomplish the following 
- Interface ShapeProperties is the guiding interface for shape and includes all methods that Shape must complete the requirements needed to be gained from ```working-trash```

- Design patterns : Shape is an abstract Bridge and Proxy Class (Structural) shapeFactory() is a Factory Method (Creational).
- Shape.java was created using ShapeProperties it is the parent class and will handle all further comparisons or added shapes which have not already been implemented.
- Shape.java optionally takes care of getArea() instead of refering to subclass.getArea()  
- MyRectangle and MyCircle have been modified to be a subclass of shape and now most getters and setters interact with parent Shape.java
- Square.java has been Created as a subclass of Rectangle.java it now is able to be constructed with only a length.
- ShapeSort.java has been created to contain all of the required sorting methods. 
- Changes to My_Panel.java to implement modular design changes.
- Added Comments and Generated Javadoc.
- Released Version V1.0.0 as Executable Jar.

> Does this second class diagram yield a better design than your first class diagram?

This second UML is a much better design than the first as it takes into account inheritance and Polymorphism. The first does not follow the correct project requirements and is not an ideal design despite being functional.

I didn't Transfer Comments to the UML because it was cluttered so to read Comments view the Javadoc at https://or9.ca/W3LAB 

![Iteration Two ](https://or9.ca/images/lab3_diagram_invert.png)

## Object-Oriented Design Principles

Polymorphism: Every Shape Subclass  Square, Circle, Rectangle inherits similar shadow methods to its parent.

Inheritance: getColor() is inherited by every Shape and the parent method is used.

Abstraction: isSquare() is an example of abstraction since it is only used in a rectangle which is the only time we are unsure if a rectangle is a square.  This is not relevant to any other method 

Encapsulation: Many of the functions inside of MyPanel are not relevant to other classes outside of MyPanel. 

## Design Implementation.

```SortShape.java```

The Algorithm I chose was quicksort which begins partitioning the array into two parts on either side of the pivot.   The first part is then sorted and the second is sorted, swapped with the original second part, and then the original first part is swapped back into place.
The methods and submethods used for this are partition and swap. 


``` Shape.java```
Abstract Parent Class that implements all of its requirements from ```ShapeProperties.java```. 
Each shape has a width height color and area and comparison.

```Square.java Rectangle.java Circle.java ```
Each shape retrieves area from Shape and contains its getter and setter methods. 

```MyPanel``` 
This class implements all the main functions used in the program it extends Jpanel and implements methods shapeFactory() for adding shapes to shapeList. orderFactory() which using the sorted shapelist updates the positions of upperX and upperY for shape location. 
newShapes() calls a new shapeFactory() instance and assigns it to shapeList.





Video of COde Running https://www.youtube.com/watch?v=EFbqVoXCO7g

```Version Info```
> Eclipse version 2019-06 (4.12.0) Build id: 20190614-1200


> UML Lab by Yatta UML






## Conclusion 


> What Worked Well 


Creating a UML Design and using object-oriented techniques worked well. Using Objects knowledge of its former class.

> What didn't work well 


I hadn't written a full java program in quite a while so the initial commit on this project was me getting confused and forgetting how Java worked. 

> What did you learn in your software project


Quite a lot I re familiarised myself with java.

> Recommendations to Ease completion


Providing code snippets for Jpanel was very helpful when Jpanel likes to completely break itself if you do something incorrectly.






























