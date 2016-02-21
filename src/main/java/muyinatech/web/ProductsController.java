package muyinatech.web;

import muyinatech.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductsController {

    @RequestMapping("/products")
    public ModelAndView products() {
        ModelAndView modelAndView = new ModelAndView("products");
        modelAndView.addObject("products", getProducts());
        return modelAndView;
    }


    private List<Product> getProducts() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("1", "Apple", "A green fruit"));
        products.add(new Product("2", "Dog", "Animal which can be a pet"));
        products.add(new Product("3", "Car", "A mode of transport"));
        return products;
    }
}
