
package main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 

public class Controlador { 
    
    @GetMapping("/")
    public String inicio (Model model){
        
        Metodos obtenerDatosMetodos = new Metodos();
        Tarjetas obtenerDatosTarjetas = new Tarjetas();
        
        obtenerDatosTarjetas.getMarca();
        model.addAttribute("obtenerDatosTarjetas",obtenerDatosTarjetas);
        
        obtenerDatosMetodos.getTasaVisa();
        model.addAttribute("obtenerDatosMetodos",obtenerDatosMetodos);
        
        return "index";
    }
}
