
public class PopulationGrowth {

	public static void main(String[] args) {
		
		//pull values from args array and assign them to variables
		//growthRate accepts a percent value ex. 75% = 75
		//ARGUMENTS SHOULD BE {INITIAL POPULATION SIZE}, {GROWTH RATE PERCENT}, {NUMBER OF YEARS TO ELAPSE}
		int popSize = Integer.parseInt(args[0]);
		double growthRate = Double.parseDouble(args[1]);
		int timeElapsed = Integer.parseInt(args[2]);
		
		//print the table headers
		System.out.printf("%-20s %-20s", "Elapsed Years " , "Amount");
		System.out.println("\n----------------------------------------");
		
		//for each year over the specified time figure out the new population 
		//while taking advantage of the fact that casting a double to an int
		//truncates the decimals (since you can't have a fraction of a person)
		for(int i=0; i <= timeElapsed; i++) {
			int amount = (int) (popSize * Math.exp((growthRate/100)*(i)));
			System.out.printf("%-20s %-20s\n", i, amount);
		}
	}

}
