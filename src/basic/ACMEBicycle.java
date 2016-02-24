package basic;

public class ACMEBicycle implements Bicycle_one {
	 	
		int cadence = 0;
	    int speed = 0;
	    int gear = 1;

	 // The compiler will now require that methods
	    // changeCadence, changeGear, speedUp, and applyBrakes
	    // all be implemented. Compilation will fail if those
	    // methods are missing from this class.

	@Override
	public void changeCadence(int newValue) {
		// TODO Auto-generated method stub
		cadence = newValue;
	}

	@Override
	public void changeGear(int newValue) {
		// TODO Auto-generated method stub
		gear = newValue;
	}

	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		speed = speed + increment;
	}

	@Override
	public void applyBrakes(int decrement) {
		// TODO Auto-generated method stub
		speed = speed - decrement;
	}

	void printStates() {
        System.out.println("cadence:" +
            cadence + " speed:" + 
            speed + " gear:" + gear);
	}
}