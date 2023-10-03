package uTest.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import models.constantes;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.registroUsuarioTask;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class registrarUsuarioStepDefinition {

    private static ArrayList<Map<String, String>> dataExcel = new ArrayList<Map<String, String>>();

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario ingresa a la pagina principal")
    public void queElUsuarioIngresaALaPaginaPrincipal() {
        WebDriverManager.chromedriver().setup();
        OnStage.theActorCalled(constantes.ACTOR).wasAbleTo(
                Open.url("https://utest.com/signup/personal")
        );

    }
    @Cuando("se registre exitosamente")
    public void seRegistreExitosamente() {OnStage.theActorInTheSpotlight().attemptsTo(registroUsuarioTask.onThePage());

    }
    @Entonces("se crea el usuario")
    public void seCreaElUsuario() {

    }
}
