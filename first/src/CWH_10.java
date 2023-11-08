package com.company;
class Test1{
    public static void main(String exam[]){
        byte a = 126; char ch = 'f'; int c = a % 1;
        a+=2;
        ch=++ch;
        System.out.print(ch+a+c+" ");
        a-=1;
        ch=ch--;
        System.out.print(ch+a+c);
    }
}
