package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class registrarUsuario {
    public static final Target NOMBRE = Target.the("nombre").locatedBy("//input[@id='firstName']");
    public static final Target APELLIDO = Target.the("apellido").locatedBy("//input[@id='lastName']");
    public static final Target CORREO = Target.the("correo").locatedBy("//input[@id='email']");
    public static final Target MES = Target.the("mes nacimiento").locatedBy("//*[@name='birthMonth']//descendant::option[3]");
    public static final Target DIA = Target.the("dia nacimiento").locatedBy("//*[@name='birthDay']//descendant::option[15]");
    public static final Target AÑO = Target.the("año nacimiento").locatedBy("//*[@name='birthYear']//descendant::option[17]");
    public static final Target BOTON_SIGUIENTE = Target.the("boton siguiente").locatedBy("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/a[1]");
    public static final Target BOTON_CONTINUAR = Target.the("boton continuar").locatedBy("//*[@class='btn btn-blue pull-right']");
    public static final Target BOTON2_CONTINUAR = Target.the("boton2 continuar").locatedBy("//*[@class='btn btn-blue pull-right']");
    public static final Target CONTRASENA = Target.the("contraseña").locatedBy("//input[@id='password']");
    public static final Target CONFIRMAR_CONTRASENA = Target.the("confirmar contraseña").locatedBy("//input[@id='confirmPassword']");
    public static final Target CHECK_TERMINOS = Target.the("check terminos").locatedBy("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/label[1]/span[1]");
    public static final Target CHECK_PRIVACIDAD = Target.the("check privacidad").locatedBy("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/label[1]/span[1]");
    public static final Target COMPLETADO = Target.the("completado").locatedBy("//*[@class='btn btn-blue']");
}
