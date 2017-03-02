

public class tester {
	public static void main(String [] args){
		ballGame G1 = new ballGame();
		G1.Display();
		G1.setFirstTeam("USA");
		G1.setSecondTeam("Egypt");
		G1.setPlayersInFirstTeam(14);
		G1.setPlayersInSecondTeam(14);
		G1.setNumberOfSubstitutes(4);
		G1.setFirstTeamScore(0);
		G1.setSecondTeamScore(0);
		G1.TeamAScored(3);
		G1.TeamBScored(4);
		G1.WhoIsWinning();
		G1.Display();
		ballGame G2 = new ballGame("Germany", "Argentina", 13, 13, 5, 5 ,4 );
		G2.WhoIsWinning();
		if(G2.equals(G1)){
			System.out.println("G1 and G2 were the same game");
		}
		else{
			System.out.println("G1 and G2 were NOT the same game");
		}
		soccerGame S1 = new soccerGame("Germany", "Itally", "Johnson", 11, 11 ,5 , 4, 5);
		S1.Display();
		soccerGame S2 = new soccerGame("Germany", "Itally", "Johnson", 11, 11 ,5 , 4, 5);
		S2.Display();
		if(S2.equals(S1)){
			System.out.println("S1 and S2 were the same Soccer game");
		}
		else{
			System.out.println("S1 and S2 were NOT the same Soccer game");
		}
	}
}
