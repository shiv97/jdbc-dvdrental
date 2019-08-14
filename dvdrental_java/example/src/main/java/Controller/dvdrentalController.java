package Controller;//package com.example.start.controller;

//import com.example.start.model.Film;
//import com.example.start.repositories.ActorRepository;
//import com.example.start.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import repository.ActorRepository;
import repository.Film;
import repository.FilmRepository;
//import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
class startController
{
	@GetMapping("/start")
	public String start()
	{
	return "hej";
    }
}
