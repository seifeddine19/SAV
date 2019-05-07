package com.michaelcgood.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.michaelcgood.dao.FactureRepository;
import com.michaelcgood.model.Facture;
import com.michaelcgood.model.Login;
import com.michaelcgood.model.Produit;
import com.michaelcgood.model.Reclamation;
import com.michaelcgood.model.services.FactureService;
import com.michaelcgood.model.services.LoginService;
import com.michaelcgood.model.services.ProduitService;
import com.michaelcgood.model.services.ReclamationService;

@Controller
public class ClientController {
@Autowired
private LoginService loginservice;
@Autowired
private FactureService factureservice;
@Autowired
private ProduitService ProduitService;
@Autowired
private ReclamationService Reclamationservice;
List<Facture> factures = new ArrayList<Facture>();
private Facture F1;
private Login L;
	
	@RequestMapping("/home")
	public String home(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOME");
		
		return "Home.jsp";
	}
	@RequestMapping("/Registre")
	public String Registre(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_REGISTER");
		return "Registre.jsp";
	}
	@RequestMapping("/save-client")
	public String registeruser(@ModelAttribute Login login , BindingResult biningResult,HttpServletRequest request) {
		
		loginservice.saveMyUser(login);
		
		return "Home.jsp";
	}
	
@RequestMapping("/login-client")
public String loginclient(@ModelAttribute Login login ,HttpServletRequest request) {
	if(loginservice.findByloginAndMdp(login.getLogin(), login.getMdp())!=null) {
		
		Login L =  loginservice.findByloginAndMdp(login.getLogin(), login.getMdp());
		Integer i = (int) (long) L.getId();
	//	System.out.println(L.getEmail() );
	request.setAttribute("factures", factureservice.ShowFactureByClient_id(i));
	//	request.setAttribute("Produit", ProduitService.showProduct(1));
		
		//factures = factureservice.showAllFacture();
		request.setAttribute("Login", loginservice.findByloginAndMdp(login.getLogin(), login.getMdp()));
		return "Facture.jsp";
	}
	else {
		request.setAttribute("error", "Invalid Username or Password");
		request.setAttribute("mode","MODE_LOGIN");
		
		return "welcomepage.jsp";
	}
}
@RequestMapping("/showfacture")
public String detail(@RequestParam long id,HttpServletRequest request ) {
	 F1 =  factureservice.showFact(id);
 	Produit P1 =  ProduitService.showProduct(F1.getProduit_id());
 	request.setAttribute("Produit", P1);
 	request.setAttribute("Facture", F1);
	return "Detail.jsp";
}

@RequestMapping("/formulaire")
public String form(@RequestParam long id,HttpServletRequest request ) {
	 F1 =  factureservice.showFact(id);
	request.setAttribute("Facture", F1 );
	//request.setAttribute("Facture", L1.getId() );
	
	
	//System.out.println(L1.getId());
	return "Reclamation.jsp";
}
@RequestMapping("/save-Reclamation")
public String savereclamation(@ModelAttribute Reclamation rec , BindingResult biningResult,HttpServletRequest request) {

	Reclamationservice.saveReclamation(rec);

	return "Home.jsp";
}
}


	

