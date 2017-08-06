package mvc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OlaMundo {

	@RequestMapping(value="/ola", method = RequestMethod.GET)
	public String ola(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("olaMundo", "Olá Mundo! Spring Ativo e Funcionando!");
		return "novo";
	}
	
}
