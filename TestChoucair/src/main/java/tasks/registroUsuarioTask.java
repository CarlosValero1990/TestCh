package tasks;

import interactions.EsperaExplicita;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utils.datosExcel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import static userInterfaces.registrarUsuario.*;


public class registroUsuarioTask implements Task{

    private static ArrayList<Map<String, String>> dataExcel = new ArrayList<Map<String, String>>();

    @Override
    public <T extends Actor> void performAs(T actor){
        try {
        dataExcel = datosExcel.readExcel("DataTest.xlsx", "Escenario1");
        actor.attemptsTo(
                Enter.theValue(dataExcel.get(0).get("nombre")).into(NOMBRE),
                Enter.theValue(dataExcel.get(0).get("apellido")).into(APELLIDO),
                Enter.theValue(dataExcel.get(0).get("correo")).into(CORREO),
                Click.on(MES),
                Click.on(DIA),
                Click.on(AÑO),
                Click.on(BOTON_SIGUIENTE),
                EsperaExplicita.enSegundos(2),
                Click.on(BOTON_CONTINUAR),
                EsperaExplicita.enSegundos(2),
                Click.on(BOTON2_CONTINUAR),
                EsperaExplicita.enSegundos(2),
                Enter.theValue(dataExcel.get(0).get("contraseña")).into(CONTRASENA),
                Enter.theValue(dataExcel.get(0).get("confirmar contraseña")).into(CONFIRMAR_CONTRASENA),
                Click.on(CHECK_TERMINOS),
                Click.on(CHECK_PRIVACIDAD),
                Click.on(COMPLETADO)

        );
    } catch (
    IOException e) {
        e.printStackTrace();
    }
}
    public static registroUsuarioTask onThePage() {
        return Tasks.instrumented(registroUsuarioTask.class);
    }
}
