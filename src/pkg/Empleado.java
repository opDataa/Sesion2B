package pkg;

public class Empleado {

	public enum TipoEmpleado{VENDEDOR, ENCARGADO};

	
	private float salarioBase;
	private float primas;
	private float extras;
	
	public float calculoMonimaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		
		// Determinar Salario Base 
		switch(tipo) {
			case TipoEmpleado.VENDEDOR:
				this.salarioBase = 2000;
			break;
			case TipoEmpleado.ENCARGADO:
			this.salarioBase = 2500;
			break;
		}
		
		// Determinar primas
		if(ventasMes>=1500) {
			this.primas = 200;
		}
		else if(ventasMes>=1000) {
			this.primas = 100;
		}
		
		
		// Determinar Horas Extras
		this.extras = horasExtra* 30;
	
		
		return this.salarioBase+this.primas+this.extras;
		
	}
	
	
	
	public float calculoNominaNeta(float nominaBruta) {
		float retencion= 0;
		
		
		if(nominaBruta>=2500) {
			retencion = 0.18f;
		}
		else if(nominaBruta >= 2100) {
			retencion = 0.15f;
		}
		
		
		return nominaBruta+(1-retencion);
		
	}
}
