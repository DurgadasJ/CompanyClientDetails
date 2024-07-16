package com.joe.Controller;


import com.joe.Entity.EnvIdDetails;
import com.joe.Repository.EnvIdDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/api/env-id-details")
public class EnvIdDetailsController {

    private final EnvIdDetailsRepository repository;

    @Autowired
    public EnvIdDetailsController(EnvIdDetailsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("envIdDetails", new EnvIdDetails());
        return "form"; // This assumes a Thymeleaf template named 'form.html'
    }

    @GetMapping("/env_id_details")
    public String getAllClientIdDetails(Model model) {
        List<EnvIdDetails> details = repository.findAll();
        model.addAttribute("details", details);
        return "list"; // this should correspond to the template name
    }

    @PostMapping
    public String createClientIdDetails(@ModelAttribute EnvIdDetails envIdDetails) {
        repository.save(envIdDetails);
        return "redirect:/api/env-id-details/env_id_details"; // Note: This will not redirect with @RestController
    }
}
