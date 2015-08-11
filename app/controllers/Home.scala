package controllers

import play.api.mvc.Controller
import play.api.mvc.Action

/**
 * @author bram.zerbe
 */
class Home extends Controller {

  val homepage = Action {request =>
    Ok(views.html.home());
  }
}