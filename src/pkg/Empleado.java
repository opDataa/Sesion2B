package pkg;

public class Empleado {

	public enum TipoEmpleado{VENDEDOR, ENCARGADO};

	
	public static float calculoMonimaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		
		
		float salarioBase = 0;
		// Determinar Salario Base 
		switch(tipo) {
			case TipoEmpleado.VENDEDOR:
				salarioBase = 2000;
			break;
			case TipoEmpleado.ENCARGADO:
				salarioBase = 2500;
			break;
		}
		
		// Determinar primas
		float primas = 0;
		if(ventasMes>=1500) {
			primas = 200;
		}
		else if(ventasMes>=1000) {
			primas = 100;
		}
		
		
		// Determinar Horas Extras
		float extras = horasExtra* 30;
	
		
		return salarioBase+primas+extras;
		
	}
	
	
	
	public static float calculoNominaNeta(float nominaBruta) {
		float retencion= 0;
		
		
		if(nominaBruta>=2500) {
			retencion = 0.18f;
		}
		else if(nominaBruta >= 2100) {
			retencion = 0.15f;
		}
		
		
		return nominaBruta*(1-retencion);
		
	}
}
