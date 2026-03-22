class Player{
	String name;
	Player(String name){
		this.name = name;
	}
	String getName(){
		return this.name;
	}
}

class Team{
	String name;
	Player[] players;
	int count;
	Team(String name, int maxPlayers){
		this.name = name;
		players = new Player[maxPlayers];
		count = 0;
	}
	void addPlayer(Player p){
		if(count<players.length){
			players[count] = p;
			count++;
		}
	}
	String getTeamName(){
		return this.name;
	}
	void displayPlayers(){
		for(Player p: players){
			if(p!=null)
			System.out.println(p.name);
		}
	}
}

class Main{
	public static void main(String[] args){
		Player p1 = new Player("Suryakumar Yadav");
		Player p2 = new Player("Shubman Gill");
		Player p3 = new Player("Jasprit Bumrah");
		Player p4 = new Player("Rinku Singh");
		Player p5 = new Player("Hardik Pandya");
		Player p6 = new Player("Sanju Samson");
		Player p7 = new Player("Abhishek Sharma");
		Player p8 = new Player("Arshdeep Singh");
		Player p9 = new Player("Axar Patel");
		Player p10 = new Player("Kuldeep Yadav");

		Team team = new Team("Indian Cricket Team",10);
		team.addPlayer(p1);
		team.addPlayer(p2);
		team.addPlayer(p3);
		team.addPlayer(p4);
		team.addPlayer(p5);
		team.addPlayer(p6);
		team.addPlayer(p7);
		team.addPlayer(p8);
		team.addPlayer(p9);
		team.addPlayer(p10);

		System.out.println("\nTeam Name: "+ team.getTeamName());

		System.out.println("\nTeam Players:");
		team.displayPlayers();
	}
}