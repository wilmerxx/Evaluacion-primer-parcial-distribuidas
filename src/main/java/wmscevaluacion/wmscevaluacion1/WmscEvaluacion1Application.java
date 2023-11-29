package wmscevaluacion.wmscevaluacion1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import wmscevaluacion.wmscevaluacion1.wmscControladores.Paciente;
import wmscevaluacion.wmscevaluacion1.wmscControladores.WmscPrueba;

@SpringBootApplication
public class WmscEvaluacion1Application {

	public static void main(String[] args) {
		SpringApplication.run(WmscEvaluacion1Application.class, args);
		/*WmscPrueba funcion = new WmscPrueba();
		Paciente paciente,paciente2,paciente3;
		String identificacion,nombre,ciudad,direccion;
		boolean tieneEnfermedadCronica;

		identificacion = "124234343";
		nombre = "Wilmer";
		ciudad = "Ecuador";
		tieneEnfermedadCronica = true;
		direccion = "Santa marhta";
		paciente = new Paciente(identificacion,nombre,ciudad,tieneEnfermedadCronica,direccion);
		funcion.registrarPaciente(paciente);
		identificacion = "456234343";
		nombre = "Wilmer";
		ciudad = "Ecuador";
		tieneEnfermedadCronica = true;
		direccion = "Santa marhta";
		paciente2 = new Paciente(identificacion,nombre,ciudad,tieneEnfermedadCronica,direccion);
		funcion.registrarPaciente(paciente2);
		identificacion = "1234231243";
		nombre = "Wilmer";
		ciudad = "Mexico";
		tieneEnfermedadCronica = false;
		direccion = "Av. Santa marhta";
		paciente3 = new Paciente(identificacion,nombre,ciudad,tieneEnfermedadCronica,direccion);
		funcion.registrarPaciente(paciente3);
		funcion.imprimirPacientes(funcion.listaPacientes());

		funcion.imprimirPacientes(funcion.bucarPaciente(12));
		funcion.imprimirPacientes(funcion.pacientesCiudad("Ecuador"));
		System.out.println(funcion.contarPacientesCronicos());
		System.out.println(funcion.contarPacientes());
		funcion.eliminarPacientesDireccion("Av");*/




	}
}
