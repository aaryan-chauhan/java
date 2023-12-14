
class ForTest
{
public static void main(String args[])
{
int number = 496;
int sum = 0;
for (int i = 1; i < number; i++)
{
if (number % i == 0)
sum = sum + i;
}
System.out.print((sum == number) ? "Yes" : "No");
}
}