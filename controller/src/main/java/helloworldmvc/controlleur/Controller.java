package helloworldmvc.controlleur;

import helloworldmvc.contract.IModel;
import helloworldmvc.contract.IView;

/**
 * Created by UGO on 07/06/2017.
 */
public class Controller {
    private final IView view;

    private final IModel model;

    public Controller(IView view, IModel model) {
        this.view = view;
        this.model = model;
    }
    public void run(){
        this.view.displayMessage(this.model.getHelloWorld());
    }
}
