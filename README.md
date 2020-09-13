# MethodOverloading
# Challenge from Tim Buchalka's Java Programming Masterclass for Software Developers course.

Create a method called calcFeetAndInchesToCentimeters.
It needs to have 2 paramters. Feet and inches.

You should validate that the first parameter feet is >= 0.
You should validate that the 2nd parameter inches is >= 0 and <= 12.
Return -1 from the method if either of the above is not true.

If the parameters are valid, then calculate how many centimeters
comprise the feet and inches passed to this method and return
that value.

Create a 2nd method of the same anem with only one parameter, inches.
Validate that it's >= 0.
Return -1 if it is not true.
But if it is valid, then calculate how many feet are in the inches 
and then call the other overloaded method, passing the correct feet and inches
calculated so that it can calculate correctly.

Hints: Use double for your number datatypes.
       1 inch = 2.54 cm 

