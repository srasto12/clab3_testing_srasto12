# Description of each testcase:

## Boundary Test Cases:
a) **testPowZero:** Any number to the power 0 is 1.  
b) **testPowOne:** Any number to the power 1 is itself.  
c) **testZeroBaseZeroPow:** 0^0 is a defined edge case, assumed to be 1.  

## Negative Test Cases:
a) **testNegativePow:** Tests negative exponent; method lacks checks.  

## Equivalence Test Cases:
a) **testPositivePow:** General case with base and exponent both positive.  
b) **testZeroBasePositivePow:** 0 raised to any positive power is 0.  
c) **testOneBaseAnyPow":** 1^anything = 1.  
d) **testNegativeBaseEvenPow:** Negative base with even power → positive result.  
e) **testNegativeBaseOddPow:** Negative base with odd power → negative result.  