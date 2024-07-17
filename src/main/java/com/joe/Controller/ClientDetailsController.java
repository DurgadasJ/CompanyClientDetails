package com.joe.Controller;


import com.joe.Entity.ClientDetails;
import com.joe.Repository.ClientDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/api/env-id-details")
public class ClientDetailsController {

    private final ClientDetailsRepository repository;

    @Autowired
    public ClientDetailsController(ClientDetailsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("envIdDetails", new ClientDetails());
        return "form"; // This assumes a Thymeleaf template named 'form.html'
    }

    @GetMapping("/env_id_details")
    public String getAllClientIdDetails(Model model) {
        List<ClientDetails> details = repository.findAll();
        model.addAttribute("details", details);
        return "list"; // this should correspond to the template name
    }


    @PostMapping
    public String createClientIdDetails(@ModelAttribute ClientDetails clientDetails) {
        repository.save(clientDetails);
        return "redirect:/api/env-id-details/env_id_details"; // Note: This will not redirect with @RestController
    }
}
