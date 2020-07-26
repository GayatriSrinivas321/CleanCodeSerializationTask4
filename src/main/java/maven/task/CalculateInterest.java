package maven.task;

import java.lang.Math;

public class CalculateInterest {
	public double CompundInterest(double principle, float time, double rateOfInterest){
		double ans=principle*(Math.pow((1+rateOfInterest/100), time));
		return(ans);
	}
	public double SimpleInterest(double principle, float time, double rateOfInterest){
		return((principle*rateOfInterest*time)/100);
	}
	
}
