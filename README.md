# Homework 2: Stopwatch

The comp124graphics package contains a class called GraphicsGroup that is a GraphicsObject and can therefore be placed on a canvas using the add method. The powerful and useful aspect of a GraphicsGroup is that any object in the GraphicsObject hierarchy can be placed inside a GraphicsGroup object using the add method also. This enables several graphical objects that could be placed together or all moved in the same way to be kept together in one object and all moved at once.

Event-driven programming in Java, using the swing and awt libraries, is presented in chapter 6 of the Java Foundations book. For this homework, you are given the code needed to use event-driven programming, so that you can study it and get familiar with it.

### Your Task

Your task in this homework is to create a stopwatch out of LCD numbers. You should use the Number class from the class activity. You must also create a StopWatch class that extends GraphicsGroup and contains instances of the Number class. The file provided to you already is the StopWatchProgram class, which is the program with a main method that you run. Study the comments in this code and add methods to complete the task of displaying a stopwatch and starting and stopping it with each successive click of the button. You need to consider how to update each of the displayed numbers as the time increases on the stopwatch.

You must also document all of your methods and the top of each class file with useful javadoc comments. Useful comments describe in detail what a method does and what is returned or changed as a result of executing it.

Graphical event-driven programs can be difficult to test with unit tests. 
Ultimately, you will not be able to write unit tests for the clock showing up correctly, you will need to test that directly. 
However, you are expected to work out a way to add methods to your StopWatch class that can be used for other features of the class. 
For example, what happens to your stopwatch when the number of seconds passes 59, the number of minutes passes 59, and the number of hours passes a particular value (you have options here- document your choice)? 
Develop ways to set the stopwatch time to an initial value that enables you to test whether the StopWatch object progresses time correctly at these certain points of time. 
This type of testing is important when developing GUI applications.

###Important Notes

* You do not need to add a main method to your StopWatch class. This already exists in the StopWatchProgram class.
* Do not use a while(true) loop and pause(): the new Java Timer class is used instead to enable you to do something every second. That code is provided.
* Simply for illustrative purposes, the program will count upwards and display each new second in the console window. You will replace that with your newly built StopWatch class, which is a GraphicsGroup.
* Right now the Java Timer simply starts and does something every second. You will need to also add the ability to also stop it when the button is pushed.
* Make sure to follow good [Java style](https://docs.google.com/a/macalester.edu/document/d/1YpCzhKhYy5JUQ6oCGJZdf92a0jjpmjMxfKfhPkFl5As/edit?usp=sharing)

###Extra Credit

* Create a separate TimerClock class that allows the user to input a time. The display should then count down till the timer reaches zero and play a beep to signal that the time is up. To play a beep you can use the following line:
```
java.awt.Toolkit.getDefaultToolkit().beep();
```
Once the timer ends, you should allow the user to set a new time and count down again.
* Modify your StopWatch class to add the capability to take splits. You should add a new button to the class that is labeled "Split". When pressed, it should calculate the amount of time elapsed since the start time and display the time on the screen. Make sure you have committed and pushed the regular assignment before starting this extra credit.
