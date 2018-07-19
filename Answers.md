1. What is the purpose of the various auxiliary methods populateList, populateFifoList, and ReverseLines.printReverse?
Answer:
-------
Purpose of the various auxiliary methods populateList, populateFifoList, and ReverseLines.printReverse is to understand and use java stack in the recursion.
  

2. Why do these methods need to have arguments, and how does the argument change from one recursive call to the next?
Answer:
-------
These all methods are the recursive methods. So, we have to stop the recursion some where.
So, We use the value of the method arguments in the method to stop the recursion. 


3. What are the time and space complexity of each of the populateList populateFifoList methods, as well as ReverseLines.printReverse?
Answer:
-------
                        Time complexity     Space complexity
populateList        -       O(n)                O(n)
populateFifoList    -       O(n)                O(n)
printReverse        -       O(n)                O(n)
Where n is the size of the linkedStack
Space complexity of a recursive algorithm is O(depth of recursion * time complexity for each recursion) 


4. Which of these methods can be implemented using while loops?
Answer:
-------
Methods that are performing logic before the recursive call can be implemented using while loops.
So, Method populateList can be implemented using while loops