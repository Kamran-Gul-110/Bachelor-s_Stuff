#include <iostream>
#include <fstream>
#include <string>
using namespace std;
int main() {

    //PART A 
    ifstream file1;
    file1.open("dummy.txt");

    if (!file1.is_open()) {
        cout << "dummy.txt not found";
        return 0;
    }

    string line;
    string text = "";

    while (getline(file1, line)) {
        cout << line << endl;
        text = text + line + " ";
    }

    file1.close();


    //PART B 
    int letters = 0;
    int words = 1;    
    int sentences = 0;

    for (int i = 0; i < text.length(); i++) {

        if ((text[i] >= 'a' && text[i] <= 'z') ||
            (text[i] >= 'A' && text[i] <= 'Z')) {
            letters++;
        }

        if (text[i] == ' ') {
            words++;
        }

        if (text[i] == '.' || text[i] == '!' || text[i] == '?') {
            sentences++;
        }
    }


    //PART C
    ofstream file2;
    file2.open("info-dummy.txt");

    file2 << "Letters: " << letters << endl;
    file2 << "Words: " << words << endl;
    file2 << "Sentences: " << sentences << endl;

    file2.close();


    //PART D
    ifstream file3;
    file3.open("info-dummy.txt");

    string temp;
    int L, W, S;

    file3 >> temp >> L;
    file3 >> temp >> W;
    file3 >> temp >> S;

    file3.close();

    int total = L + W + S;

    cout << endl;
    cout << "Letters: " << L << endl;
    cout << "Words: " << W << endl;
    cout << "Sentences: " << S << endl;
    cout << "Output: " << total << endl;

    return 0;
}

