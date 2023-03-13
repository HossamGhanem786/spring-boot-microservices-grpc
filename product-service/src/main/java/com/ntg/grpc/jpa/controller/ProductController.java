//package com.ntg.grpc.jpa.controller;
//
//import com.ntg.grpc.service.ProductServiceRestImpl;
//import lombok.AllArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@AllArgsConstructor
//@RequestMapping("/api/product")
//public class ProductController {
//
//    private ProductServiceRestImpl productServiceRest;
//
//    @GetMapping("/{id}")
//    public ResponseEntity<?>  getProduct(@PathVariable(name = "id" ) Long id){
//       return new ResponseEntity<>(productServiceRest.getProducts(id), HttpStatus.OK) ;
//    }
//
//}
