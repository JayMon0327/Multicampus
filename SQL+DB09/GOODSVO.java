package 화면DB연결;

public class GOODSVO {
	private String ID;
	private String GNUMBER;
	private String GAMOUNT;
	private String GPRICE;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getGNUMBER() {
		return GNUMBER;
	}
	public void setGNUMBER(String gNUMBER) {
		GNUMBER = gNUMBER;
	}
	public String getGAMOUNT() {
		return GAMOUNT;
	}
	public void setGAMOUNT(String gAMOUNT) {
		GAMOUNT = gAMOUNT;
	}
	public String getGPRICE() {
		return GPRICE;
	}
	public void setGPRICE(String gPRICE) {
		GPRICE = gPRICE;
	}
	@Override
	public String toString() {
		return "GOODSVO [ID=" + ID + ", GNUMBER=" + GNUMBER + ", GAMOUNT=" + GAMOUNT + ", GPRICE=" + GPRICE + "]";
	}
	
	
	
	
}
