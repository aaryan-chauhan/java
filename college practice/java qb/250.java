
class ForTest{
public static void main(String[] args) {
for (char i = 'A'; i <= 'G'; i++) {
if (i % 5 == 0) {
System.out.print((char) (i - 'A' + 'a'));
}
else if (i % 2 == 0) {
System.out.print((int) i);
}
else {
System.out.print(i);
}
System.out.print('~');
}}}