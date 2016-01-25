package controllers;

import java.util.List;

import play.mvc.Controller;
import play.mvc.Result;
import play.db.ebean.Model;
import play.data.Form;


import static play.libs.Json.toJson;

import models.Diretor;


public class DiretorCRUD extends Controller{
    
    //objeto que encapsula parte da complexidade de trabalhar com formulários em html
    public Form<Diretor> diretorForm = Form.form(Diretor.class);
    
    public Result lista(){
        List<Diretor> diretores = Diretor.find.all();
        return ok(views.html.diretor.render(diretores));
        //List<Diretor> diretores = new Model.Finder(String.class, Diretor.class).all();
        //return ok(toJson(diretores));
    }
    
    //chama a tela de cadastro
    public Result novoDiretor(){
        return ok(views.html.novoDiretor.render(diretorForm));
    }
    
    public Result gravar(){
        Form<Diretor> form = diretorForm.bindFromRequest();
        
        if(form.hasErrors()){
            flash("erro", "Foram identificados problemas no cadastro");
            return ok(views.html.novoDiretor.render(diretorForm));
        }
        
        Diretor diretor = form.get();
        diretor.save();
        
        flash("sucesso", "Registro gravado com sucesso");
        
        return redirect(routes.DiretorCRUD.lista());
        
    }
    
    public Result detalhar(Long id){
        Form<Diretor> dirForm;
        try{
            
            dirForm = diretorForm.fill(Diretor.find.byId(id));
            
        }catch(Exception e){
            flash("erro",play.i18n.Messages.get("Diretor não encontrado"));
            return redirect(routes.DiretorCRUD.lista());
        }
        
        return ok(views.html.alterarDiretor.render(id, dirForm));
        
    }
    
    
    //semelhante ao gravar, mas com alteração do update no lugar do save
    public Result alterar(Long id){
        
        Form<Diretor> form = diretorForm.fill(Diretor.find.byId(id)).bindFromRequest();
        
        if(diretorForm.hasErrors()){
            return badRequest(views.html.alterarDiretor.render(id, diretorForm));
        }
        
        
        Diretor diretor = form.get();
        //precisa setar o id, pois ele se perde no formulário
        diretor.setId(id);
        
        diretor.update();
        
        flash("sucesso", "Diretor "+diretor.nome+" alterado com sucesso");
        
        return redirect(routes.DiretorCRUD.lista());
        
    }
    
    public Result remover(Long id){
        
        try{
            Diretor.find.ref(id).delete();
            flash("sucesso", "Diretor removido com sucesso");
        }catch(Exception e){
            flash("erro",play.i18n.Messages.get("global.erro"));
        }
        
        return lista();
    }
    
    
}





























