import play.*;
import play.GlobalSettings;
import play.libs.F.Promise;
import play.mvc.Http.RequestHeader;
import play.mvc.Result;

import static play.mvc.Results.notFound;
import static play.mvc.Results.badRequest;
import static play.mvc.Results.redirect;



public class Global extends GlobalSettings{
    @Override
    public void onStart(Application app){
        System.out.println("Inicio da Aplicação!!!");
    }
    
    @Override
    public Promise<Result> onHandlerNotFound(RequestHeader request){
        return Promise.<Result> pure(
            notFound(views.html.notFound.render(request.uri()))
        );
    }
    
    @Override
    public Promise<Result> onBadRequest(RequestHeader request, String error){
        return Promise.<Result> pure(
            redirect("/")
        );
    }
    
    
}