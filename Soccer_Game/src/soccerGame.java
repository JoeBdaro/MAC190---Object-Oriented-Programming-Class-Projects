

public class soccerGame extends ballGame {
	private String PrincipleRefereeName;
	private int NumberOfPlayersSubstituted;
	//CONSTRUCTOR
	public soccerGame(String Team1, String Team2, String RefName,  int Team1PlayerNum, int Team2PlayerNum, int TeamSubs, int Team1Score, int Team2Score ){
		super(Team1 = "Unknown", Team2 = "Unknown", Team1PlayerNum = 11, Team2PlayerNum = 11, TeamSubs = 5, Team1Score = 0, Team2Score = 0);
		PrincipleRefereeName = "Unknown";
		NumberOfPlayersSubstituted = 0;
	}
	public soccerGame(String Team1, String Team2, String RefName){
		super(Team1 = "Unknown", Team2 = "Unknown");
		RefName = "Unknown";
	}
	//ACCESSORS
	public String getPrincipleRefereeName(){
		return PrincipleRefereeName;
	}
	public int getNumberOfPlayersSubstituted(){
		return NumberOfPlayersSubstituted;
	}
	//MUTATORS 
	public void setPrincipleRefereeName(String Name){
		PrincipleRefereeName = Name;
	}
	public void getNumberOfPlayersSubstituted(int PlayerNum){
		NumberOfPlayersSubstituted = PlayerNum;
	}
	//override display
	public void Display(){
		super.Display();
		System.out.println("The Name of the Principle referee is: " +PrincipleRefereeName +"\n" +"The Number of players substituted is: " +NumberOfPlayersSubstituted + "\n");
	}
	//OVERRIDE EQUAL
	public boolean Equal(soccerGame A){
		if (super.equals(A) && this.PrincipleRefereeName.equalsIgnoreCase(A.PrincipleRefereeName) && this.NumberOfPlayersSubstituted == A.NumberOfPlayersSubstituted){
			return true;
		}
		else{
			return false;
		}
	}
	//OVERRIDE TEAMSCORED
	public int TeamAScored(int num1, int FirstTeamScore){
		super.TeamAScored(num1);
		return FirstTeamScore =+ num1;
	}
	public int TeamBScored(int num1, int FirstTeamScore){
		super.TeamBScored(num1);
		return FirstTeamScore =+ num1;
	}

}

