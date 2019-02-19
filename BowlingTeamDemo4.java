//Filename: BowlingTeamDemo.java
//Author: Damian Lester       
//Date: 2.8.19

import java.util.*;

public class BowlingTeamDemo4
{
    public static void main(String[] args) 
    {
        //Variables and costants        
        String name;
        BowlingTeam bowlTeam = new BowlingTeam();
        int x;
        int y;
        final int NUM_TEAM_MEMBERS = 4;
        final int NUM_TEAMS = 4;
        BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
        Scanner input = new Scanner(System.in);

        getTeamData(teams);

        //Wrap the existing prompts into a for loop that will execute as many times as needed to build all teams        
        for(y = 0; y < NUM_TEAMS; ++y)
        {
            //Have the y loop create a new bowling team object each time through
            teams[y] = new BowlingTeam();

            //Prompt the user for a team name.Accept it and then assign it to the bowling team object
            System.out.print("Enter a team name >> ");
            name = input.nextLine();
            teams[y].setTeamName(name);

            //Loop that executes four times. Each time it asks the user for a members name, and assigns it to the array in the bowlingteam object
            for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
            {
                System.out.print("Enter a team members name >> ");
                name = input.nextLine(); 
                teams[y].setMember(x, name);
            }
        } //End of the y loop

            //Display the details of the bowling team object  
            for(y = 0; y< NUM_TEAMS; ++y)
            {
                System.out.println("\nMembers of team " + teams[y].getTeamName());
                for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
                {
                    System.out.print(teams[y].getMember(x) + " ");
                }
                System.out.println();
            }
            System.out.println("\n\nEnter a team name to see its roster >> ");
            name = input.nextLine();

            //Outer loop will loop through every team in the teams array
            for(y = 0; y < teams.length; y++)
            {
                if(name.equalsIgnoreCase(teams[y].getTeamName()))
                {
                    // only do this when a team name has a match
                    for(x = 0; x < NUM_TEAM_MEMBERS; x++)
                    {
                        System.out.print(teams[y].getMember(x) + "  ");
                    }
                }
            }
            System.out.println();
    }
    public static void getTeamData(ti)
    {
        //Variables and costants        
        String name;
        int x;
        int y;
        final int NUM_TEAM_MEMBERS = 4;
        final int NUM_TEAMS = 4;
        BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
        Scanner input = new Scanner(System.in);

        getTeamData(teams);
        //Display the details of the bowling team object  
        for(y = 0; y< NUM_TEAMS; ++y)
        {
            System.out.println("\nMembers of team " + teams[y].getTeamName());
            for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
            {
                System.out.print(teams[y].getMember(x) + " ");
            }
            System.out.println();
        }
        System.out.println("\n\nEnter a team name to see its roster >> ");
        name = input.nextLine();
    }
}