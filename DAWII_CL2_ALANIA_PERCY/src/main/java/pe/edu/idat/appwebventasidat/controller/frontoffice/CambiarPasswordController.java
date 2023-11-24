package pe.edu.idat.appwebventasidat.controller.frontoffice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/seguridad")
public class CambiarPasswordController {

    @GetMapping("/cambiar-password")
    public String mostrarFormularioCambiarPassword() {
        return "seguridad/cambiar-password";
    }

    @PostMapping("/cambiar-password")
    public String cambiarPassword(@RequestParam String newPassword, @RequestParam String confirmPassword) {


        return "redirect:/home";
    }
}