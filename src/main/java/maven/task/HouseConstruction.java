package maven.task;

public class HouseConstruction {
	public double estimatedCost(String std, double area, boolean automated){
		if(std.equalsIgnoreCase("standard") && automated==false){
			return(area*1200);
		}else if(std.equalsIgnoreCase("above standard") && automated==false){
			return(1500*area);
		}else if(std.equalsIgnoreCase("high standard") && automated==false){
			return(1800*area);
		}else if(std.equalsIgnoreCase("high standard") && automated==true){
			return(2500*area);
		}
		return 0;
	}
}
