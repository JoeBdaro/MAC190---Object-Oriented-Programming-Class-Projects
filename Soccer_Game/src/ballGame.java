
public class ballGame {

	private String FirstTeam;
	private String SecondTeam;
	private int PlayersInFirstTeam;
	private int PlayersInSecondTeam;
	private int NumberOfSubstitutes;
	private int FirstTeamScore;
	private int SecondTeamScore;

	//CONSTRUCTORS
	public ballGame(){
		FirstTeam = "Unknown";
		SecondTeam = "Unknown";
		PlayersInFirstTeam = 0;
		PlayersInSecondTeam = 0;
		NumberOfSubstitutes = 0;
		FirstTeamScore = 0;
		SecondTeamScore = 0;
	}
	public ballGame(String Team1,String Team2){
		setFirstTeam(Team1);
		setSecondTeam(Team2);
	}
	public ballGame(String Team1, String Team2, int Team1PlayerNum, int Team2PlayerNum, int TeamSubs, int Team1Score, int Team2Score){
		setFirstTeam(Team1);
		setSecondTeam(Team2);
		setPlayersInFirstTeam(Team1PlayerNum);
		setPlayersInSecondTeam(Team2PlayerNum);
		setNumberOfSubstitutes(TeamSubs);
		setFirstTeamScore(Team1Score);
		setSecondTeamScore(Team2Score);
	}
	//ACCESSORS
	public String getFirstTeam(){
		return FirstTeam;
	}
	public String getSecondTeam(){
		return SecondTeam;
	}
	public int getPlayersInFirstTeam(){
		return PlayersInFirstTeam;
	}
	public int getPlayersInSecondTeam(){
		return PlayersInSecondTeam;
	}
	public int getNumberOfSubstitutes(){
		return NumberOfSubstitutes;
	}
	public int getFirstTeamScore(){
		return FirstTeamScore;
	}
	public int getSecondTeamScore(){
		return SecondTeamScore;
	}
	//MUTATORS
	public void setFirstTeam(String Name1){
		FirstTeam = Name1;
	}
	public void setSecondTeam(String Name2){
		SecondTeam = Name2;
	}
	public void setPlayersInFirstTeam(int Players1){
		PlayersInFirstTeam = Players1;
	}
	public void setPlayersInSecondTeam(int Players2){
		PlayersInSecondTeam = Players2;
	}
	public void setNumberOfSubstitutes(int Substitutes){
		NumberOfSubstitutes = Substitutes;
	}
	public void setFirstTeamScore(int Score1){
		FirstTeamScore = Score1;
	}
	public void setSecondTeamScore(int Score2){
		SecondTeamScore = Score2;
	}
	//METHODS
	public int TeamAScored(int num1){
		return FirstTeamScore =+ num1;
	}
	public int TeamBScored(int num2){
		return SecondTeamScore =+ num2;
	}
	//DISPLAY
	public void Display(){
		System.out.println("The first team is called: "+FirstTeam +"\n" +"The second team is called: "  +SecondTeam + "\n" + "The number of players in" +getFirstTeam() +" is: " +PlayersInFirstTeam +"\n"+ "The number of players in" +getSecondTeam()+ " is: " +PlayersInSecondTeam +"\n" +"The number of substitutes is: " +NumberOfSubstitutes + "\n" + "The Score for " +getFirstTeam() +" is: " +FirstTeamScore + "\n" +"The Score for " +getSecondTeam() +" is: " +SecondTeamScore + "\n");
	}
	//CHECKS IF EQUAL
	public boolean Eqaul(ballGame ballGame){
		if(this.FirstTeam.equals(ballGame.FirstTeam) && this.SecondTeam.equals(ballGame.FirstTeam) && this.PlayersInFirstTeam == ballGame.PlayersInFirstTeam && this.PlayersInSecondTeam == ballGame.PlayersInSecondTeam && this.NumberOfSubstitutes == ballGame.NumberOfSubstitutes && this.FirstTeamScore == ballGame.FirstTeamScore && this.SecondTeamScore == ballGame.SecondTeamScore){
			return true;
		}
		else{
			return false;
		}
	}
	//WHOS WINNING
	public void WhoIsWinning(){
		if (getFirstTeamScore() > getSecondTeamScore()){
			System.out.println(getFirstTeam() + " is WINNING!!!");
		}
		if (getFirstTeamScore() < getSecondTeamScore()){
			System.out.println(getSecondTeam() + " is WINNING!!!");
		}
		if (getFirstTeamScore() == getSecondTeamScore()){
			System.out.println("It's a Draw");
		}
	}
}


