#include <iostream>
using namespace std;


void printArr(int arr[][3], int row, int col)
{
    if (row >= 0 && col >= 0) {
        cout << "Value at (" << row << "," << col << ") = " << arr[row][col] << endl;
        return;
    }

    if (row >= 0 && col == -1) {
        cout << "Row " << row << ": ";
        for (int j = 0; j < 3; j++) {
            cout << arr[row][j] << " ";
        }
        cout << endl;
        return;
    }

    if (col >= 0 && row == -1) {
        cout << "Column " << col << ":" << endl;
        for (int i = 0; i < 3; i++) {
            cout << arr[i][col] << endl;
        }
        return;
    }
}

void printBoundaries(int arr[][4])
{
    cout << "\nBoundary Elements:\n";

    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
						if (
                i == 0 || i == 4 - 1 || j == 0 || j == 4 - 1) {
                cout << arr[i][j] << " ";
            }
        }
        cout << endl;
    }
}


void printCenter(int arr[][4])
{
    cout << "\nCenter Elements:\n";

    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {

           
            if (
                i == 0 || i == 4 - 1 || j == 0 || j == 4 - 1) {
                continue;
            }

            cout << arr[i][j] << " ";
        }
        cout << endl;
    }
}

int main()
{
    // Task (a) 
    int arrA[3][3] = {
        {1, 0, 0},
        {0, 1, 0},
        {0, 0, 1}
    };

    cout << "Task (a):\n";
    int r, c;
    cout << "Enter row (-1 for skip): ";
    cin >> r;
    cout << "Enter col (-1 for skip): ";
    cin >> c;

    printArr(arrA, r, c);

    // Task (c) 
    int arrB[4][4] = {
        {55, 30,  0, 74},
        {225,178, 41, 68},
        {98, 33, 200,120},
        {130,63,  88,160}
    };

    
    printBoundaries(arrB);

		// Task (d)
    printCenter(arrB);

    
    
cout<<endl;
system("PAUSE");
return 0;
}
