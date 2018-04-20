package com.thesecurenode.Shop.Controllers;

import com.thesecurenode.utils.Response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by abhinav on 20/04/18.
 */
public class MainController extends HttpServlet {
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        HashMap params = new HashMap();
        params.putAll(request.getParameterMap());
        Response.renderTemplate("templates/Shop/index.html", request, response, params);
    }
}
