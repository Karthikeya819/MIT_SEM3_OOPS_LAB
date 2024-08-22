/*
Create a structure STUDENT consisting of variables of structures:
i.	DOB {day, month (use pointer ), year},
ii.	STU_INFO {reg_no, name(use pointer), address},
iii.	COLLEGE {college_name (use pointer), university_name}
where structure types from i to iii are declared outside the STUDENT independently. Show how to read and display member variables of DOB type if pointer variable is created for DOB inside STUDENT and STUDENT variable is also a pointer variable. The program should read and display the values of all members of STUDENT structure.
*/
#include <stdio.h>
#include <stdlib.h>

typedef struct{
    int day;
    int *month;
    int year;
}Date;
typedef struct{
    int reg_no;
    char* name;
    char address[20];
}STUINFO;
typedef struct{
    char* college_name;
    char univ_name[20];
}COLINFO;
typedef struct{
    Date* DOB;
    STUINFO STU_INFO;
    COLINFO COLLEGE;
}STUDENT;

int main(){
    STUDENT* student = (STUDENT*)malloc(sizeof(STUDENT));
    student->DOB = (Date*) malloc(sizeof(Date));
    student->DOB->month = (int*)malloc(sizeof(int));
    printf("Enter Student DOB(Day,Month,Year): ");
    scanf("%d,%d,%d",&student->DOB->day,student->DOB->month,&student->DOB->year);
    student->STU_INFO.name = (char*)malloc(20*sizeof(char));
    printf("Enter Student Info (RegNo,Name,Address): ");
    scanf("%d,%s,%s",&student->STU_INFO.reg_no,student->STU_INFO.name,student->STU_INFO.address);
    student->COLLEGE.college_name = (char*)malloc(20*sizeof(char));
    printf("Enter College Info(College Name,Univ Name): ");
    scanf("%s,%s",student->COLLEGE.college_name,student->COLLEGE.univ_name);
    printf("Student DOB(Day,Month,Year): %d,%d,%d \n",student->DOB->day,*student->DOB->month,student->DOB->year);
    printf("Student Info (RegNo,Name,Address): %d,%s,%s \n",student->STU_INFO.reg_no,student->STU_INFO.name,student->STU_INFO.address);
    printf("College Info(College Name,Univ Name): %s,%s \n",student->COLLEGE.college_name,student->COLLEGE.univ_name);
    return 0;
}