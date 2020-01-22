public class Radio 
{
  boolean estado;
  boolean amFm; 
  String[] estacionactual;
  String[] guardadasAm;
  String[] guardadasFm;

  public void OnOff(){
  	if (estado){
  		estado=false;
  	}
  	else{
  		estado=true;
  	}
  }

  public void cambiarFrecuencia(){
  	if (amFm){
  		amFm=false;
  	}
  	else{
  		amFm=true;
  	}
  }

  public void avanzar(){
  	if (amFm){
  		if (estacionactual[0]<1610){
  			estacionactual[0]=estacionactual[0]+10;
  		} else if (estacionactual[0]==1610){
  			estacionactual[0]=530;
  		}
  	}
  	else{
  		if (estacionactual[1]<107.9){
  			estacionactual[1]=estacionactual[1]+0.2;
  		} else if (estacionactual[1]==107.9){
  			estacionactual[1]=87.9;
  		}
  	}
  } 

  public void guardar(int boton){
  	if (amFm){
  		guardadasAm[boton]=estacionactual;
  	}
  	else{
  		guardadasFm[boton]=estacionactual;
  	}
  }

  public void seleccionarEmisora(int boton){
  	if (amFm){
  		estacionactual=guardadasAm[boton];
  	}
  	else{
  		estacionactual=guardadasFm[boton];
  	}
  }

  public float EstacionActual(){
  	return estacionactual;
  }

  public boolean estado(){
  	return estado;
  }
}