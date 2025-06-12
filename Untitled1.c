#include <stdio.h>

typedef struct
{
	char id[9];
	char first_name[30];
	char last_name[30];
	double gpa;
} Student;

Student student[10000];
int student_count = 0;

void load_student_information(Student student[]);  // Need implementation
void write_student_information(Student student[], char id[], char first_name[], char last_name[], double gpa); // Need implementation


int main()
{
	// Write your code here to implement the main() module

	return 0;
}
