package com.example.ContactUsForm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ContactUsForm.model.Contact;
import com.example.ContactUsForm.service.ContactService;


@Controller // Use @Controller instead of @RestController
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/contact")
    public String showContactForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "contact";
    }

    @PostMapping("/contact")
    public String submitForm(Contact contact, Model model) {
        contactService.saveContact(contact);
        model.addAttribute("message", "Thank you for contacting us, " + contact.getName() + "!");
        return "result";
    }
}