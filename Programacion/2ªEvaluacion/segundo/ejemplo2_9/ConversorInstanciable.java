package segundo.ejemplo2_9;

public class ConversorInstanciable {
	
	private double metros;
	final static double Factor_m_cm=100.0;
	final double Factor_m_mm=1000.0;
	final double Factor_m_pul=39.37;
	final double Factor_m_pies=3.28;
	final double Factor_m_yar=1.09361;
	
	//Constructor
	
	public ConversorInstanciable(double metros) {
		// TODO Auto-generated constructor stub
		this.metros=metros;
	}
	

	@Override
	public String toString() {
		return "ConversorInstanciable [metros=" + metros + ", m_to_cm()=" + m_to_cm() + ", m_to_mm()=" + m_to_mm()
				+ ", m_to_pul()=" + m_to_pul() + ", m_to_pies()=" + m_to_pies() + ", m_to_yar()=" + m_to_yar() + "]";
	}



	public double getMetros() {
		return metros;
	}



	public void setMetros(double metros) {
		this.metros = metros;
	}



	public double m_to_cm() {
		return (Factor_m_cm)*this.metros;
	}

	public double m_to_mm() {
		return (Factor_m_mm)*this.metros;
	}

	public double m_to_pul() {
		return (Factor_m_pul)*this.metros;
	}

	public double m_to_pies() {
		return (Factor_m_pies)*this.metros;
	}

	public double m_to_yar() {
		return (Factor_m_yar)*this.metros;
	}

	


}