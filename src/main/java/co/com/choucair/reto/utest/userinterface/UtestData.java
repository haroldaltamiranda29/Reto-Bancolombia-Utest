package co.com.choucair.reto.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestData {

    //Boton join today
    public static final Target BOTON_JOIN_TODAY = Target.the("Boton join today")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));

    //Mapeos del primer formulario
    public static final Target FIRST_NAME = Target.the("Caja de texto del primer nombre")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Caja de texto del apellido")
            .located(By.id("lastName"));
    public static final Target EMAIL_ADDRESS = Target.the("Caja de texto del correo")
            .located(By.id("email"));
    public static final Target OPCION_MONTH = Target.the("Opcion meses")
            .located(By.id("birthMonth"));
    public static final Target MONTH = Target.the("Escoger mes")
            .located(By.xpath("//*[@id=\"birthMonth\"]/option[9]"));
    public static final Target OPCION_DAY = Target.the("Opcion dia")
            .located(By.id("birthDay"));
    public static final Target DAY = Target.the("Escoger dia")
            .located(By.xpath("//*[@id=\"birthDay\"]/option[30]"));
    public static final Target OPCION_YEAR = Target.the("Opcion año")
            .located(By.id("birthYear"));
    public static final Target YEAR = Target.the("Escoger año")
            .located(By.xpath("//*[@id=\"birthYear\"]/option[5]"));
    public static final Target NEXT_LOCATION = Target.the("Boton next location")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a/i"));

    //Mapeo del segundo formulario
    public static final Target CITY = Target.the("Caja de texto ciudad")
            .located(By.id("city"));
    public static final Target POSTAL_CODE = Target.the("Caja de texto del codigo postal")
            .located(By.xpath("//*[@id=\"zip\"]"));
    public static final Target OPCION_COUNRTY = Target.the("Opcion pais")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target COUNTRY = Target.the("Escoger pais")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/ul/li/div[54]/span/div"));
    public static final Target NEXT_DEVICES = Target.the("Boton next devices")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/i"));

    //Mapedo del tercer formulario
    public static final Target OPCION_COMPUTER = Target.the("Opcion computer")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target YOUR_COMPUTER = Target.the("Escoger computer")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/ul/li/div[4]/span/div"));
    public static final Target OPCION_VERSION = Target.the("Opcion version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target VERSION = Target.the("Escoger version")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/ul/li/div[36]/span/div"));
    public static final Target OPCION_LENGUAGE = Target.the("Opcionlenguage")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target LENGUAGE = Target.the("Escoger lenguage")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/ul/li/div[40]/span/div"));
    public static final Target OPCION_MOVIL = Target.the("Opcion movil")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target YOUR_MOBILE_DEVICE = Target.the("Escoger movil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/ul/li/div[90]/span/div"));
    public static final Target OPCION_MODEL = Target.the("Opcion model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target MODEL = Target.the("Escoger model")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/ul/li/div[8]/span/div"));
    public static final Target OPCION_OPERATING_SYSTEM = Target.the("Opcion operating system")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target OPERATING_SYSTEM = Target.the("Escoger operating system")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/ul/li/div[12]/span/div"));
    public static final Target NEXT_LAST_STEP = Target.the("Boton next last step")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a/i"));

    //Mapeos del cuarto formulario
    public static final Target PASSWORD = Target.the("Caja de texto passwrod")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Caja de texto confirm passwrod")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_TERM_USE = Target.the("Check de terminos de uso")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_PRIVACY_SECURITY = Target.the("Chcek de seguridad de privacidad")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BOTON_COMPLETE_SETUP = Target.the("Boton de completar setup")
            .located(By.xpath("//*[@id=\"laddaBtn\"]/i"));

    //Mapeos del login
    public static final Target LOGIN = Target.the("Opcion de iniciar sesion")
            .located(By.cssSelector("body > ui-view > unauthenticated-container > div > div > unauthenticated-header > div > div.unauthenticated-nav-bar__links.navbar-right.hidden-sm.hidden-xs > ul:nth-child(2) > li:nth-child(1) > a"));
    public static final Target USER = Target.the("Caja de texto user")
            .located(By.id("username"));
    public static final Target CAMPO_PASSWORD = Target.the("Caja de texto de la contraseña")
            .located(By.id("password"));
    public static final Target BOTON_LOGIN = Target.the("Boton login")
            .located(By.id("kc-login"));
    public static final Target MENSAJE = Target.the("Boton para el mensaje")
            .located(By.xpath("//*[@id=\"action-link\"]"));

}
