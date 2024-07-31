package com.api.java.api_products_2826505.services;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;

import com.api.java.api_products_2826505.repositories.ProductRepository;
import com.api.java.api_products_2826505.entities.Product;

@Service
public class ProductService {


    @Autowired
    private ProductRepository repository;
    public List<Product>findAll(){
        return (List<Product>)
        repository.findAll();
    }
    //read by id  
    public Product findById(Long id){
        return repository.findById(id)
            .get(); 

    }

    //insert
    public Product create(Product productoAGrabar){
        return repository.save(productoAGrabar);
    }

    //delete
    public Product borrar(Long id){
        //seleccionar el producto por id
        Product pBorrar = this.findById(id);
        //borrar
        repository.delete(pBorrar);
        return pBorrar;
    }
    //update
    public Product actualizar(Long id, Product pUpdate){
        //1. seleccionar el producto por id
        Product p = this.findById(id);
        //2. actualizar los valores
        p.setName(pUpdate.getName());
        p.setDescription(pUpdate.getDescription());
        p.setPrice(pUpdate.getPrice());
                                                
        //3. guardar los cambios
        return repository.save(p);  

      }
    


}
