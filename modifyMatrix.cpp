
/*
==========================================================================================
QUESTION DESCRIPTION:
------------------------------------------------------------------------------------------
Given a boolean matrix mat[R][C] of size R x C, modify it such that if a matrix cell 
mat[i][j] is 1 (True), then make all cells of its corresponding ith row and jth column 
as 1 (True).

Example:
Input:
1 0 0 1
0 0 1 0
0 0 0 0

Output:
1 1 1 1
1 1 1 1
1 0 1 1
==========================================================================================
*/

#include <bits/stdc++.h>

using namespace std;

// Pass the dimensions along with the dynamically allocated array pointers
void modifyMatrix(bool **mat, int R, int C)
{
    bool row[R];
    bool col[C];

    int i, j;

    /* Initialize all values of row[] as 0 */
    for (i = 0; i < R; i++) {
        row[i] = 0;
    }

    /* Initialize all values of col[] as 0 */
    for (j = 0; j < C; j++) {
        col[j] = 0;
    }

    /* Store the rows and columns to be marked as 
       1 in row[] and col[] arrays respectively */
    for (i = 0; i < R; i++) {
        for (j = 0; j < C; j++) {
            if (mat[i][j] == 1) {
                row[i] = 1;
                col[j] = 1;
            }
        }
    }

    /* Modify the input matrix mat[] using the 
       above constructed row[] and col[] arrays */
    for (i = 0; i < R; i++) {
        for (j = 0; j < C; j++) {
            if (row[i] == 1 || col[j] == 1) {
                mat[i][j] = 1;
            }
        }
    }
}

/* A utility function to print the 2D matrix */
void printMatrix(bool **mat, int R, int C)
{
    int i, j;
    for (i = 0; i < R; i++) {
        for (j = 0; j < C; j++) {
            cout << mat[i][j] << " ";
        }
        cout << endl;
    }
}

// Driver Code
int main()
{
    int R, C;
    
    cout << "Enter the number of rows (R): ";
    cin >> R;
    cout << "Enter the number of columns (C): ";
    cin >> C;

    // Dynamically allocate memory for the 2D array based on user input
    bool **mat = new bool*[R];
    for(int i = 0; i < R; ++i) {
        mat[i] = new bool[C];
    }

    cout << "\nEnter the matrix elements row by row (Only 0 or 1 allowed):\n";
    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
            int tempInput;
            
            // Loop runs infinitely until the user provides a valid 0 or 1
            do {
                cout << "Element [" << i << "][" << j << "]: ";
                cin >> tempInput;
                
                if (tempInput != 0 && tempInput != 1) {
                    cout << "Invalid input! Please enter a value in the range (0, 1) only.\n";
                }
            } while (tempInput != 0 && tempInput != 1);
            
            mat[i][j] = tempInput; 
        }
    }

    cout << "\nInput Matrix: \n";
    printMatrix(mat, R, C);

    modifyMatrix(mat, R, C);

    cout << "\nMatrix after modification: \n";
    printMatrix(mat, R, C);

    // Free the dynamically allocated memory
    for(int i = 0; i < R; ++i) {
        delete[] mat[i];
    }
    delete[] mat;

    return 0;
}