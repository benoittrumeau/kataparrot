package fr.unilim.iut.kataparrot;

public class AfricanParrot extends Parrot{

	private double LoadFactor = 9.0;
	private int numberOfCoconuts = 0;
	
	public AfricanParrot(int numberOfCoconuts) {
		super(ParrotTypeEnum.AFRICAN, voltage, isNailed);
		this.numberOfCoconuts = numberOfCoconuts;
	}

	public double getSpeed() {
		return Math.max(0, getBaseSpeed() - LoadFactor * this.numberOfCoconuts);
	}
}