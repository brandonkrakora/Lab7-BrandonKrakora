What is the purpose of the various auxiliary methods populateList, populateFifoList, and ReverseLines.printReverse?
    - The purpose of the auxiliary methods is to manipulate our inputs based on our algorithm and return the new result,
        rather than manipulating the inputs directly.

Why do these methods need to have arguments, and how does the argument change from one recursive call to the next?
    - Each recursive calls keep tracks of the arguments during that state and can later be returned when we hit the base case.
        As we pass in new arguments for a recursive call, the new arguments will change
        for the new recursive state until the base case is hit.

What are the time and space complexity of each of the populateList populateFifoList methods, as well as ReverseLines.printReverse?
    - The time complexity for populateList populateFifoList and ReverseLines.printReverse is O(n),
        the space complexity for populateList populateFifoList and ReverseLines.printReverse is O(1).

Which of these methods can be implemented using while loops?
    - Any method that uses recursion can be implemented using while loops, and vice-versa.