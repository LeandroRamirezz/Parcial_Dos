package co.edu.usco.pw.springboot_crud01.controller;

import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;


import co.edu.usco.pw.springboot_crud01.model.Asignatura;
import co.edu.usco.pw.springboot_crud01.service.AsignaturaService;

@Controller
@RequestMapping("/asignaturas")
public class AsignaturaController {

    private static final Logger logger = LoggerFactory.getLogger(AsignaturaController.class);

    @Autowired
    private AsignaturaService asignaturaService;

    @PreAuthorize("hasAnyRole('ESTUDIANTE', 'RECTOR')")
    @GetMapping
    public String mostrarAsignaturas(ModelMap model) {
        String rol = getLoggedInUserRole();
        if (rol.equals("ESTUDIANTE")) {
            model.addAttribute("asignaturas", asignaturaService.getAllAsignaturas());
            return "asignaturas-estudiante";
        } else if (rol.equals("RECTOR")) {
            model.addAttribute("asignaturas", asignaturaService.getAllAsignaturas());
            return "asignaturas-admin";
        } else {
            // Manejar acceso no autorizado
            return "error";
        }
    }

    private String getLoggedInUserRole() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null && auth.isAuthenticated()) {
            return auth.getAuthorities().stream()
                    .map(GrantedAuthority::getAuthority)
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    @PreAuthorize("hasRole('RECTOR')")
    @GetMapping("/agregar")
    public String mostrarFormularioAgregar(ModelMap model) {
        model.addAttribute("asignatura", new Asignatura());
        return "asignatura-form";
    }

    @PreAuthorize("hasRole('RECTOR')")
    @PostMapping("/agregar")
    public String agregarAsignatura(@Valid Asignatura asignatura, BindingResult result) {
        if (result.hasErrors()) {
            return "asignatura-form";
        }
        asignaturaService.saveAsignatura(asignatura);
        return "redirect:/asignaturas-admin";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/actualizar/{id}")
    public String mostrarFormularioActualizar(@PathVariable long id, ModelMap model) {
        Asignatura asignatura = asignaturaService.getAsignaturaById(id);
        model.addAttribute("asignatura", asignatura);
        return "asignatura-form";
    }

    @PreAuthorize("hasRole('RECTOR')")
    @PostMapping("/actualizar")
    public String actualizarAsignatura(@Valid Asignatura asignatura, BindingResult result) {
        if (result.hasErrors()) {
            return "asignatura-form";
        }
        asignaturaService.updateAsignatura(asignatura);
        return "redirect:/asignaturas-admin";
    }

    @PreAuthorize("hasRole('RECTOR')")
    @GetMapping("/eliminar/{id}")
    public String eliminarAsignatura(@PathVariable long id) {
        asignaturaService.deleteAsignatura(id);
        return "redirect:/asignaturas-admin";
    }
}
