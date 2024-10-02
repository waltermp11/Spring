package com.codigoWalter.Learning.Entity;

import com.codigoWalter.Learning.Rutas;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
//Mapeamos como unos errores que nosotros queremos coger
public class RutasHandler {
    private final Logger logger = LoggerFactory.getLogger(RutasHandler.class);

    @ExceptionHandler(NullPointerException.class)//cada vez que me salga un null pointer exception ✅
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handlerNullPointerException(NullPointerException exception) {
        logger.error(exception.getMessage());
        return "Internar Error. Contact Support ❌";


    }

    //Aca es donde nosotros vamos a tener el control de los errores o excepciones para que no lleguen a nuestro cliente final
}
