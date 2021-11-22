# multithreaded_application 
A multithreaded application simulating the transfer of money from account to account.

When the application is launched, 60 accounts are created. 30 of them store funds (by default, each account has 10_000 USD). After the launch, threads are started, each of which transfers a random value to another account, after which the thread falls asleep for 1-2 seconds.

The application is scalable. It is possible to multiply the number of concurrent threads (Addaccount class, private static final int ACCOUNT_ACCOUNT = 60).

The Log4j logging system is connected.


Многопоточное приложение, имитирующее перевод денег со счета на счет.

При запуске приложения создается 60 счетов. 30 из них хранят денежные средства (по умолчанию на каждом счете 10_000 у.е.). После запуска запускаются потоки, каждый из которых переводит рандомное значение на другой счет, после чего поток засыпает на 1-2 секунды.

Приложение масштабируемое. Возможно многократное увеличение числа одновременно действующих потоков (класс AddАccount, private static final int ACCOUNT_ACCOUNT = 60).

Подключена система логгирования Лог4j.
