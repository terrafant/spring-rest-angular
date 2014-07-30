package com.uay.controllers;

import com.uay.beans.Movie;
import com.uay.components.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    @Autowired
    private MovieService movieService;

    @RequestMapping(value = "/")
    @ResponseBody
    public Movie homeMethod(HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin","*");
        return movieService.generateMovie();
    }

}