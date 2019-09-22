package dci.ufro.cl.fifa.controller;

import dci.ufro.cl.fifa.model.ListPlayer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JugadorController {
	@RequestMapping("/")
	public String getindex(Model model){

		model.addAttribute("players", ListPlayer.getPlayers());

		return "index";
		//para lanzar una pagina se agrega la pagina en templates y se escribe la direccion donde enviarla
	}



}