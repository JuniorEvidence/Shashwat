import java.io.*;
import java.util.Scanner;
class Assingmnet{
    public static void main(String[] args)
    {
        // int num=1;
        int input;
        int A=0,B=0,C=0,D=0;
        int counter=0;
        while(true)
        {
            System.out.println("Menu Driven program");
            Scanner x = new Scanner(System.in);
            System.out.println("1: VOTE CAST");
            System.out.println("2: Result Candidate wise");
            System.out.println("3: Comprehesive Result ");
            System.out.println("4: EXIST");
            input = x.nextInt();
            if(input==1)
            {   
                counter++;
                System.out.println("press 1 To cast Vote TO A\npress 2 To cast to B\npress 3 To cast to C\npress 4 To cast to D");
                int Vote=x.nextInt();
                if(counter%3==0 || counter%7==0)
                {
                    C=C+1;
                    if(Vote==1)
                    {
                        System.out.println("Vote Casted To A");
                    }
                    else if(Vote==2)
                    {
                        // B=B+1;
                        System.out.println("Vote Casted To B");
                    }
                    else if(Vote==3)
                    {
                        // C=C+1;
                        System.out.println("Vote Casted To C");
                    }
                    else{
                        // D=D+1;
                        System.out.println("Vote Casted To D");
                    }
                }
                else
                {
                    if(Vote==1)
                    {
                        A=A+1;
                        System.out.println("Vote Casted To A");
                    }
                    else if(Vote==2)
                    {
                        B=B+1;
                        System.out.println("Vote Casted To B");
                    }
                    else if(Vote==3)
                    {
                        C=C+1;
                        System.out.println("Vote Casted To C");
                    }
                    else{
                        D=D+1;
                        System.out.println("Vote Casted To D");
                    }
                }
            }
            else if(input==2)
            {
                System.out.println("1: votes of A");
                System.out.println("2: votes of B");
                System.out.println("3: votes of C");
                System.out.println("4: votes of D");
                int Vote_wise=x.nextInt();
                if(Vote_wise==1)
                {
                    System.out.println("Total votes of A:"+ A);
                }
                else if(Vote_wise==2)
                {
                    System.out.println("Total votes of B:"+B);

                }
                else if(Vote_wise==3)
                {
                    System.out.println("Total votes of C:"+C);
                }
                else{
                    System.out.println("Total votes of D:"+D);
                }
            }
            else if(input==3)
            {
                System.out.println(" Candidates  No of votes");
                System.out.println("  A         "+A);
                System.out.println("  B         "+B);
                System.out.println("  C         "+C);
                System.out.println("  D         "+D);
            }
            else{
                break;
            }

        }
    }
}