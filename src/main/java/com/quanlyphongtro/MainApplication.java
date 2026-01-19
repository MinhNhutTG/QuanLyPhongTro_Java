package com.quanlyphongtro;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;


import java.awt.EventQueue;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        
        ConfigurableApplicationContext context = new SpringApplicationBuilder(MainApplication.class)
                .headless(false) 
                .run(args);

        EventQueue.invokeLater(() -> {
            try {
                com.quanlyphongtro.ui.Home.home homeGui = context.getBean(com.quanlyphongtro.ui.Home.home.class);
                homeGui.setVisible(true);
                
                System.out.println("Ứng dụng đã sẵn sàng!");
                    } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}