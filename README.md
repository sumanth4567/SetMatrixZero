# SetMatrixZero
this is a medium level problem from leet code
so basically the description of this problem is as follows:
we will be given a matrix of size m*n and the values will be binary(0,1) we have to return a matrix in which the row and column in which 0 is present should be changed to 0

example:
1 1 1
1 0 1
1 1 1

output:
1 0 1
0 0 0
1 0 1

procedure:
we need to create two additional arrays with sizes corresponding to the rows and columns and in the code we used arr[] for rows
and brr[] for columns and in those arrays we store the values as 1 if the row contains 0 in arr[] array and we store 0 in the corresponding column in brr[] array

and finally we compare the two additional arrays with the matrix and if atleast there is a 0 in any one of the two arrays then the whole row or column will be 
changed to 0's

Time complexity: o(m*n)
space complexity: o(m+n)
