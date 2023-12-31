Урок 4. Зависимости в тестах

### Задание 1. Ответьте письменно на вопросы:

1)  Почему использование тестовых заглушек может быть полезным при написании модульных тестов?
> Использование **тестовых заглушек** может быть полезным при написании модульных тестов по нескольким причинам.
> **Тестовые заглушки** - это объекты, которые заменяют реальные зависимости в коде и имитируют ожидаемое поведение этих зависимостей. Они позволяют изолировать код, который мы хотим протестировать, от внешних зависимостей, таких как база данных, файловая система или сетевые запросы.
> Вот несколько преимуществ использования тестовых заглушек:
> 1. **Изоляция**: Тестовые заглушки позволяют изолировать код от внешних зависимостей, что делает тесты более предсказуемыми и стабильными.
> 2. **Скорость**: Тесты с использованием заглушек выполняются быстрее, так как они не требуют реального взаимодействия с внешними системами.
> 3. **Покрытие**: Заглушки позволяют создавать различные сценарии и условия для тестирования, которые могут быть сложными или невозможными в реальной среде.
> 4. **Устранение ошибок**: Использование заглушек помогает выявить и исправить ошибки и проблемы в коде на ранних этапах разработки.

2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?
> Если вам нужно проверить, что метод был вызван с определенными аргументами, то вы можете использовать **тестовые заглушки с параметрами**. Эти заглушки позволяют проверить, что метод был вызван с определенными аргументами и возвращенное значение соответствует ожидаемому.

3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?
> Если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода, то вы можете использовать тестовые заглушки с возвращаемыми значениями. Эти заглушки позволяют задать ожидаемое возвращаемое значение или исключение для метода.

4) Какой тип тестовой заглушки вы бы использовали для имитации  взаимодействия с внешним API или базой данных?
> Если вам нужно имитировать взаимодействие с внешним API или базой данных, то вы можете использовать тестовые заглушки с возвращаемыми значениями. Эти заглушки позволяют задать ожидаемое возвращаемое значение или исключение для метода.

---

### Задание 2.

У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о книгах из базы данных. 
Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта BookRepository.
