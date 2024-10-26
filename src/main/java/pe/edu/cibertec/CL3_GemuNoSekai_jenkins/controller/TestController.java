package pe.edu.cibertec.CL3_GemuNoSekai_jenkins.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/test")
public class TestController {

    @GetMapping
    public String pruebaJenkins(){
        return "Hola Jenkins, como estas el dia de hoy?";
    }

}
