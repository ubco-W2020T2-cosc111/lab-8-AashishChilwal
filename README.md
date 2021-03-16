# Lab 8

## Expectations

We are expecting you to commit your work often with useful commit messages.
This is helpful for you so that there are regular commits that demonstrate your progress. 
In case you forget to push your final commits before the deadline, at least you will get partial marks.

This means that you should commit and push your changes to the repository at least **FIVE** times as you work this lab (more is recommended).
Repositories that have very few commits will be flagged for careful scrutiny and review, and you will **definitely** lose marks for this! 

## Q1: [7 marks] Even and Odd Numbers

Write a program that allows a user to continuously enter integers until the user inputs 0 (zero).
The program then prints the total number of positive, negative, even and odd integers that have been entered.
Your program should also print the sum and average of the input values (not counting zeros).
The average should be rounded to 2 decimal places.

You should deal with inputs that are not integers in a sensible way.

### Sample runs: 

```
Enter the first integer (0 to terminate): 0
no numbers are entered except 0
```
```
Enter the first integer (0 to terminate): 3
Enter the next integer (0 to terminate): 1
Enter the next integer (0 to terminate): 6
Enter the next integer (0 to terminate): 0
The number of positives is 3
The number of negatives is 0
The number of evens is 1
The number of odds is 2
The total is 6
The average is 3.33
```

## Q2: [7 marks] Finding Perfect Numbers

If a number is equal to the sum of all of its positive divisors excluding itself, then it is called a perfect number.
A divisor is a number by which another number is to be divided.

For example, 6 = 3+2+1 and hence, 6 is the first perfect number. 
28 is the next perfect number as 28 = 14+7+4+2+1. 
There are 4 perfect numbers between 1 and 10,000. Write a program to find those 4 numbers.

For now, do not worry about being efficient with your solution.

## Q3: [8 marks] XOR Operator

Write a program to find all the numbers between 100 and 200 that are divisible by either 5 or 6 but not both (this is called XOR relationship).
Your program must display 10 numbers per line with exactly one space between each 2 numbers.

Hints:

* Use the XOR operator. 
* To display 10 numbers per line, you need to use a counter that is incremented whenever a number is displayed. A new line is taken whenever the counter is equal to 10. 

### Sample run:
```
100 102 105 108 110 114 115 125 126 130
132 135 138 140 144 145 155 156 160 162
165 168 170 174 175 185 186 190 192 195
198 200
```

## Q4 [8 marks] Highest scores

Write a program that first asks the user to input a number of students and then asks for each student’s name and score.
The program should then display the names of the highest scorer and the second-highest scorer.
The validity of user inputs do not need to be checked (in other words, ;.][=-]).

### Sample run:

```
Enter the number of students: 4
Enter a student name: John
Enter a student score: 3.5
Enter a student name: Mike
Enter a student score: 2.5
Enter a student name: Lili
Enter a student score: 4
Enter a student name: Yasmine
Enter a student score: 3
Top two students:
Lili's score is 4.0
John's score is 3.5
```

## Grading area

### Link to files

You do not have to do anything in this section.

[Q1 Java file](./Q1.java)

[Q2 Java file](./Q2.java)

[Q3 Java file](./Q3.java)

[Q4 Java file](./Q4.java)

Remember to commit all your changes and to submit the link to this repository on Canvas.