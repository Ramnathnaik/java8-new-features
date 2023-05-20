# Java 8 Concepts

## What's the pupose of Java 8?
There were mainly three reasons to introduce Java 8.
1. Conscise and minimal code.
2. To enable functional programming
3. To enable parallel programming

<br>

## Java 8 Features
1. Lamba expressions
2. Stream API
3. Date and Time API
4. Base64 Encode Decode
5. Method and Constructor Reference
6. Default methods and Static methods in Interface
7. Functional Interface
8. Optional Class
9. Java IO Improvements
10. Collection API Improvements

<br>

## What is lambda expression
Lambda expression is an anonymous function i.e,
1. Not having any name.
2. Not having any return type.
3. Not having modifier

<br>

## Steps to make may function lambda function
1. Remove modifier.
2. Remove return type.
3. Remove method name.
4. Place arrow.

For example, if we have a method like this:
```java
public void displayName() {
    System.out.println("My name is Ram");
}
```

After converting it to a lambda expression it will be represented like:
```java
() -> System.out.println("My name is Ram");
```

<br>

## How to beautify the lambda expression
1. If body has just one statement then we can remove the curly brackets.
2. Use type interence, compiler guess the situation or context
3. No return keyword required, if only one line is present

<br>

## Benefits of Lambda Expression
1. To enable functional programming.
2. To make code more readable, maintainable and concise.
3. To enable parallel processing.
4. Jar file sixe reducution.
5. Elimination of shadow variables.

<br>

## Functional Interface in Java 8
Interface having  exactly single abstract method but can have any number of default and static methods are called functional interface. We can invoke lambda expression by using functional interface.

<br>

## What are the advantages of @FunctionalInterface annotation?
1. It restict the interface to be a functiona; interface.
2. So if people have already used some lambda expression and some new team member addecd another abstract method in the interface, all the lambda expression will thorw error.

<br>

## Default methods in Interface
* Until 1.7 only public abstract methods were allowed in interface.
* If a legacy application is using an Interface and after some time we want to add a method into that interface, which needs to be implemented by only certain class, it was not possible in Java 1.7.
* To overcome this limitation, since Java 1.8 we can have concrete methods as well inside interface

<br>

## Static methods in Interface
Static methods in Interface are those methods, which are defined in the interface with the keyword static.
* It contains complete defination of the function.
* We cannot override the static methods
