package com.codigoWalter.Learning.Services;

import com.codigoWalter.Learning.Entity.Producto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

        private final Logger logger  = LoggerFactory.getLogger(OrderService.class);

    public void saveOrder(List<Producto> productos){
        System.out.println("Guardando en la base de datos ✅");
        productos.forEach(produto -> logger.info("Producto : {}", produto.toString()));
    }
}
