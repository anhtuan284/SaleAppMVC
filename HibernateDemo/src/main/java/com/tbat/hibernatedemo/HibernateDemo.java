/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.tbat.hibernatedemo;

import com.tbat.pojo.Category;
import com.tbat.repository.impl.ProductRepositoryImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author admin
 */

public class HibernateDemo {

    public static void main(String[] args) {
//        try (Session s = HibernateUtils.getFactory().openSession()) {
//            Query q = s.createQuery("FROM Category");
//            List<Category> cates = q.getResultList();
//            
//            cates.forEach(c -> System.out.print(c));
//        }
//        ProductRepositoryImpl s = new ProductRepositoryImpl();
//        s.getProducts(null).forEach(p -> System.out.printf("%s - %s - %s\n", p.getName(), 
//                p.getPrice(), p.getCategoryId().getName()));
        ProductRepositoryImpl s = new ProductRepositoryImpl();
        
        Map<String, String> params = new HashMap<>();
        params.put("kw", "Galaxy");
        params.put("fromPrice", "18000000");
        params.put("toPrice", "20000000");
        
        s.getProducts(params).forEach(p -> System.out.println(p.getId() + " - " + p.getName() + " - " + p.getPrice()));
    }
}
