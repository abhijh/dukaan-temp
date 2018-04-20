package com.thesecurenode.Controllers;

import com.thesecurenode.utils.Response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by abhinav on 19/04/18.
 */
public class PostController extends HttpServlet {
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("variable", "Hello");
        HashMap params = new HashMap();
        params.put("name", "hello");
        Response.renderTemplate("templates/Blog/post.html", request, response, params);
    }
}
