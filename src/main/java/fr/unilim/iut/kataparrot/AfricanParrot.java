package fr.unilim.iut.kataparrot;

public class AfricanParrot extends Parrot{

	private static final double LoadFactor = 9.0;
	private static final double BaseSpeed = 12.0;
	private int numberOfCoconuts = 0;
	
	public AfricanParrot(int numberOfCoconuts) {
		super(ParrotTypeEnum.AFRICAN);
		this.numberOfCoconuts = numberOfCoconuts;
	}

	public double getSpeed() {
		return Math.max(0, BaseSpeed - LoadFactor * this.numberOfCoconuts);
	}
}