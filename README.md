<h1>Hibernate</h1>

<h4>
В рамках данного ДЗ была реализвана бд MySql по схеме https://github.com/Kichmarevitmo/Lesson-11.-Part-1.-Homework?tab=readme-ov-file#mybatis (Вариант 0. при создании ID использовался тип int)<br>
Были реализованы функции работы с БД в рамках задания https://github.com/Kichmarevitmo/Lesson-11.-Part-1.-Homework?tab=readme-ov-file#mybatis (Вариант 0)<br>
Замеры добавления записей в таблицу Pets тремя разными способами:<br>
MyBatis 1107 мс<br>
Hibernate 2799 мс<br>
jdbc 744 мс<br>
Замеры получения всех записей из таблицы Pets(на момент замера в таблице было 705 записей)
MyBatis 594 мс<br>
Hibernate 1642 мс<br>
jdbc 443 мс<br> </h4>
