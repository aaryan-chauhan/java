class Test {
int marks = 25;
boolean isPass(double marks) {
if (marks >= 12.5 && marks <= 25) {
return true;
} else {
return false; } }
Test() {
System.out.print(isPass(marks / 2)); } }
class T4 extends Test {
String result;
T4() {
if (isPass(marks)) {
result = "celebrate";
} else {
result = "Read";}
System.out.print(result); } }
class Run {
public static void main(String[] args) {
T4 t4 = new T4();} }