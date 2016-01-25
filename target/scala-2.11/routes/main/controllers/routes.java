
// @GENERATOR:play-routes-compiler
// @SOURCE:F:/play-2.4.6/play-java/conf/routes
// @DATE:Mon Jan 25 08:35:14 COT 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseInicio Inicio = new controllers.ReverseInicio(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseDiretorCRUD DiretorCRUD = new controllers.ReverseDiretorCRUD(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseInicio Inicio = new controllers.javascript.ReverseInicio(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseDiretorCRUD DiretorCRUD = new controllers.javascript.ReverseDiretorCRUD(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
