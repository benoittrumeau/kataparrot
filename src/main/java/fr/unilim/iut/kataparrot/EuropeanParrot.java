package fr.unilim.iut.kataparrot;

public class EuropeanParrot extends Parrot{

	public EuropeanParrot() {
		super(ParrotTypeEnum.EUROPEAN, numberOfCoconuts, voltage, isNailed);
	}
	
	public double getSpeed() {
		return 12.0;
	}

}
