package com.example.lab11_2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/manufacturer-news")
public class ManufacturerNewsServlet extends HttpServlet {

    public void init() {
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<News> newsList = new ArrayList<>();

        News news1 = new News();
        news1.setId(1);
        news1.setTitle("Заголовок новини 1");
        news1.setDescription("Короткий опис новини 1");
        news1.setFullText("Повний текст новини 1...");
        news1.setImageUrl("https://i.citrus.world/imgcache/size_800/uploads/shop/f/a/fa62bc1a74240e5da7628b2694592558.jpg");
        newsList.add(news1);

        News news2 = new News();
        news2.setId(2);
        news2.setTitle("Заголовок новини 2");
        news2.setDescription("Короткий опис новини 2");
        news2.setFullText("Повний текст новини 2...");
        news2.setImageUrl("https://i.allo.ua/media/catalog/product/cache/1/image/524x494/602f0fa2c1f0d1ba5e241f914e856ff9/o/v/overview05-img_1_1_1.jpg");
        newsList.add(news2);

        request.setAttribute("newsList", newsList);

        request.getRequestDispatcher("/manufacturer-news.jsp").forward(request, response);

    }

    public void destroy() {
    }
}
