public class Problem16 {
    /*Fitness Tracker

A health and wellness company wants to build a Fitness Tracker in Java to help users monitor their daily step count and estimate calorie expenditure.
The program should demonstrate methods, parameterized methods, and method overloading, while providing an interactive and meaningful user experience.

The system must allow users to input their daily steps, calculate calories burned using different methods, and display a personalized summary report.

Real-World Context
The company, FitTrack Technologies, plans to launch a digital wellness program for employees.
The tracker will record the number of steps each employee takes daily and estimate the calories they burn — either:

using a standard formula (for general users), or
an adjusted formula that considers user weight (for personalized tracking).
This system will serve as a prototype for their upcoming mobile fitness app.

Sample User Data
User	Steps	Weight (kg)
1		5000	60
2		10000	70
3		7500	65
4		12000	80


Methods Overview
1. inputSteps()
Type: No-argument method
Purpose: Prompts the user to enter their daily step count using the Scanner class.

2. calculateCalories(int steps)
Type: Parameterized method
Purpose: Calculates calories burned based only on step count.
Formula:
Calories = steps × 0.04
Returns: Estimated calories burned (without weight consideration).

3. calculateCalories(int steps, double weight) (Overloaded Method)
Type: Parameterized and Overloaded method
Purpose: Calculates calories burned considering the user’s weight for better accuracy.
Formula:
Calories = steps × weight × 0.0005
Returns: Personalized calorie estimate.

4. showSummary()
Type: No-argument method
Purpose: Displays a summary showing total steps and calories burned for the day.

Example Workflow
1> Accept user input using inputSteps().
Example:
Steps = 10000
Weight = 70 kg

2> Compute calories burned using either:
Standard formula: calculateCalories(steps)
Weight-adjusted formula: calculateCalories(steps, weight)

3> Round the result using Math.round() for a clean display.

4> Display results using showSummary().

Example Output
Total Steps: 10000
Calories Burned: 350

Explanation:
Calories = 10000 × 70 × 0.0005 = 350
The program calculates calories based on the user’s step count and weight, rounding the result for clear presentation. */

    public static void main(String[] args) {
        // Sample user data
        int[] stepsArray = {5000, 10000, 7500, 12000};
        double[] weightArray = {60, 70, 65, 80};

        for (int i = 0; i < stepsArray.length; i++) {
            int steps = stepsArray[i];
            double weight = weightArray[i];

            // Calculate calories using the overloaded method
            double caloriesBurned = calculateCalories(steps, weight);

            // Round the result
            long roundedCalories = Math.round(caloriesBurned);

            // Display summary
            System.out.println("User " + (i + 1) + " Summary:");
            System.out.println("Total Steps: " + steps);
            System.out.println("Calories Burned: " + roundedCalories);
            System.out.println();
        }
    }

    // Method to calculate calories based on steps only
    public static double calculateCalories(int steps) {
        return steps * 0.04;
    }

    // Overloaded method to calculate calories based on steps and weight
    public static double calculateCalories(int steps, double weight) {
        return steps * weight * 0.0005;
    }

    
}
