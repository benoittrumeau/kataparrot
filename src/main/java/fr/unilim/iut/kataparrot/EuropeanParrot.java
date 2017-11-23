package fr.unilim.iut.kataparrot;

public class EuropeanParrot extends Parrot{

	private static final double BaseSpeed = 12.0;
	public EuropeanParrot() {
		super(ParrotTypeEnum.EUROPEAN);
	}
	
	public double getSpeed() {
		return BaseSpeed;
	}

}
