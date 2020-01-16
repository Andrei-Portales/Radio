import java.util.ArrayList;

public class Radio implements RadioInterface{

	private ArrayList<String> frecuenciasAM;
	private ArrayList<String> frecuenciasFM;
	private boolean estado;
	private String tipoEmisora;
	private String estacionActual;
	
	
	
	public Radio() {
		frecuenciasAM = new ArrayList<String>();
		frecuenciasFM = new ArrayList<String>();
		estado = false;
		tipoEmisora = "FM";
		estacionActual = "";
		
	}
	
	
	
	
	
	
	@Override
	public void onOff() {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void cambiarFrecuencia() {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void avanzar() {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void guardar(int boton) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void seleccionarEmisora(int boton) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public String estacionActual() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public boolean estado() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
}
