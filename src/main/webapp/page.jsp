<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Построение фигуры</title>
</head>
<body>

<!-- Yandex.Metrika informer -->
<a href="https://metrika.yandex.ru/stat/?id=46800762&amp;from=informer"
   target="_blank" rel="nofollow"><img src="https://informer.yandex.ru/informer/46800762/3_1_FFFFFFFF_EFEFEFFF_0_pageviews"
                                       style="width:88px; height:31px; border:0;" alt="Яндекс.Метрика" title="Яндекс.Метрика: данные за сегодня (просмотры, визиты и уникальные посетители)" class="ym-advanced-informer" data-cid="46800762" data-lang="ru" /></a>
<!-- /Yandex.Metrika informer -->

<!-- Yandex.Metrika counter -->
<script type="text/javascript" >
    (function (d, w, c) {
        (w[c] = w[c] || []).push(function() {
            try {
                w.yaCounter46800762 = new Ya.Metrika({
                    id:46800762,
                    clickmap:true,
                    trackLinks:true,
                    accurateTrackBounce:true
                });
            } catch(e) { }
        });

        var n = d.getElementsByTagName("script")[0],
                s = d.createElement("script"),
                f = function () { n.parentNode.insertBefore(s, n); };
        s.type = "text/javascript";
        s.async = true;
        s.src = "https://mc.yandex.ru/metrika/watch.js";

        if (w.opera == "[object Opera]") {
            d.addEventListener("DOMContentLoaded", f, false);
        } else { f(); }
    })(document, window, "yandex_metrika_callbacks");
</script>
<noscript><div><img src="https://mc.yandex.ru/watch/46800762" style="position:absolute; left:-9999px;" alt="" /></div></noscript>
<!-- /Yandex.Metrika counter -->

<br>
    <br>
<CENTER>
    <!-- Объявляем форму в которой есть кнопка, при нажатии на которую будет
    отправлен запрос на урл /graphic тип запроса - POST-->
    <form action="graphic" method="post">
    <!--
        br - переход на новую строку
        font-size - размер шрифта
        <input type="number" - поле для ввода типа Число
        &nbsp - символ пробела
        -->
        <caption style="font-size: 12pt">Координаты 1-й точки:</caption>
        x &nbsp<input type="number" max="10" min="-10" value="${x_1}" name="x_1"/>
        y &nbsp<input type="number" max="10" min="-10" value="${y_1}" name="y_1"/>
        <br>

        <caption style="font-size: 12pt">Координаты 2-й точки:</caption>
        x &nbsp<input type="number" max="10" min="-10" value="${x_2}" name="x_2"/>
        y &nbsp<input type="number" max="10" min="-10" value="${y_2}" name="y_2"/>
        <br>

        <caption style="font-size: 12pt">Координаты 3-й точки:</caption>
        x &nbsp<input type="number" max="10" min="-10" value="${x_3}" name="x_3"/>
        y &nbsp<input type="number" max="10" min="-10" value="${y_3}" name="y_3"/>
        <br>

        <caption style="font-size: 12pt">Координаты 4-й точки:</caption>
        x &nbsp<input type="number" max="10" min="-10" value="${x_4}" name="x_4"/>
        y &nbsp<input type="number" max="10" min="-10" value="${y_4}" name="y_4"/>
        <br>

        <caption style="font-size: 12pt">Координаты 5-й точки:</caption>
        x &nbsp<input type="number" max="10" min="-10" value="${x_5}" name="x_5"/>
        y &nbsp<input type="number" max="10" min="-10" value="${y_5}" name="y_5"/>
        <br>
        <br>
        <!-- Кнопка Нарисовать-->
        <input type="submit" style="height: 40px; width: 180px; font-size: 15pt" value="Нарисовать"/>

    </form>
</CENTER>
</body>
</html>
