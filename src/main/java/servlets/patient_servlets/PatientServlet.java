package servlets.patient_servlets;

import db.dao.PatientDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class PatientServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/patient_main.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String exit = req.getParameter("exit");
//        PatientDAO patientDAO = new PatientDAO();

//        int  userId = (Integer)req.getSession().getAttribute("userID");


        if ("exit".equals(exit)) {
            req.getSession().setAttribute("isAuth", false);
            req.getSession().setAttribute("role", null);
            ((HttpServletResponse) resp).sendRedirect("/web");
        } else {
            ((HttpServletResponse) resp).sendRedirect("/web/patient_main");
        }
    }
}
