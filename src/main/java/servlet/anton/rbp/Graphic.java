package servlet.anton.rbp;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

/* Объявляем класс наследующийся от HttpServlet и переопределяющий два его метода
doGet(HttpServletRequest req, HttpServletResponse resp) и
doPost(HttpServletRequest req, HttpServletResponse resp)
 */
public class Graphic extends HttpServlet {

    // Объекты хранящие значение коорадинат всех пяти точек
    Integer x_1;
    Integer y_1;

    Integer x_2;
    Integer y_2;

    Integer x_3;
    Integer y_3;

    Integer x_4;
    Integer y_4;

    Integer x_5;
    Integer y_5;

    /**
     * Метод рисующий график
     * срабатывает при запросе типа GET
     *
     * @param req объект-запрос
     * @param resp объект-ответ
     * @throws ServletException исключение типа ServletException
     * @throws IOException исключение типа IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        BufferedImage image = new BufferedImage(1500, 900, BufferedImage.TYPE_INT_RGB);

        Graphics graphics = image.getGraphics();

        // Заполняем фон белым цветом
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, 1500, 900);

        // Рисуем оси черным цветом
        graphics.setColor(Color.BLACK);
        graphics.drawLine(750, 50, 750, 850);
        graphics.drawLine(50, 450, 1450, 450);

        graphics.drawLine(1450, 450, 1425, 425);
        graphics.drawLine(1450, 450, 1425, 475);

        graphics.drawLine(750, 50, 725, 75);
        graphics.drawLine(750, 50, 775, 75);

        // Рисуем цифру 0 на начале координат
        graphics.drawString("0", 735, 445);


        // Деления на оси Y
        graphics.drawLine(740, 420, 760, 420);
        graphics.drawLine(740, 390, 760, 390);
        graphics.drawLine(740, 360, 760, 360);
        graphics.drawLine(740, 330, 760, 330);
        graphics.drawLine(740, 300, 760, 300);
        graphics.drawLine(740, 270, 760, 270);
        graphics.drawLine(740, 240, 760, 240);
        graphics.drawLine(740, 210, 760, 210);
        graphics.drawLine(740, 180, 760, 180);
        graphics.drawLine(740, 150, 760, 150);
        graphics.drawString("1", 730, 425);
        graphics.drawString("2", 730, 395);
        graphics.drawString("3", 730, 365);
        graphics.drawString("4", 730, 335);
        graphics.drawString("5", 730, 305);
        graphics.drawString("6", 730, 275);
        graphics.drawString("7", 730, 245);
        graphics.drawString("8", 730, 212);
        graphics.drawString("9", 730, 185);
        graphics.drawString("10", 725, 155);

        graphics.drawLine(740, 480, 760, 480);
        graphics.drawLine(740, 510, 760, 510);
        graphics.drawLine(740, 540, 760, 540);
        graphics.drawLine(740, 570, 760, 570);
        graphics.drawLine(740, 600, 760, 600);
        graphics.drawLine(740, 630, 760, 630);
        graphics.drawLine(740, 660, 760, 660);
        graphics.drawLine(740, 690, 760, 690);
        graphics.drawLine(740, 720, 760, 720);
        graphics.drawLine(740, 750, 760, 750);
        graphics.drawString("-1", 725, 485);
        graphics.drawString("-2", 725, 515);
        graphics.drawString("-3", 725, 545);
        graphics.drawString("-4", 725, 575);
        graphics.drawString("-5", 725, 605);
        graphics.drawString("-6", 725, 635);
        graphics.drawString("-7", 725, 665);
        graphics.drawString("-8", 725, 695);
        graphics.drawString("-9", 725, 725);
        graphics.drawString("-10", 720, 755);


        // Деления на оси X
        graphics.drawLine(780, 440, 780, 460);
        graphics.drawLine(810, 440, 810, 460);
        graphics.drawLine(840, 440, 840, 460);
        graphics.drawLine(870, 440, 870, 460);
        graphics.drawLine(900, 440, 900, 460);
        graphics.drawLine(930, 440, 930, 460);
        graphics.drawLine(960, 440, 960, 460);
        graphics.drawLine(990, 440, 990, 460);
        graphics.drawLine(1020, 440, 1020, 460);
        graphics.drawLine(1050, 440, 1050, 460);
        graphics.drawString("1", 780, 475);
        graphics.drawString("2", 810, 475);
        graphics.drawString("3", 840, 475);
        graphics.drawString("4", 870, 475);
        graphics.drawString("5", 900, 475);
        graphics.drawString("6", 930, 475);
        graphics.drawString("7", 960, 475);
        graphics.drawString("8", 990, 475);
        graphics.drawString("9", 1020, 475);
        graphics.drawString("10", 1045, 475);

        graphics.drawLine(720, 440, 720, 460);
        graphics.drawLine(690, 440, 690, 460);
        graphics.drawLine(660, 440, 660, 460);
        graphics.drawLine(630, 440, 630, 460);
        graphics.drawLine(600, 440, 600, 460);
        graphics.drawLine(570, 440, 570, 460);
        graphics.drawLine(540, 440, 540, 460);
        graphics.drawLine(510, 440, 510, 460);
        graphics.drawLine(480, 440, 480, 460);
        graphics.drawLine(450, 440, 450, 460);
        graphics.drawString("-1", 715, 475);
        graphics.drawString("-2", 685, 475);
        graphics.drawString("-3", 655, 475);
        graphics.drawString("-4", 625, 475);
        graphics.drawString("-5", 595, 475);
        graphics.drawString("-6", 565, 475);
        graphics.drawString("-7", 535, 475);
        graphics.drawString("-8", 505, 475);
        graphics.drawString("-9", 475, 475);
        graphics.drawString("-10", 440, 475);

        // Рисуем линии красным цветом
        /*
        Если координаты не равны 999, то рисуем, иначе не рисуем
        999 - это условное значение, которое в нашем случае означает, что координата пуста
         */
        graphics.setColor(Color.RED);
        if (x_1 != 999 && y_1 != 999 && x_2 != 999 && y_2 != 999) {
            graphics.drawLine(750 + 30 * x_1, 450 - 30 * y_1, 750 + 30 * x_2, 450 - 30 * y_2);
        }
        if (x_2 != 999 && y_2 != 999 && x_3 != 999 && y_3 != 999) {
            graphics.drawLine(750 + 30 * x_2, 450 - 30 * y_2, 750 + 30 * x_3, 450 - 30 * y_3);
        }
        if (x_3 != 999 && y_3 != 999 && x_4 != 999 && y_4 != 999) {
            graphics.drawLine(750 + 30 * x_3, 450 -30 * y_3, 750 + 30 * x_4, 450 - 30 * y_4);
        }
        if (x_4 != 999 && y_4 != 999 && x_5 != 999 && y_5 != 999) {
            graphics.drawLine(750 + 30 * x_4, 450 - 30 * y_4, 750 + 30 * x_5, 450 - 30 * y_5);
        }

        graphics.dispose();

        // Показываем изображение на клиенте (в браузере)
        resp.setContentType("image/png");
        OutputStream outputStream = resp.getOutputStream();
        ImageIO.write(image, "png", outputStream);
        outputStream.close();

    }

    /**
     * Метод получающий параметры запроса, содержащие значения координат точек
     * метод срабатывает при получении запроса типа POST
     *
     * @param req объект-запрос
     * @param resp объект-ответ
     * @throws ServletException исключение типа ServletException
     * @throws IOException исключение типа IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // Присваиваем объектам значения параметров из объекта-запроса
        /*
        При этом проверяем если параметр пуст, т.е. равен "", то присваиваем значение 999
        Если не пуст, то присваиваем значение параметра.
        999 - это условное значение, которое в нашем случае означает, что координата пуста
         */
        x_1 = Integer.parseInt(req.getParameter("x_1") == "" ? "999" : req.getParameter("x_1"));
        x_2 = Integer.parseInt(req.getParameter("x_2") == "" ? "999" : req.getParameter("x_2"));
        x_3 = Integer.parseInt(req.getParameter("x_3") == "" ? "999" : req.getParameter("x_3"));
        x_4 = Integer.parseInt(req.getParameter("x_4") == "" ? "999" : req.getParameter("x_4"));
        x_5 = Integer.parseInt(req.getParameter("x_5") == "" ? "999" : req.getParameter("x_5"));

        y_1 = Integer.parseInt(req.getParameter("y_1") == "" ? "999" : req.getParameter("y_1"));
        y_2 = Integer.parseInt(req.getParameter("y_2") == "" ? "999" : req.getParameter("y_2"));
        y_3 = Integer.parseInt(req.getParameter("y_3") == "" ? "999" : req.getParameter("y_3"));
        y_4 = Integer.parseInt(req.getParameter("y_4") == "" ? "999" : req.getParameter("y_4"));
        y_5 = Integer.parseInt(req.getParameter("y_5") == "" ? "999" : req.getParameter("y_5"));

        // Выызываем метод doGet
        doGet(req, resp);

    }

}
