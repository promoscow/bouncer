# Bouncer
Простейшее приложение для проверки доступа к виртуальной машине.

## Как это работает и зачем это нужно.
Я написал это приложение, когда не смог пробиться на виртуальный сервер, причём, было непонятно, действительно ли на сервер нет доступа извне или это я такой мудак и накосячил с настройками Kafka.

Приложение выполняет одну маленькую задачу: в ответ на GET-запрос отвечает, что всё окей.

## Сборка.
Я обычно делаю это из IDE. Task bootJar.
    
Далее terminal: 

    java -jar <путь_к_приложению>/bouncer_.jar
    
После этого Вы должны увидеть жизнерадостный логотип Spring - значит, всё ок.
