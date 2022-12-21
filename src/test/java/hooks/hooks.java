package hooks;

import org.junit.Before;

import static driverFactory.DriverFactory.iniciarDriver;
import static driverFactory.DriverFactory.matarDriver;


public class hooks {


    public void iniciarNavegador(){
        iniciarDriver();
    }



    public void fecharDriver(){
        matarDriver();
    }


}
