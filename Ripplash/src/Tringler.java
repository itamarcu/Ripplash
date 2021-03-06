public class Tringler
{
	public static int	radius				= 24;
	double				x;
	double				y;
	double				chargeTimeLeft;
	double				chargeDelay			= 4;
	double				rotation;
	double				xVel, yVel;
	double				prevDistPow2		= 9999999;	// to know when to stop dashing
	boolean				slowDown			= true;
	boolean				gonnaPlayDashSound	= false;

	public Tringler(double x_, double y_)
	{
		x = x_;
		y = y_;
		chargeTimeLeft = 3.9;
		rotation = 0;
		xVel = 0;
		yVel = 0;
	}

	public Tringler(double x_, double y_, double phase)
	{
		this(x_, y_);
		chargeTimeLeft = chargeDelay * phase;
	}
}
