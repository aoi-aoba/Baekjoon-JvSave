#include "aplusb.h"

std::vector<int> arrA;
std::vector<int> arrB;

void initialize(std::vector<int> A, std::vector<int> B) {
    arrA = A;
    arrB = B;
    return;
}

int answer_question(int i, int j) {
    return arrA[i] + arrB[j];
}
