Symulator ZOO

Cel: symulacja podstawowych zachowań różnych zwierząt. Świetny do pokazania dziedziczenia, polimorfizmu oraz interfejsów opisujących „zdolności”.

### Lista kontrolna
1. Start projektu [02][04]
   - Pakiety: `zoo.domain`, `zoo.service`, `zoo.app`. [04]
   - `zoo.app.Simulator` z `main`. [03]

2. Baza abstrakcyjna [08][05b]
   - `abstract class Animal` z polami: `name` (String), `age` (int). [08][05b]
   - Metody: `eat()`, `sleep()`, `String sound()` (abstrakcyjna), `String info()`. [08]

3. Hierarchia klas [07]
   - `Mammal`, `Bird`, `Reptile` rozszerzają `Animal` (mogą dodawać własne pola np. `furColor`, `wingspan`). [07]
   - Przykładowe konkretne: `Lion`, `Elephant`, `Eagle`, `Penguin`, `Iguana`. [07]

4. Interfejsy – zdolności [08]
   - `Swimmable`, `Flyable`, `Trainable` z odpowiednimi metodami (`swim()`, `fly()`, `performTrick()`). [08]
   - Wykorzystaj polimorfizm: kolekcje typu interfejsowego i wywołania zachowań na miksie obiektów. [07]

5. Enkapsulacja i niezmienniki [05][05b]
   - Pola prywatne + gettery; walidacje w konstruktorach (`age >= 0`). [06]
   - Stałe np. `MAX_AGE_MAMMAL`. [05b]

6. Mini-silnik symulacji [03]
   - `SimulationService`: harmonogramuje „tury” (jedzenie, sen, dźwięk), generuje raport z aktywności. [03]
   - `ReportingService`: CSV/JSON z aktywności zwierząt (interfejs `Exportable`). [08]

7. Demo [03]
   - W `Simulator.main` zainicjuj różne zwierzęta, przypisz zdolności, uruchom kilka tur, wydrukuj raport. [03]

8. Rozszerzenia (opcjonalne) [07][08]
   - Klasa abstrakcyjna `Habitat` (woda/ląd/powietrze) i przypisywanie zwierząt do siedlisk. [08]
   - Interfejs `Feedable` z różnymi strategiami karmienia. [08]

9. Kroki Git/GitHub [02]
   - README z rysunkiem prostego diagramu klas (PNG w repo). [02]
   - Branch `feature/simulation-cycle`, PR, opis zmian, tag `v0.1.0`. [02]

Co ćwiczysz: klasy abstrakcyjne i interfejsy (08), dziedziczenie/polimorfizm (07), konstruktory (06), kapsułkowanie (05), pola/stałe (05b), pakiety i `main` (04–03), workflow Git (02), modelowanie obiektów (01).

