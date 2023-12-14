
class ForTest{
public static void main(String[] args){
int m = 7;
int n = m + 'a' - 'X';
int i = m;
for (; i <= n;) {
m += i++;
}
System.out.println("i = " + i + " m = " + n + " n = " + m);
}
}