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
		workoutMinutes += min;
	}
	double[] getDailyProgress(){
		double stepsGoal = (dailySteps/goalSteps) * 100;
		double caloriesGoal = (dailyCaloriesBurned/goalCalories) * 100;

		return new double[]{stepsGoal,caloriesGoal};
	}
}
class Main{
	public static void main(String[] args){

	}
}