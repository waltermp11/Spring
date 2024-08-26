package com.codigoWalter.Learning;

import com.codigoWalter.Learning.Entity.Libro;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import static org.springframework.http.HttpStatus.*;

@RestController
public class Rutas {
    private final Logger logger = LoggerFactory.getLogger(Rutas.class);

    @GetMapping("/saludo")
    public String saludando() {
        return "Hola Mundo";

    }

    @GetMapping("/libro/{id}/editorial/{editorial}")
    public String leerLibro(@PathVariable int id, @PathVariable String editorial) {
        return "Leyendo el libro con el id " + id + " con la editorial : " + editorial;


    }

    @GetMapping("/params/{id}")
    public String testingsRequestParams(@PathVariable int id, @RequestParam String nombre, @RequestParam String apellido) {
        return "Parametros con el id " + id + "parametros " + nombre + " " + apellido;

    }

    @PostMapping("/libro")
    public ResponseEntity<String> guardarLibro(@RequestBody Libro libro) {

        if (libro.getCantidadDeLibros() == 1) {
            logger.error("El libro esta vacion ");
            return new ResponseEntity<>("El libro esta vacio", BAD_REQUEST);


        }
        logger.info("Se guardo el libro exitosamente");
        return new ResponseEntity<>("Se guardo el libro correctamente! " + libro.toString(), OK);
    }

    @GetMapping("/animales/{lugar}")
    public ResponseEntity<String> mostrandoAnimalesSegunLugar(@PathVariable String lugar) {

        if (lugar.equals("granja")) {

            return ResponseEntity.status(OK).body("Caballo, vaca, gallina, pato");
        } else if (lugar.equals("zoologico")) {
            return ResponseEntity.status(OK).body("Tigre, leon, mono, elefante");


        } else if (lugar.equals("casa")) {
            return ResponseEntity.status(OK).body("Perro, Gato, Peces");

        } else {
            return ResponseEntity.status(BAD_REQUEST).body("Lugar no conocido 🫥");
        }
    }

    @GetMapping("/calcular/{numero}")
    public Integer calculandoNumero( @PathVariable Integer numero){
        if (numero<0){

            throw new  NullPointerException("el numero es negativo 🫥");
        }

        logger.info("El numero es entero positivo");
        return numero;

    }
}



