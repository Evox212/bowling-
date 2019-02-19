//Filename: BowlingTeam.java 
//Author: Damian Lester

public class BowlingTeam
{
    private String teamName;
    private String[] members = new String[4];

    //Mutator method (setter) for the teamName field           
    public void setTeamName(String team)
    {
        teamName = team;
    }

    //Accessor method (getter) for the teamName field               
    public String getTeamName()
    {
        return teamName;
    }

    //mutator method (setter) for the members array           
    public void setMember(int number, String name)
    {
        members[number] = name;
    }

    //Accessor method (getter) for the individual member names           
    public String getMember(int number)
    {
        return members[number];
    }
}