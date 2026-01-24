#include <iostream>
#include <fstream>
#include <string>
using namespace std;
int main() {

    ifstream file;
    file.open("task2.cpp");

    if (!file.is_open()) {
        cout << "Source file not found";
        return 0;
    }

    string line;

    int coutCount = 0;
    int cinCount = 0;
    int loopCount = 0;
    int functionCount = 0;
    int ifCount = 0;
    int elseCount = 0;
    int headerCount = 0;
    int lineCount = 0;

    while (getline(file, line)) {

        lineCount++;

        if (line.find("cout") != -1) {
            coutCount++;
        }

        if (line.find("cin") != -1) {
            cinCount++;
        }

        if (line.find("for") != -1) {
            loopCount++;
        }

        if (line.find("while") != -1) {
            loopCount++;
        }

        if (line.find("do") != -1) {
            loopCount++;
        }

        if (line.find("#include") != -1) {
            headerCount++;
        }

        if (line.find("if") != -1) {
            ifCount++;
        }

        if (line.find("else") != -1) {
            elseCount++;
        }

        
        if (line.find("(") != -1 && line.find(")") != -1 &&
            line.find("main") == -1 && line.find("#") == -1) {
            functionCount++;
        }
    }

    file.close();

    cout << "cout statements: " << coutCount << endl;
    cout << "cin statements: " << cinCount << endl;
    cout << "Total lines of code: " << lineCount << endl;
    cout << "Total loops: " << loopCount << endl;
    cout << "User-defined functions: " << functionCount << endl;

    if (ifCount > 0) {
        cout << "If used: YES" << endl;
    } else {
        cout << "If used: NO" << endl;
    }

    if (elseCount > 0) {
        cout << "Else used: YES" << endl;
    } else {
        cout << "Else used: NO" << endl;
    }

    cout << "Header files: " << headerCount << endl;

    return 0;
}

