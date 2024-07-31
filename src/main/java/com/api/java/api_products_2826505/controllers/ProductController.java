package com.api.java.api_products_2826505.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import com.api.java.api_products_2826505.entities.Product;
import com.api.java.api_products_2826505.services.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/products")

public class ProductController {
    @Autowired

    private ProductService Servicio;
    //Primer endpoint
    //Traer todos los productos
    //Traer peticiones de Get
    @GetMapping("/productos")
    public List<Product> findAllProducts() {
         //utilizar el service
         //traer los productos
         //necesitamos una instancia
         //del service en el controller
         //para poder usarlo
         //return service.findAll();
        return Servicio.findAll();
    }
    
    //Segundo endpoint
    //Traer un producto por id
    //Metodo Http: GET
    @GetMapping("/productoporid/{id}")
    public Product findProductById(@PathVariable Long id) {
        return Servicio.findById(id);
    }
    
    //Tercer endpoint
    //grabar un nuevo producto
    //que llegue por el body de la request(payload)

    @PostMapping("/nuevoproducto")
    public Product newProduct(@RequestBody Product p) {
  
        return Servicio.create(p);  
               
    }

    //Cuarto endpoint
    //Borrar un producto por id
    //Metodo Http: DELETE
    @DeleteMapping("/borrarporid/{id}")
    public Product deleteProductById(@PathVariable Long id) {
        return Servicio.borrar(id);
        
    }
    
    //Quinto endpoint
    //Actualizar un producto por id
    //Metodo Http: PUT
    @PutMapping("/actualizarporid/{id}")
    public Product updateProduct(
    @PathVariable Long id, 
    @RequestBody Product p) {
    return Servicio.actualizar(id,p);
        
    }

}

        

    


    






