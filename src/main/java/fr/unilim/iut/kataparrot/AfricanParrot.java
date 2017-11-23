package fr.unilim.iut.kataparrot;

public class AfricanParrot extends Parrot{

	public AfricanParrot(int numberOfCoconuts) {
		super(ParrotTypeEnum.AFRICAN, numberOfCoconuts, voltage, isNailed);
	}

	public double getSpeed() {
		return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
	}
}
