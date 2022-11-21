package sportsstar;

//import sports.Football;
//import sports.Cricket;

import java.util.Scanner;

class Footballer
{
    int individual_income;

    void calculate_income(int rating1)
    {
        this.individual_income=rating1*100000;
        System.out.println("Individual income of footballer is "+this.individual_income);
    }
}

class Cricketer
{
    int individual_income;

    void calculate_income(int rating2)
    {
        this.individual_income=rating2*120000;
        System.out.println("Individual income of cricketer is "+this.individual_income);

    }

}

public class DriverClass2 {

    public static void main(String args[])
    {

        System.out.println("Package Sports star");

        Footballer f1=new Footballer();
        //Football fo1=new Football();
        //fo1.play();

        System.out.println("Enter the no of football players");
        Scanner sc=new Scanner(System.in);
        int footballer_count=sc.nextInt();
        int[] goals=new int[footballer_count];

        int total_goals=0;
        System.out.println("Enter the no of goals scored or saved by each footballer:");
        for(int i=0;i<footballer_count;i++)
        {
            goals[i]= sc.nextInt();
            total_goals+=goals[i];
        }

        int avg_goals=total_goals/footballer_count;
        f1.calculate_income(avg_goals);

        Cricketer c1=new Cricketer();
        //Cricket cr1=new Cricket();
        //cr1.play();

        System.out.println("Enter the no of cricket players");

        int cricketer_count=sc.nextInt();
        int[] bat_bowl=new int[cricketer_count];

        int total_cricket_score=0;
        System.out.println("Enter the bating or bowling avg of each cricketer");
        for(int i=0;i<cricketer_count;i++)
        {
            bat_bowl[i]= sc.nextInt();
            total_cricket_score+=bat_bowl[i];
        }

        int avg_bat_bowl=total_cricket_score/cricketer_count;
        c1.calculate_income(avg_bat_bowl);


    }
}
