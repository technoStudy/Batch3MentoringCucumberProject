Feature: Validate employees names

  Scenario: Test if the given name list fits to employee names on the page
    Given Click on Human Resources Menu
    And Click on Employees submenu
    Then Validate full names
      | teacher teacher                  |
      | Мөлдір Жәнібекқызы Жамал         |
      | Жанар Есымхановна Бельгибаева    |
      | Айше Йылдыз                      |
      | Өмирбек Райхан                   |
      | Хуршида Айтжановна Исмаилова     |
      | Нурболат Кыдырбаевич Рысдаулетов |
      | Салтанатa Бахытқызы Бейсенбек    |
      | Дана Нурлановна Усупова          |
      | Жулдыз Жаксылыккызы Шагирова     |
