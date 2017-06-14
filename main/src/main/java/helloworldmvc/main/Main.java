package helloworldmvc.main;

import helloworldmvc.controlleur.Controller;
import helloworldmvc.model.Model;
import helloworldmvc.view.View;

public class Main {
    public static void main(String[] args){
        Controller c=new Controller(new View(), new Model());
        c.run();
    }
}
