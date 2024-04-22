public class RandomLetterChooser extends RandomStringChooser
{
	
	public RandomLetterChooser(String str)
	{ 
		/* to be implemented in part (b) */
		private int minSteps, totalSteps;
		private int totalDays, actDays;

		public StepTracker(int goal){
			minSteps = goal;
			totalSteps = 0; 
			totalDays = 0;
			actDays = 0;
		}
		public void addDailySteps(int steps){
			totalSteps += steps;
			totalDays++;
			if(steps >= minSteps)
				actDays++;
		}
		public int activeDays(){
			return actDays;
		}
		public double averageSteps(){
			if(totalDays == 0)
				return 0.0;
			else
				return (double)totalSteps / totalDays;
		}
	}
	
	
	public static String[] getSingleLetters(String str)
	{ 
		String[] letterArray = new String[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			letterArray[i] = ""+str.charAt(i);
		}
		return letterArray;
	}
}
