package com.example.lab11_2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/news-detail")
public class NewsDetailServlet extends HttpServlet {

    public void init() {
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String newsId = request.getParameter("id");

        News news = getNewsDetails(newsId);

        request.setAttribute("news", news);

        request.getRequestDispatcher("/news-detail.jsp").forward(request, response);
    }

    private News getNewsDetails(String newsId) {
        News news = new News();
        news.setId(Integer.parseInt(newsId));
        news.setTitle("Заголовок новини " + newsId);
        news.setDescription("Короткий опис новини " + newsId);
        news.setFullText("Повний текст новини " + newsId);
        news.setImageUrl("https://i.citrus.world/imgcache/size_800/uploads/shop/f/a/fa62bc1a74240e5da7628b2694592558.jpg");
        return news;
    }

    public void destroy() {
    }
}
