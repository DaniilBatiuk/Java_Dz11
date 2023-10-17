package com.example.lab11_2;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import javax.imageio.ImageIO;

@WebServlet("/manufacturer-info")
public class ManufacturerInfoServlet extends HttpServlet {

    public void init() {
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setManufacturerName("Apple");
        manufacturer.setHeadquarters("USA");
        manufacturer.setEmployeesCount(1000);
        manufacturer.setDescription("I know you");

        manufacturer.setLogoUrl("https://i.citrus.world/imgcache/size_800/uploads/shop/f/a/fa62bc1a74240e5da7628b2694592558.jpg");
        request.setAttribute("manufacturer", manufacturer);

        request.getRequestDispatcher("/manufacturer-info.jsp").forward(request, response);
    }

    public void destroy() {
    }
}
