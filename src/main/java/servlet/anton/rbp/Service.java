package servlet.anton.rbp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/* Объявляем класс наследующийся от HttpServlet и переопределяющий меотод
doGet(HttpServletRequest req, HttpServletResponse resp)
 */
public class Service extends HttpServlet {

    /**
     * Метод загружающий страницу page.jsp,
     * метод срабатывает при запросе типа GET
     *
     * @param req объект-запрос
     * @param resp объект-ответ
     * @throws ServletException исключение типа ServletException
     * @throws IOException исключение типа IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("page.jsp").forward(req, resp);
    }

}
