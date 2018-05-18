package com.lydia.webservice.Controller;

import com.lydia.webservice.Product;
import com.lydia.webservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
    @RestController
    class ProductController {

        @Autowired
        ProductService productService;

        @RequestMapping("/product")
        public @ResponseBody
        Product getProduct(@RequestParam(value = "code") String productCode) {

            return productService.getProductByCode(productCode);
        }
    }

