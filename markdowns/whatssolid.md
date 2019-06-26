# S.O.L.I.D

Check the online documentation given to you.

## Single Responsibility Principle

?[What pattern is against the SRP ?]
-[ ] Strategy
-[x] God class
-[ ] Singleton

## Open-Closed Principle

## Liskov Substitution Principle

## Interface Segregation

## Dependency Inversion

## Hands-on Kata

Note : this example uses the Mockito framework. You can get general (and sufficient) informations on that mocking framework on the [official site](https://site.mockito.org/#how)

@[Refactor these classes so that AlarmTest's assertion is always green. Note you can change the test's code but not the assert part]({"stubs": ["src/main/java/com/yourself/Alarm.java","src/main/java/com/yourself/IClock.java", "src/test/java/com/yourself/AlarmTest.java"], "command": "com.yourself.AlarmTest#alarmShouldAlwaysRing"})
