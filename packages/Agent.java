package packages;
import packages.Enviornment;

public interface Agent {
	boolean[] getAction();

//	void integrateObservation(Environment environment);

	void giveIntermediateReward(float intermediateReward);
	public void reset();
	public void setObservationDetails(int rfWidth, int rfHeight, int egoRow, int egoCol);
	public String getName();
	public void setName(String name);
}
