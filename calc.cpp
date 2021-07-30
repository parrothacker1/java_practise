// calculator in cpp
#include <iostream>
using namespace std;

void process(string process) {
	int x,y,out,i;
	cout << "Enter the first number: ";
	cin >> x;
	cout << "Enter the second number: ";
	cin >> y;
	if (process=="add") {
		i=1;
	} else if (process=="sub") {
		i=2;
	} else if (process=="multiply") {
		i=3;
	} else if (process=="div") {
		i=4;
	}
	switch (i) {
		case 1:
			out=x+y;
			break;
		case 2:
			out=x-y;
			break;
		case 3:
			out=x*y;
			break;
		case 4:
			out=x/y;
			break;
	}
	cout << "The " << process << " is " << out;
}

int main() {
	int des;
	cout << "1.Addition \n2.Subtraction \n3.Multiplication \n4.Division";
	while (true) {
		int i=0;
		cout << "\n\n Enter the option: ";
		cin >> des;
		switch (des) {
			case 1:
				process("add");
				break;
			case 2:
				process("sub");
				break;
			case 3:
				process("multiply");
				break;
			case 4:
				process("div");
				break;
			default:
				cout << "Please enter a valid option !";
				i=1;
				break;
		}
		if (i==0) {
			break;
		} else {
			continue;
		}
	}
	return 0;
}
