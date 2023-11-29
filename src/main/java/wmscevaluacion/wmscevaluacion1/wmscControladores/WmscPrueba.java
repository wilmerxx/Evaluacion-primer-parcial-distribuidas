package wmscevaluacion.wmscevaluacion1.wmscControladores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class WmscPrueba {

    List<Paciente> listaPaciente = new ArrayList<>();

    //Insertar datos del paciente (3 registros)
    public void registrarPaciente(Paciente paciente){
        listaPaciente.add(paciente);
    }
    //Buscar los pacientes que tengan identificación que inicie con el número que defina como parámetro
    public List<Paciente> bucarPaciente(int numero){
        List<Paciente> pacientesBuscados = new ArrayList<>();
        for (Paciente paciente:listaPaciente) {
            if(paciente.getIdentificacion().startsWith(String.valueOf(numero))){
                pacientesBuscados.add(paciente);
            }
        }
        return pacientesBuscados;
    }
    //Buscar los pacientes que sean de una ciudad determinada por parámetro
    public List<Paciente> pacientesCiudad(String ciudad){
        List<Paciente> resultado = new ArrayList<>();
        for (Paciente paciente:listaPaciente) {
            if(Objects.equals(paciente.getCiudad(), ciudad)){
                resultado.add(paciente);
            }
        }
        return resultado;
    }
    // Contar los pacientes que tengan enfermedad crónica
    public int contarPacientesCronicos(){
        int cont=0;
        for (Paciente paciente:listaPaciente) {
            if(paciente.isTieneEnfermedadCronica()){
                cont++;
            }
        }
        return cont;
    }

    //listar los pacientes
    public List<Paciente> listaPacientes(){
        return listaPaciente;
    }

    //imprimir los pacientes
    public void imprimirPacientes(List<Paciente> listaPacientenueva){
        for (Paciente paciente:listaPacientenueva) {
            System.out.println(paciente.toString());
        }
    }
    // Eliminar los pacientes con dirección que inicie con “AV.”
    public void eliminarPacientesDireccion(String inicio) {
        Iterator<Paciente> iterador = listaPaciente.iterator();
        while (iterador.hasNext()) {
            Paciente paciente = iterador.next();
            if (paciente.getDireccion().startsWith(inicio)) {
                iterador.remove();
            }
        }
        imprimirPacientes(listaPacientes());
    }

    // Contar los pacientes registrados en memoria
    public int contarPacientes(){
         return listaPaciente.size();
    }
}
