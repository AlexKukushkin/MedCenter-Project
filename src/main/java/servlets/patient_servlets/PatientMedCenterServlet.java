package servlets.patient_servlets;

import services.patient_services.PatientMedCenterService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PatientMedCenterServlet extends HttpServlet {
    private static PatientMedCenterService patientMedCenterService = new PatientMedCenterService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/patient_medcenter.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        patientMedCenterService.getPatientMedCenter(req, resp);
    }
}
