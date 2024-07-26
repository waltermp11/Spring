package com.codigoWalter.Learning;

import com.codigoWalter.Learning.Entity.Libro;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class Rutas {
    private final Logger logger = LoggerFactory.getLogger(Rutas.class);

    @GetMapping("/saludo")
    public String saludando(){
        return "Hola Mundo";

    }

    @GetMapping ("/libro/{id}/editorial/{editorial}")
    public String leerLibro (@PathVariable int id, @PathVariable String editorial){
        return  "Leyendo el libro con el id " + id + " con la editorial : " + editorial;


    }

    @GetMapping ("/params/{id}")
    public String testingsRequestParams(@PathVariable int id, @RequestParam  String nombre, @RequestParam String apellido){
            return "Parametros con el id " + id + "parametros " + nombre +  " " + apellido;

        }
    @PostMapping("/libro")
    public String guardarLibro(@RequestBody Libro libro){

        if (libro.getCantidadDeLibros() ==1){
            logger.error("El libro esta vacion ");
             HttpStatus.OK("Se creo exitosamente el libro");
        }
        return "Libro guardado " + libro.toString();
        }

    }



