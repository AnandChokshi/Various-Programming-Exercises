A Self-Describing Number
<br />
A number is a self-describing number when (assuming digit positions are labeled 0 to N-1), the digit in each position is equal to the number of times that that digit appears in the number.<br /><br />
input:<br />
The first argument is the pathname to a file which contains test data, one test case per line. Each line contains a positive integer.<br />
For Example: 2020

output:<br />
If the number is a self-describing number, print out 1. If not, print out 0 <br />
For Example: 1

<br />
<br />
For the curious, here's how 2020 is a self-describing number: Position '0' has value 2 and there is two 0 in the number. Position '1' has value 0 because there are not 1's in the number. Position '2' has value 2 and there is two 2. And the position '3' has value 0 and there are zero 3's.