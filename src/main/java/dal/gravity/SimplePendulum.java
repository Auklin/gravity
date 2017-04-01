package dal.gravity;

/**
 * Represents pendulums exhibiting (approximately) simple harmonic motion
 */
public class SimplePendulum extends AbstractPendulum {

	private double angularFrequency, periodOfMotion;

	/**
	 * Creates a new Pendulum instance using inLength: the string length (>0)
	 * inMass: the point mass (>0) inTheta0: angular displacement at t=0
	 * (0<=theta0<=pi/6)
	 */
	public SimplePendulum(double inLength, double inMass, double inTheta0, GravityModel g) {
		// pass in the gravitational pull. I was debating creating a 'planet'
		// class but it's not necessary
		// the other option is to pass it a string and in the 'validG' class,
		// check if the planet exists
		super(inLength, inMass, inTheta0, g);
		angularFrequency = Math.sqrt(this.getGravitationalField() / this.getStringLength());
		periodOfMotion = 2 * Math.PI * Math.sqrt(this.getStringLength() / this.getGravitationalField());
	}

	/**
	 * provides this Pendulum's angular frequency
	 */
	public double getAngularFrequency() {
		return angularFrequency;
	}

	/**
	 * provides this Pendulum's period of motion
	 */
	public double getPeriodOfMotion() {
		return periodOfMotion;
	}

	/**
	 * provides the angular displacement of this Pendulum at time t
	 */
	public double getTheta(double t) {
		return this.getMaxAngularDisplacement() * Math.cos(angularFrequency * t);
	}
}
