package servlets.admin_servlets;

import services.admin_services.AdminGetScheduleService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AdminGetScheduleServlet extends HttpServlet {
    private static AdminGetScheduleService adminGetScheduleService = new AdminGetScheduleService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/doctor_schedule.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        adminGetScheduleService.doAdminGetSchedule(req, resp);
    }
}
