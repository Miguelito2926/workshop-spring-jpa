package com.educajava.curso.config;

import com.educajava.curso.entities.*;
import com.educajava.curso.entities.enums.OrderStatus;
import com.educajava.curso.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {

        User usuario1 = new User(null,"Ednaldo", "ednaldo@gmail.com", "12345", "219999999");
        User usuario2 = new User(null, "Miguel", "miguel@gmail.com", "123456", "99999999");
        User usuario3= new User(null, "Dione", "dione@gmail.com", "123456", "99999999");
        userRepository.saveAll(Arrays.asList(usuario1,usuario2,usuario3));

        Product produto1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product produto2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product produto3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product produto4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product produto5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        productRepository.saveAll(Arrays.asList(produto1, produto2, produto3, produto4, produto5));

        Category categoria1 = new Category(null, "Eletronics");
        Category categoria2 = new Category(null, "Books");
        Category categoria3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(categoria1, categoria2, categoria3));

        produto3.getCategories().add(categoria3);
        produto4.getCategories().add(categoria3);
        produto1.getCategories().add(categoria2);
        produto2.getCategories().add(categoria1);
        produto2.getCategories().add(categoria3);
        produto5.getCategories().add(categoria2);

        Order order1 = new Order(null, Instant.parse("2024-05-18T23:20:15Z"), OrderStatus.WAITING_PAYMENT, usuario1);
        Order order2 = new Order(null, Instant.parse("2024-05-18T23:20:10Z"), OrderStatus.CANCELED, usuario2);
        Order order3 = new Order(null, Instant.parse("2024-05-18T23:20:05Z"), OrderStatus.SHIPPED, usuario3);

        orderRepository.saveAll(Arrays.asList(order1, order2, order3));

        OrderItem orderItem1 = new OrderItem(order1, produto1, 2, produto1.getPrice());
        OrderItem orderItem2 = new OrderItem(order1, produto2, 1, produto4.getPrice());
        OrderItem orderItem3 = new OrderItem(order2, produto3, 2, produto1.getPrice());
        OrderItem orderItem4 = new OrderItem(order3, produto5, 2, produto5.getPrice());

        orderItemRepository.saveAll(Arrays.asList(orderItem1, orderItem2, orderItem3, orderItem4));
        User user = new User(null, "Ednaldo Tavares", "junior@gmail.com", "1234567896", "12345");
        User user2 = new User(null, "Miguel Tavares", "iguel@gmail.com", "1234567896", "12345");
        userRepository.saveAll(Arrays.asList(user, user2));

    }
}
