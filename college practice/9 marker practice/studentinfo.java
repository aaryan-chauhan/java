import java.util.Scanner;

class Student{

boolean start = false;

int default_PW= 1234;

int mark_maths, mark_phy, mark_java;

Scanner sc = new Scanner(System.in);

void login() {

for (int i=1;i<=2;i++) {

System.out.println("Enter Password: ");

int user_pw = sc.nextInt();

if (default_PW == user_pw) {

System.out.println("Successful Login");

start = true;

resetPassWord();

break;

} else {

System.out.println("Invalid Password");

start false;

}

if (start = false){

System.out.println("Your account is locked for 1 hour");

}

void resetPassWord(){

System.out.println("Reset Password");

boolean flag = false;

while (flag == false) {

System.out.println("Enter New Password: ");

int pw = sc.nextInt();

if (pw>= 1000 && pw <= 9999) {

default PW = pw;

flag = true;

break;

} else {

System.out.println("Invalid combination, enter valid password");

flag = false;

} }

}

void set(){

System.out.println("Enter marks of Physics: ");

mark phy sc.nextInt();

System.out.println("Enter marks of Maths: "); mark_maths = sc.nextInt();

System.out.println("Enter marks of Java: ");

mark java sc.nextInt();

} void display(double sub1, double sub2, double sub3){

System.out.println("Percentage of Maths: "+sub1+"%"); %");

System.out.println("Percentage of Physics: "+sub2+" System.out.println("Percentage of Java: "+sub3+"%");

}
void enterMarks (Student s[])

for (int i=0;i<s.length;i++){ s[i] = new Student();

System.out.println("Enter Data for Student "+(1+1)); s[i].set();

}

Student calculateSubjectTotal (Student s1, Student s2, Student s3) (

Students new Student();

s.mark_maths s1.mark maths s2.mark maths s3.mark maths: s.mark_phys1.mark phy s2.mark_phy s3.mark_phy; s.mark java = s1.mark java s2.mark java s3.mark java; return s;

String subjectRanking (double a, double b, double c){

if (a>b && a>c) {

return "Maths";

else if (b>c) {

return "Java";

else {

return "Phy";

}

class Main(

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Welcome to Online Exam System");

Students new Student();

Student s1 = new Student();

Student s2 new Student();

s.login();

if (s.start == true) {

System.out.println(s.default_PW); Student sarr[] = new Student[3];

s1.enterMarks(sarr);

s2 s2.calculateSubjectTotal(sarr[0], sarr[1], sarr[2]); double perc math (s2.mark_maths 25.0)/75;

double perc java (s2.mark_java 25.0)/75;

double perc phy = (s2.mark_phy 25.6)/75;

String rank_subs.subjectRanking(perc_math, perc java, perc_phy); s.display(perc_math, perc_phy, perc_java);

System.out.println("Highest Result is in subject: " + rank sub);

}

}

}