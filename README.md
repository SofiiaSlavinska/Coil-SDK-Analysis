# Coil SDK Research Project: Image Loading & Optimization

## Опис бібліотеки
[cite_start]**Coil (Coroutine Image Loader)** — це сучасна бібліотека для завантаження зображень у середовищі Android, яка повністю побудована на Kotlin Coroutines. [cite_start]На відміну від класичних рішень, Coil є максимально легкою (~200KB) та забезпечує нативну підтримку сучасних функцій мови Kotlin.

### Призначення:
* Оптимізоване завантаження медіаконтенту з мережі, ресурсів та файлової системи.
* Автоматичне керування пам'яттю та трирівневе кешування.
* Виконання графічних трансформацій без перевантаження Main Thread.

## Інструкція зі встановлення
Для інтеграції Coil у проєкт необхідно додати наступні залежності у файл `build.gradle.kts (Module :app)`:

```kotlin
dependencies {
    // Основний модуль Coil
    implementation("io.coil-kt:coil:2.6.0")
    
    // Модулі для підтримки форматів (додано за сценарієм)
    implementation("io.coil-kt:coil-gif:2.6.0")
    implementation("io.coil-kt:coil-svg:2.6.0")
}
