package dal.gravity;

public class GravityConstant implements GravityModel{
	private double g;
	
	public GravityConstant(double value){
		g = value;
	}
	
	@Override
	public double getGravity(){
		return g;
	}
}
