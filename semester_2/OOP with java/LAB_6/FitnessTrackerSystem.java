class FitnessTracker{
	private String userName;
	private int dailySteps;
	private double dailyCaloriesBurned;
	private int workoutMinutes;
	private int[] weeklySteps = new int[7];
	private int goalSteps;
	private double goalCalories;

	FitnessTracker(String userName,int goalSteps,double goalCalories){
		this.userName = userName;
		this.goalSteps = goalSteps;
		this.goalCalories = goalCalories;
	}
	void addSteps(int steps){
		if(steps>0){
			this.dailySteps +=steps;
		}
	}
	double calculateCaloriesBurned(int min, String workoutType){
		if(workoutType.equals("Running")){
			return min * 10;
		}
		else if(workoutType.equals("Walking")){
			return min * 5;
		}
		else if(workoutType.equals("Cycling")){
			return min * 8;
		}
		else if(workoutType.equals("Swimming")){
			return min * 12;
		}
		else 
			return min * 6;
	}
	void recordWorkout(int min, String workoutType){
		dailyCaloriesBurned += calculateCaloriesBurned(min,workoutType);
		workoutMinutes += min;
	}
	void recordWorkout(int min){
		weeklySteps = new int[]{100,456,345,321,43,768,432}; 
			}
	double[] getDailyProgress(){
		double stepsGoal = (dailySteps/(double)goalSteps) * 100;
		double caloriesGoal = (dailyCaloriesBurned/goalCalories) * 100;

		return new double[]{stepsGoal,caloriesGoal};
	}
	int getBestDay(){
		int highest = weeklySteps[0];
		int day = 0;
		for(int i=1; i<weeklySteps.length;i++){
			if(weeklySteps[i]>highest){
				highest = weeklySteps[i];
				day =i;
			}
		}
		return day;
	}
	boolean isGoalAchieved(){
		if(dailySteps>=goalSteps && dailyCaloriesBurned>=goalCalories){
			return true;
		}
		else 
			return false;
	}
	void resetDailyStats(){
		this.dailySteps = 0;
		this.dailyCaloriesBurned = 0;
		this.workoutMinutes =0;
	}
	String getFitnessReport(){
		return String.format("User Name: %s\nDaily Steps: %d\nCalories Burned: %.2f\nTotal workout Minutes: %d\n",userName,dailySteps,dailyCaloriesBurned,workoutMinutes);
	}

}
class Main{
	public static void main(String[] args){
		FitnessTracker tracker1 = new FitnessTracker("Kamran",2200,6730);

		// 2. Add steps throughout the day
        tracker1.addSteps(1000);
        tracker1.addSteps(1500); // Total steps: 2500

        // 3. Record different types of workouts & 4. Calculate calories burned
        tracker1.recordWorkout(45, "Running");   // 45 * 10 = 450 cals
        tracker1.recordWorkout(30, "Swimming");  // 30 * 12 = 360 cals

        // 5. Track weekly progress (Using your dummy data method)
        tracker1.recordWorkout(0); // Calling the overloaded method to populate the dummy array
        System.out.println("Best day of the week (Index 0-6): Day " + tracker1.getBestDay());

        // 6. Check if goals are achieved
        System.out.println("Are Kamran's goals achieved? " + tracker1.isGoalAchieved());

        // 7. Generate fitness report
        System.out.println("\nKamran's Report:");
        System.out.println(tracker1.getFitnessReport());


        System.out.println("\n--- COMPARING TWO USERS ---");
        
        // 8. Compare progress between two users
        FitnessTracker tracker2 = new FitnessTracker("Sara", 5000, 1000);
        
        // Add some data for Sara
        tracker2.addSteps(6000);
        tracker2.recordWorkout(60, "Cycling"); 
        
        System.out.println("Sara's Report:");
        System.out.println(tracker2.getFitnessReport());
        
        // Perform the comparison
        System.out.println("--- Comparison Results ---");
        if (tracker1.calculateCaloriesBurned(720,"Swimming") > tracker2.calculateCaloriesBurned(600,"Cycling")) {
            System.out.println("Kamran burned more calories today!");
        } else if (tracker2.calculateCaloriesBurned(600,"Cycling") > tracker1.calculateCaloriesBurned(720,"Swimming")) {
            System.out.println("Sara burned more calories today!");
        } else {
            System.out.println("Kamran and Sara burned the exact same amount of calories!");
        }
        
        System.out.println("Kamran Goal Achieved: " + tracker1.isGoalAchieved());
        System.out.println("Sara Goal Achieved: " + tracker2.isGoalAchieved());
	}
}