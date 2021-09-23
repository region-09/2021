#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int main() {  
    // Declaring the sequence to be searched into
    vector<int> v1 = { 1, 2, 0, 4, 5, 6, 9 }; // imagine v.end() as index at 7 but v1 has only maximum untill 6 indices
                    // 0  1  2  3  4  5  6  7      
    
    // Declaring the subsequence to be searched for
    vector<int> v2 = { 0, 4, 5 };
  
    // Declaring an iterator for storing the returning pointer
    vector<int>::iterator i1;
  
    // Using std::search and storing the result in
    // iterator i1
    i1 = std::search(v1.begin(), v1.end(), v2.begin(), v2.end());
    
    // checking if iterator i1 contains end pointer of v1 or not
    if (i1 != v1.end()) {
        cout << "vector2 is present at index " << (i1 - v1.begin());  // In this case i1 = 2 and v1.end() = 7 
    } else {
        cout << "vector2 is not present in vector1";   // here we will have i1 == v1.end() --> like this: [7 == 7]
    }
  
    return 0;
}
