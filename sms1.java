import java.util.*;
class Student {
    int id;
    String name;
    long classEnrolled;
    char grade;
    String cityName;
    String moNo;
    double outOfMarks;
    double persentage;
    int noChange;

    void getStudentDetails(int a, int b, double c, double[] abc) {
        Scanner sc = new Scanner(System.in);
        this.id = a;
        System.out.println("Student roll number is : " + a);
        for (int i = 0; i < a; i++) {
            int a1 = i * 5;
            long fackClassEnrolled = 341651155;
            classEnrolled = a1 + fackClassEnrolled;
        }
        System.out.println("Your enrollment number is " + classEnrolled);
        System.out.print("Enter student name : ");
        this.name = sc.nextLine();
        System.out.print("Enter your city name : ");
        this.cityName = sc.nextLine();
        System.out.print("Enter your phone number : ");
        this.moNo = sc.nextLine();
        int a1 = 0;
        while (a1 == 0) {
            String so = moNo;
            if (so.length() != 10) {
                System.out.print("Plese enter 10 digits phone number : ");
                moNo = sc.nextLine();
            } else {
                this.moNo = moNo;
                a1 = 1;
            }
        }
        System.out.println();
        System.out.println("This is for student " + a + " grades details");
        System.out.println();
        double count = 0;
        double z = c/b;
        for (int i = 0; i < b; i++) {
            double xyz = 0;
            double d = c + 1;
            do {

                System.out.print("Enter subject " + (i + 1) + " marks : ");
                xyz = sc.nextDouble();
                if (xyz > abc[i] || xyz < 0) {
                    System.out.println("invalid marks please enter valid marks ");
                }
            } while (xyz > abc[i] || xyz < 0);
            count = count + xyz;
            outOfMarks = count;
            double total = (outOfMarks * 100) / c;
            this.persentage = total;
            if (total > 90)
                this.grade = 'A';
            if (total > 70 && total <= 90)
                this.grade = 'B';
            if (total > 50 && total <= 70)
                this.grade = 'C';
            if (total >= 35 && total <= 50)
                this.grade = 'D';
            if (total < 35)
                this.grade = 'F';
        }
    }

    void studentDisplay()
    {
        System.out.println();
        System.out.println("Student roll number is : " + this.id);
        System.out.println("Student  " + this.id + " name is : " + this.name);
        System.out.println(this.name + "'s phone number : " + this.moNo);
        System.out.println("Student " + this.id + " grade is : " + this.grade);
        System.out.println("Your total is " + this.outOfMarks);
        System.out.println("Your outOff marks is : " + this.outOfMarks);
        System.out.println("Student " + this.id + " persentage is : " + this.persentage + "%");
        System.out.println(this.name + " lives in " + this.cityName);
        System.out.println();
    }

    void studentUpDate(int a, int b, double c, double[] abc)
    {
        Scanner sc = new Scanner(System.in);
        int a1 = 0;
        int ab0 = 0;
        do {
            System.out.println("You will change in student roll number "+a+", name is "+this.name);
            System.out.println();
            System.out.println(" press 1 : If you want to change in name ");
            System.out.println(" press 1 : If you want to change in phone number ");
            System.out.println(" press 3 : If you want to change in your marks ");
            System.out.println(" press 4 : If you want to change in your city name ");
            System.out.println(" press 5 : If you want to exit ");
            System.out.println();
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            noChange = choice;
            a1 = choice;
            switch (choice)
            {
                case 1:
                {
                    System.out.println();
                    System.out.println("You selected change in name ");
                    System.out.println();
                    System.out.println("Your old name is : "+this.name);
                    System.out.print("Enter your new name : ");
                    String tempName = this.name;
                    sc.nextLine();
                    this.name = sc.nextLine();
                    System.out.println("New name is : "+this.name);
                    if (tempName.equals(this.name))
                    {
                        System.out.println();
                        System.out.println("* You entered previous name *");
                        System.out.println();
                        System.out.print("Enter new name : ");
                        this.name = sc.nextLine();
                        if (tempName.equals(this.name))
                        {
                            System.out.print("please enter new and final name : ");
                            this.name = sc.nextLine();
                            System.out.println();
                            System.out.println("Final name after updation is : "+this.name);
                            System.out.println();
                        }
                        else
                        {
                            System.out.println("change Successfully ");
                        }
                    }
                    else
                    {
                        System.out.println(" Change successful ");
                    }
                    System.out.println();
                }
                break;
                case 2:
                {
                    System.out.println();
                    System.out.println("You selected change phone number");
                    System.out.println();
                    System.out.println("your in detail phone number is : "+this.moNo);
                    sc.nextLine();
                    String ab2 = this.moNo;
                    System.out.print("Enter new phone number : ");
                    this.moNo = sc.nextLine();
                    if (ab2.equals(this.moNo))
                    {
                        System.out.println();
                        System.out.println("* you entered previous name *");
                        System.out.println();
                        System.out.print("Enter final phone number : ");
                        this.moNo = sc.nextLine();
                        int a4 = 0;
                        while (a4==0)
                        {
                            String so = moNo;
                            if (so.length()!=10)
                            {
                                System.out.print("Please enter valid phone number : ");
                                moNo = sc.nextLine();
                            }
                            else
                            {
                                a4 = 1;
                            }
                        }
                    }
                    else
                    {
                        int a4 = 0;
                        while (a4==0)
                        {
                            String so = moNo;
                            if (so.length()!=10)
                            {
                                System.out.print("Please enter valid phone number : ");
                                moNo = sc.nextLine();
                            }
                            else
                            {
                                a4 = 1;
                            }
                        }
                    }
                    System.out.println("Updated phone number is : "+this.moNo);
                    System.out.println();
                }
                break;
                case 3:
                {
                    double count = 0;
                    double z = c/b;
                    for (int i = 0; i < b; i++) {
                        double xyz = 0;
                        double d = c + 1;
                        do {

                            System.out.print("Enter subject " + (i+1) + " marks : ");
                            xyz = sc.nextDouble();
                            if (xyz > c && xyz < 0) {
                                System.out.println("invalid marks plese enter valid marks ");
                            }
                        } while (xyz > abc[i] || xyz < 0);
                        count = count + xyz;
                        outOfMarks = count;
                        double total = (outOfMarks * 100) / c;
                        this.persentage = total;
                        if (total > 90)
                            this.grade = 'A';
                        if (total > 70 && total <= 90)
                            this.grade = 'B';
                        if (total > 50 && total <= 70)
                            this.grade = 'C';
                        if (total >= 35 && total <= 50)
                            this.grade = 'D';
                        if (total < 35)
                            this.grade = 'F';
                    }
                }
                break;
                case 4:
                {
                    System.out.println();
                    System.out.println("You selected change in your city name ");
                    System.out.println();
                    System.out.println("Your old city name is : "+this.cityName);
                    System.out.print("Enter your new city name : ");
                    sc.nextLine();
                    String so = sc.nextLine();
                    if (so.equals(this.cityName))
                    {
                        System.out.println();
                        System.out.println("* You enter previous city name *");
                        System.out.println();
                        System.out.print("Enter final city name : ");
                        so = sc.nextLine();
                    }
                    System.out.println();
                    System.out.println("* Change sucessfull *");
                    this.cityName = so;
                    System.out.println("New name is : "+this.cityName);
                }
                break;
                case 5:
                {
                    ab0++;
                }
                default:
                {
                    ab0 = 0;
                }
                break;
            }
        }while (ab0==1);
    }
}



class sms {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
        System.out.println("| WELCOME TO THE SCHOOL MANAGEMENT SYSTEM |");
        System.out.println("-------------------------------------------");
        System.out.println();
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice==0){
            System.out.println("press 1 : If you want to enter in student class ");
            System.out.println("press 2 : If you want to enter in Teacher class ");
            System.out.println("press 3 : If you want to enter in class class ");
            System.out.println("press 4 : If you want to enter in Subject class ");
            System.out.println("press 5 : If you want to enter in School class ");
            System.out.println("press 6 : If you want to exit ");
            System.out.println();
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                {
                    System.out.println();
                    System.out.println("* This is Student class representation *");
                    System.out.println();
                    int noOfStudent;
                    int noOfSubject;
                    double totalWeightage;
                    int choice12 = 0;
                    int choice112;    //for input
                    double sum = 0;
                    double alone;
                    System.out.print("Enter number of student : ");
                    noOfStudent = sc.nextInt();
                    int ab0 = 0;
                    do {
                        if (noOfStudent<=0)
                        {
                            System.out.print("You entered invalid number of student, please enter valid number of student : ");
                            noOfStudent = sc.nextInt();
                        }
                        else
                        {
                            ab0++;
                        }
                    }while (ab0==0);
                    System.out.print("Enter total number of subject : ");
                    noOfSubject = sc.nextInt();
                    ab0 = 0;
                    do {
                        if (noOfSubject<=0)
                        {
                            System.out.print("You entered invalid number of subject, please enter valid number of subject : ");
                            noOfSubject = sc.nextInt();
                        }
                        else
                        {
                            ab0++;
                        }
                    }while (ab0==0);

                    int choice113 = 0;
                    do {
                        System.out.println();
                        System.out.println("Number of student is : "+noOfStudent);
                        System.out.println("number of subject is : "+noOfSubject);
                        System.out.println();
                        System.out.print("press 1 : If you want to change in above details else press any digit--> ");
                        int choice114 = sc.nextInt();
                        choice12 = choice114;
                        System.out.println();
                        if (choice114==1)
                        {
                            System.out.println("press 1 : If you want to change in number of student ");
                            System.out.println("press 2 : If you want to change in number of subject");
                            System.out.println("press 3 : If you want to Exit");
                            System.out.println();
                            System.out.print("Enter your choice : ");
                            int choice115 = sc.nextInt();
                            System.out.println();
                            switch (choice115)
                            {
                                case 1:
                                {
                                    System.out.println("* You select change in number of student  *");
                                    System.out.println();
                                    System.out.print("Enter your new number of student  : ");
                                    int tenpStor = sc.nextInt();
                                    ab0 = 0;
                                    do {
                                        if (tenpStor<=0)
                                        {
                                            System.out.print("You entered invalid number of student, please enter valid number of student : ");
                                            tenpStor = sc.nextInt();
                                        }
                                        else
                                        {
                                            if (tenpStor==noOfStudent)
                                            {
                                                System.out.println("* You enter previous number of student *");
                                                System.out.print("please enter final number of student : ");
                                                tenpStor = sc.nextInt();
                                                System.out.println("* change Successfull *");
                                                noOfStudent = tenpStor;
                                            }
                                            else
                                            {
                                                System.out.println("* change Successfull *");
                                                noOfStudent = tenpStor;
                                            }
                                            ab0++;
                                        }
                                    }while (ab0==0);
                                    System.out.println("After change number of student is "+noOfStudent);
                                }
                                break;
                                case 2: {
                                    System.out.println("* You select change in number of subject  *");
                                    System.out.println();
                                    System.out.print("Enter your new number of subject  : ");
                                    int tenpStor = sc.nextInt();
                                    ab0 = 0;
                                    do {
                                        if (tenpStor <= 0) {
                                            System.out.print("You entered invalid number of subject, please enter valid number of subject : ");
                                            tenpStor = sc.nextInt();
                                        } else {
                                            if (tenpStor == noOfSubject) {
                                                System.out.println("* You enter previous number of subject *");
                                                System.out.print("please enter final number of subject : ");
                                                tenpStor = sc.nextInt();
                                                noOfSubject = tenpStor;
                                            } else {
                                                System.out.println("* change Successfull *");
                                                noOfSubject = tenpStor;
                                            }
                                            ab0++;
                                        }
                                    } while (ab0 == 0);
                                    System.out.println("After change number of subject is " + noOfSubject);
                                    System.out.println();
                                }
                                break;
                                case 3:
                                {
                                    choice113++;
                                }
                                break;
                                default:
                                {
                                   // System.out.println();
                                    System.out.println("* Invalid choice *");
                                    choice113 = 0;
                                }
                            }
                        }
                        else
                        {
                            choice113++;
                        }
                    }while (choice113==0);
                    System.out.println("* Final Data *");
                    System.out.println();
                    System.out.println("Number of student is : "+noOfStudent);
                    System.out.println("number of subject is : "+noOfSubject);
                    System.out.println();
                    System.out.println("* Exam weightage System *");
                    double[] abcMain = new double[noOfSubject];
                    int ab1 = 0;
                    System.out.println();
                    System.out.println("press 1 : If all the papers are of not equal weightage else any digit ");
                    System.out.println();
                    System.out.print("Enter your choice : ");
                    int choice111 = sc.nextInt();
                    System.out.println();
                    double weightageOfSub;
                    double[] abc = new double[ noOfSubject];
                    if (choice111!=1)
                    {
                        double alone1 = 0;
                        System.out.print("Enter weightage of subject : ");
                        alone1 = sc.nextDouble();
                        ab0 = 0;
                        do {
                            if (alone1<=0)
                            {
                                System.out.print("You enter invalid weightage of subject, please enter valid : ");
                                alone1 = sc.nextDouble();
                            }
                            else
                            {
                                ab0++;
                            }
                        }while (ab0==0);
                        sum = noOfSubject * alone1;
                        alone = alone1;
                        for (int i = 0; i<noOfSubject; i++)
                        {
                            abc[i] = alone;
                        }
                        abcMain = abc;
                    }
                    if (choice111==1)
                    {
                        for (int i = 0; i<noOfSubject; i++)
                        {
                            System.out.print("Enter weightage of subject "+(i+1)+" : ");
                            alone = sc.nextDouble();
                            ab0 = 0;
                            do {
                                if (alone<=0)
                                {
                                    System.out.print("You enter invalid weightage of subject, please enter valid : ");
                                    alone = sc.nextDouble();
                                }
                                else
                                {
                                    ab0++;
                                }
                            }while (ab0==0);
                            abc[i] = alone;
                            sum = sum + alone;
                            abcMain = abc;
                        }
                    }
                    totalWeightage = sum;
                    ab0 = 0;
                    do {
                        System.out.println();
                        System.out.println("* Exam weightage System *");
                        System.out.println();
                        for (int i = 0; i<noOfSubject; i++)
                        {
                            System.out.println("subjrct "+(i+1)+" weightage is : "+abcMain[i]);
                        }
                        System.out.println();
                        System.out.print("press 1 : If you want to change in Exam weightage System-->");
                        int choice124 = sc.nextInt();
                        if (choice124==1)
                        {
                            System.out.println();
                            System.out.println("press 1 : If all the papers are of not equal weightage else any digit ");
                            System.out.println();
                            System.out.print("Enter your choice : ");
                            choice111 = sc.nextInt();
                            System.out.println();
                            abc = new double[noOfSubject];
                            if (choice111!=1)
                            {
                                double alone1 = 0;
                                System.out.print("Enter weightage of subject : ");
                                alone1 = sc.nextDouble();
                                ab1 = 0;
                                do {
                                    if (alone1<=0)
                                    {
                                        System.out.print("You enter invalid weightage of subject, please enter valid : ");
                                        alone1 = sc.nextDouble();
                                    }
                                    else
                                    {
                                        ab1++;
                                    }
                                }while (ab1==0);
                                sum = noOfSubject * alone1;
                                alone = alone1;
                                for (int i = 0; i<noOfSubject; i++)
                                {
                                    abc[i] = alone;
                                }
                                abcMain = abc;
                            }
                            if (choice111==1)
                            {
                                for (int i = 0; i<noOfSubject; i++)
                                {
                                    System.out.print("Enter weightage of subject "+(i+1)+" : ");
                                    alone = sc.nextDouble();
                                    ab1 = 0;
                                    do {
                                        if (alone<=0)
                                        {
                                            System.out.print("You enter invalid weightage of subject, please enter valid : ");
                                            alone = sc.nextDouble();
                                        }
                                        else
                                        {
                                            ab1++;
                                        }
                                    }while (ab1==0);
                                    abc[i] = alone;
                                    sum = sum + alone;
                                    abcMain = abc;
                                }
                            }
                            totalWeightage = sum;
                        }
                        else
                        {
                            System.out.println();
                            System.out.println();
                            System.out.println("* Now go for student details *");
                            ab0++;
                        }
                    }while (ab0==0);
                    Student[] s = new Student[noOfStudent];
                    for (int i = 0; i < noOfStudent; i++)
                    {
                        int z = i + 1;
                        s[i] = new Student();
                        System.out.println();
                        System.out.println("Enter " + z + " student details ");
                        System.out.println();
                        s[i].getStudentDetails(z, noOfSubject, totalWeightage, abcMain);
                    }
                    for (int i = 0; i<noOfStudent; i++)
                    {
                        System.out.println();
                        System.out.println("* Student details *");
                        s[i].studentDisplay();
                        System.out.println();
                    }
                    int a5 = 0;
                    int count = 0;
                    do {
                        System.out.print("Press 1 : you want to change in above details else any digit : ");
                        int a4 = sc.nextInt();
                        int upRollNo = 0;
                        a5 = a4;
                        if (a4 == 1) {
                            System.out.println();
                            System.out.print("Enter your roll number : ");
                            upRollNo = sc.nextInt();
                            count = upRollNo;
                            if (count <= noOfStudent)
                            {
                                System.out.println("Student details is ");
                                System.out.println();
                                s[count].studentDisplay();
                                System.out.println();
                                s[count].studentUpDate(upRollNo, noOfSubject, totalWeightage, abcMain);
                                System.out.println();
                            }
                            else {
                                do {
                                    System.out.print("Enter valid roll no : ");
                                    upRollNo = sc.nextInt();
                                } while (upRollNo > noOfStudent);
                                count = upRollNo;
                                System.out.println("Student details is ");
                                System.out.println();
                                s[count].studentDisplay();
                                System.out.println();
                                s[count].studentUpDate(upRollNo, noOfSubject, totalWeightage, abcMain);
                                System.out.println();
                            }
                            if (a4==1)
                            {
                                System.out.println();
                                System.out.println("After updating student details are ");
                                System.out.println();
                                s[count].studentDisplay();
                            }
                        }
                        else {
                            System.out.println("You can go for onther class");
                            System.out.println();
                        }
                    } while (a5 == 1);
                    System.out.println();
                    System.out.println("* All Student Details *");
                    System.out.println();
                    for (int i = 1; i < noOfStudent; i++)
                    {
                        s[i].studentDisplay();
                        System.out.println();
                    }
                }
            }
        }
    }
}