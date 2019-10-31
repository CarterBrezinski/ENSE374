Changes made in program/Justification for Javadoc tags
----------

Employee.java:

The original variables were the following:
fNam
lN
addr
NUM
hireDate
dol

Replacing said variables to become the following:
firstName
lastName
address
phoneNum
hireDate
startingSalary

I did this due to readability and understanding for the user.

all getter and setter functions were changed to appropriately match their previous name changes, following camelCase format.
i.e. getfNam became getFirstName

The setSTUFFUP function was changed to addEntries, so someone reading could better understand what is happening.

------------------

EmployeeApplication.java:

All variable changes made in the Employee.java file were changed to have the same syntax on this file.

A static constant integer for the number of employees was created to take the place of eDSize, as it was unclear what it actually was,
and it allowed for easier usability across the entire program. This additionally allowed to remove the use of a random '3' around the program.

database names, like: eD, eA, srtD, and sorted were all changed to more
feasible names. Names like: employeeDatabase, employeeApplication, sortedDatabase, and sortDatabase.

Function addEs was changed respectively to addEntries.
Function sorteDByName, was changed to sortByName, so users don't get confused with the random capitalization.

------------------

There were many things that I decided to leave in the program, this would include:
the use of integers i and j in for loops, as they weren't necessary to the counting process.

Additionally, I chose not to remove Trevor Douglas as an author, as he was the initially creator of the program, I just added to it/changed a few things.