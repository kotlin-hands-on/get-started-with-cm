# Get started with Compose Multiplatform

## Incremental projects to accompany tutorial

This repository contains four seperate projects, to accompany the [Get started with Compose Multiplatform tutorial](https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-getting-started.html). You can open and execute these, as an alternative to following the tutorial manually. The projects are as follows:

### ComposeDemoStage1

In this stage we have:

1. Created a project via the [Kotlin Multiplatform Wizard](https://kmp.jetbrains.com/)
2. Included the [kotlinx-datetime](https://github.com/Kotlin/kotlinx-datetime) library
3. Added a sample function called `todaysDate`
4. Invoked this function from the `App` composable

This completes the tutorial as far as the [Modify the project](https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-modify-project.html) section.

### ComposeDemoStage2

In this stage we have:

1. Rewritten the `App` composable from scratch
2. Removed any unecessary imports and code
2. Altered the `main` function, so the desktop window is correct
3. Included support for user input, and styled the composable
4. Added and invoked a `currentTimeAt` function

This completes the tutorial as far as the [Improve the style](https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-new-project.html#improve-the-style) section.

### ComposeDemoStage3

In this stage we have refactored the design of the application. Users can now select items from a dropdown menu, instead of having to type into a text field.

This completes the tutorial as far as the [Refactor the design](https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-new-project.html#refactor-the-design) section.

### ComposeDemoStage4

In this stage we have:

1. Included images in the resources folder of the application
2. Enhanced the dropdown menu, so each item is displayed with an image

This completes the tutorial.